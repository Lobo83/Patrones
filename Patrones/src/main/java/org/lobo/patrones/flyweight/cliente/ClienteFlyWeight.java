/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package org.lobo.patrones.flyweight.cliente;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of ClienteFlyWeight.
 * 
 * @author Lobo
 */
public class ClienteFlyWeight {
	/**
	 * Description of the property flyWeights.
	 */
	public HashSet<FlyWeight> flyWeights = new HashSet<FlyWeight>();

	/**
	 * Description of the property flyWeightFactorys.
	 */
	public HashSet<FlyWeightFactory> flyWeightFactorys = new HashSet<FlyWeightFactory>();

	// Start of user code (user defined attributes for ClienteFlyWeight)

	// End of user code

	/**
	 * The constructor.
	 */
	public ClienteFlyWeight() {
		// Start of user code constructor for ClienteFlyWeight)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for ClienteFlyWeight)

	// End of user code
	/**
	 * Returns flyWeights.
	 * @return flyWeights 
	 */
	public HashSet<FlyWeight> getFlyWeights() {
		return this.flyWeights;
	}

	/**
	 * Returns flyWeightFactorys.
	 * @return flyWeightFactorys 
	 */
	public HashSet<FlyWeightFactory> getFlyWeightFactorys() {
		return this.flyWeightFactorys;
	}

}
