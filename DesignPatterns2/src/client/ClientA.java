package client;

import factory.ProductFactory;
import interFace.IProduct;

public class ClientA {

	public ClientA()
	{
		
		
	}
	
	public void doSomeClientAJob()
	{
		try {
			
			IProduct product = new ProductFactory().makeProduct("ProductOne");
            System.out.println("Product Name "+ product.getProductName());
            System.out.println("Product Serial Number "+product.getProductSerialNumber());
			
            product= new ProductFactory().makeProduct("ProductTwo");
            System.out.println("Product Name "+ product.getProductName());
            System.out.println("Product Serial Number "+product.getProductSerialNumber());
   
            product= new ProductFactory().makeProduct("ProductThree");
            System.out.println("Product Name "+ product.getProductName());
            System.out.println("Product Serial Number "+product.getProductSerialNumber());
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
}
