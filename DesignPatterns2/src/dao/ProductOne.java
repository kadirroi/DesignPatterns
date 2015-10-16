package dao;

import java.util.Date;

import interFace.IProduct;

public class ProductOne implements IProduct {

	private final String _productName="ProductOne";
	private final String _serialNumber;
	private Date _productDate;

	public ProductOne(String _serialNumber) {
		// TODO Auto-generated constructor stub
		this._serialNumber = _serialNumber;
		this._productDate = new Date();
	
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "I am "+_productName;
	}

	@Override
	public String getProductSerialNumber() {
		// TODO Auto-generated method stub
		return _serialNumber;
	}

	@Override
	public Date getProductionDate() {
		// TODO Auto-generated method stub
		return _productDate;
	}

}
