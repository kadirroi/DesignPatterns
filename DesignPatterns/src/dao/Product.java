package dao;

import java.util.Date;

import interFace.IProduct;

public class Product implements IProduct {

	private final String _serialNumber;
	private  Date _productDate;
	
	public Product(String _serialNumber){
		
		this._serialNumber = _serialNumber;
		this._productDate=  new Date();
		
	}
	
	
	
	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "I am product";
	}

	@Override
	public String getProductSerialNumber() {
		// TODO Auto-generated method stub
		return this._serialNumber;
	}

	@Override
	public Date getProductionDate() {
		// TODO Auto-generated method stub
		return this._productDate;
	}

	
	
}
