/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package org.lobo.patrones.flyweight.factory;

import java.util.HashSet;

// End of user code

/**
 * Description of FlyWeightFactory.
 * 
 * @author Lobo
 */
public class FlyWeightFactory {
	/**
	 * Description of the property flyWeights.
	 */
	public HashSet<FlyWeight> flyWeights = new HashSet<FlyWeight>();

	// Start of user code (user defined attributes for FlyWeightFactory)

	// End of user code

	/**
	 * The constructor.
	 */
	public FlyWeightFactory() {
		// Start of user code constructor for FlyWeightFactory)
		super();
		// End of user code
	}

	/**
	 * Description of the method getFlyWeight.
	 * @param flyWeightId 
	 * @return 
	 */
	public FlyWeight getFlyWeight(Object flyWeightId) {
		// Start of user code for method getFlyWeight
		FlyWeight getFlyWeight = null;
		return getFlyWeight;
		// End of user code
	}

	// Start of user code (user defined methods for FlyWeightFactory)

	// End of user code
	/**
	 * Returns flyWeights.
	 * @return flyWeights 
	 */
	public HashSet<FlyWeight> getFlyWeights() {
		return this.flyWeights;
	}

}
