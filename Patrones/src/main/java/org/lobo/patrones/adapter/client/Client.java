/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package org.lobo.patrones.adapter.client;

import org.lobo.patrones.adapter.interfaz.Adapter;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Client.
 * 
 * @author Lobo
 */
public class Client {
	/**
	 * Description of the property adapters.
	 */
	public Adapter adapters = null;

	// Start of user code (user defined attributes for Client)

	// End of user code

	/**
	 * The constructor.
	 */
	public Client() {
		// Start of user code constructor for Client)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Client)

	// End of user code
	/**
	 * Returns adapters.
	 * @return adapters 
	 */
	public Adapter getAdapters() {
		return this.adapters;
	}

	/**
	 * Sets a value to attribute adapters. 
	 * @param newAdapters 
	 */
	public void setAdapters(Adapter newAdapters) {
		
		this.adapters=newAdapters;
	}

}
