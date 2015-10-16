package factory;

import interFace.IProduct;

public class ProductFactory {

	private static int _serialNumber = 0;

	public IProduct makeProduct(EnumProduct productType) throws Exception
	{
		try {
			String serialNumber= generateSerialNumber();
			return (IProduct) Class.forName(productType.get_productClassName()).getConstructor(String.class).newInstance(serialNumber);
					
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
			
		}
	}
	

	private String generateSerialNumber() {
		return (++_serialNumber) + "";

	}

}
