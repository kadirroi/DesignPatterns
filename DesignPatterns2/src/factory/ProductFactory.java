package factory;

import dao.ProductOne;
import dao.ProductTwo;
import interFace.IProduct;

public class ProductFactory {

	private static int _serialNumber = 0;

	public IProduct makeProduct(String productType) throws IllegalArgumentException
	{
		String  serialNumber= generateSerialNumber();
		 if (productType.equals("ProductOne")) {
			
			 return new ProductOne(serialNumber);
		}
		 else if (productType.equals("ProductTwo")) {
			 return new ProductTwo(serialNumber);
		}
		 else {
			throw new IllegalArgumentException("unsuportType");
		}
			 
				
	}

	public String generateSerialNumber() {

		return (++_serialNumber) + "";
	}
}
