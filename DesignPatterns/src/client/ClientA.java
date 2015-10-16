package client;

import factory.ProductFactory;
import interFace.IProduct;

public class ClientA {

	
	public ClientA ()
	{
		
		
	}
	
	public void doSomeClientAJob()
	{
		IProduct product= new ProductFactory().makeProduct();
		
		System.out.println("ProductName->"+product.getProductName());
		System.out.println("Product Serial Number ->"+product.getProductSerialNumber());
		
	}
}
