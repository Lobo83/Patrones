/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package org.lobo.patrones.adapter.interfaz;

import org.lobo.patrones.adapter.functionality.AdaptedClass;

// End of user code

/**
 * Description of AdapterImpl.
 * 
 * @author Lobo
 */
public class AdapterImpl implements Adapter {
	/**
	 * Description of the property adaptedClasss.
	 */
	public AdaptedClass adaptedClasss = null;
	
	// Start of user code (user defined attributes for AdapterImpl)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public AdapterImpl() {
		// Start of user code constructor for AdapterImpl)
		super();
		// End of user code
	}
	
	/**
	 * Description of the method adapta.
	 * @return 
	 */
	public Object adapta() {
		AdaptedClass adaptedClass=new AdaptedClass();
		return adaptedClass.realiza();
	}
	 
	
	 
	// Start of user code (user defined methods for AdapterImpl)
	
	// End of user code
	/**
	 * Returns adaptedClasss.
	 * @return adaptedClasss 
	 */
	public AdaptedClass getAdaptedClasss() {
		return this.adaptedClasss;
	}
	
	/**
	 * Sets a value to attribute adaptedClasss. 
	 * @param newAdaptedClasss 
	 */
	public void setAdaptedClasss(AdaptedClass newAdaptedClasss) {
	    this.adaptedClasss = newAdaptedClasss;
	}



}
