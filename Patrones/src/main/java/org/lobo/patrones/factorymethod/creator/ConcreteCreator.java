/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package org.lobo.patrones.factorymethod.creator;

import org.lobo.patrones.factorymethod.product.ConcreteProduct;
import org.lobo.patrones.factorymethod.product.Product;


/**
 * Description of ConcreteCreator.
 * 
 * @author Lobo
 */
public class ConcreteCreator extends AbstractCreator {


	/**
	 * The constructor.
	 */
	public ConcreteCreator() {
		// Start of user code constructor for ConcreteCreator)
		super();
		// End of user code
	}

	/**
	 * Description of the method CreateProduct.
	 * @return 
	 */
	@Override
	public Product CreateProduct() {

		Product CreateProduct = new ConcreteProduct();
		return CreateProduct;

	}



}
