package factory;

import dao.Product;
import interFace.IProduct;

public class ProductFactory {

	private static int _serialNumber = 0;

	public IProduct makeProduct() {
		String serialNumber = generateSerialNumber();
		return new Product(serialNumber);

	}

	private String generateSerialNumber() {
		return (++_serialNumber) + "";
    }



}
