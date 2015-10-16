package client;

import factory.EnumProduct;
import factory.ProductFactory;
import interFace.IProduct;

public class ClientA {

	public ClientA() {

	}

	public void doSomeClientAJob() {

		IProduct product;
		try {
			product = new ProductFactory().makeProduct(EnumProduct.PRODUCT_ONE);
			System.out.println("Product Name " + product.getProductName());
			System.out.println("Product Serial Number"
					+ product.getProductSerialNumber());
			
			product= new ProductFactory().makeProduct(EnumProduct.PRODUCT_TWO);
			System.out.println("Product Name " + product.getProductName());
			System.out.println("Product Serial Number"
					+ product.getProductSerialNumber());
			
			product= new ProductFactory().makeProduct(EnumProduct.PRODUCT_THÝRD);
			System.out.println("Product Name " + product.getProductName());
			System.out.println("Product Serial Number"
					+ product.getProductSerialNumber());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
