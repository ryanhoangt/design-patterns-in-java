package com.edocode.dp.creational.objectpool;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

	private BlockingQueue<T> availablePool;
	
	public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingQueue<>();
		for (int i = 0; i < count; i++) {
			availablePool.offer(creator.get());
		}
	}
	
	public T get() {
		try {
			/**
			 * This method is blocking here if pool is empty.
			 * Alternative action e.g. create new objects can be used
			 * instead of waiting.
			 */
			return availablePool.take(); 
		} catch (InterruptedException e) {
			System.err.println("take() was interrupted.");
		}
		return null;
	}
	
	public void release(T obj) {
		obj.reset();
		try {
			availablePool.put(obj);
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted.");
		}
	}
	
}
