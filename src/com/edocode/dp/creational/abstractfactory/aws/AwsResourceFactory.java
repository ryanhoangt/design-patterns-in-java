package com.edocode.dp.creational.abstractfactory.aws;

import com.edocode.dp.creational.abstractfactory.*;
import com.edocode.dp.creational.abstractfactory.Instance.Capacity;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int camMib) {
		return new S3Storage(camMib);
	}

	

}
