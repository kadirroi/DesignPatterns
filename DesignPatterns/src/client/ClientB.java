package client;

import factory.ProductFactory;
import interFace.IProduct;

public class ClientB {

	public ClientB() {

		
	}

	
	public void doSomeClientBJob()
	{
		IProduct product =  new ProductFactory().makeProduct();
		System.out.println("Product Name ->"+ product.getProductName());
		System.out.println("Product Serial Number"+product.getProductSerialNumber());
		
		
	}
}
