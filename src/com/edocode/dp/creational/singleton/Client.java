package com.edocode.dp.creational.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println(registry == registry2);
		
		LazyRegistryWithDCL lazy = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazy == lazy2);
	}

}
