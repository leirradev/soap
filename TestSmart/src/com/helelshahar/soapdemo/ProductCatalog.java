package com.helelshahar.soapdemo;

import java.util.List;

import javax.jws.WebService;

import com.helelshahar.soapdemo.business.ProductServiceImpl;
import com.helelshahar.soapdemo.model.Product;


//decoupling the interface from implementation
@WebService(endpointInterface="com.helelshahar.soapdemo.ProductCatalogInterface", portName="TestMartCatalogPort"
, serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.helelshahar.soapdemo.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	/* (non-Javadoc)
	 * @see com.helelshahar.soapdemo.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	/* (non-Javadoc)
	 * @see com.helelshahar.soapdemo.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see com.helelshahar.soapdemo.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}
}
