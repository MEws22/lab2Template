/*
 * generated by Xtext 2.22.0
 */
package at.ac.tuwien.big;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CpsmlStandaloneSetup extends CpsmlStandaloneSetupGenerated {

	public static void doSetup() {
		new CpsmlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
