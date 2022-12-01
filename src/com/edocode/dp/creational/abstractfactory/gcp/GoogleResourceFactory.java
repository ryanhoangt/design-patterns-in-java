package com.edocode.dp.creational.abstractfactory.gcp;

import com.edocode.dp.creational.abstractfactory.*;
import com.edocode.dp.creational.abstractfactory.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int camMib) {
		return new GoogleCloudStorage(camMib);
	}


}
