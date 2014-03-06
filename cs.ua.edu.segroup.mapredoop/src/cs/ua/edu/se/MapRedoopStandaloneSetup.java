
package cs.ua.edu.se;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MapRedoopStandaloneSetup extends MapRedoopStandaloneSetupGenerated{

	public static void doSetup() {
		new MapRedoopStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

