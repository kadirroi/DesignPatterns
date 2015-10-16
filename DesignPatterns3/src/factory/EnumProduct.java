package factory;

import dao.ProductOne;
import dao.ProductThird;
import dao.ProductTwo;

public enum EnumProduct {
	
	PRODUCT_ONE(ProductOne.class.getName(),ProductOne.class),
	PRODUCT_TWO(ProductTwo.class.getName(),ProductTwo.class),
	PRODUCT_THÝRD(ProductThird.class.getName(),ProductThird.class);
	
	private final String  _productClassName;
	private final Class<?> _classType; 
	 
	private EnumProduct(String productClassName,Class<?> classType)
	{
		this._productClassName =productClassName;
		this._classType=classType;
		
	}

	public String get_productClassName() {
		return _productClassName;
	}

	public Class<?> get_classType() {
		return _classType;
	}
	
	
	
}
