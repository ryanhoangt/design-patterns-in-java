package com.edocode.dp.creational.abstractfactory;

import com.edocode.dp.creational.abstractfactory.Instance.Capacity;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
	
	Instance createInstance(Capacity capacity);
	
	Storage createStorage(int camMib);

}
