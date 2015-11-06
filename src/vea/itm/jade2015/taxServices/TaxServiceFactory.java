package vea.itm.jade2015.taxServices;

public class TaxServiceFactory {

	public static TaxService getTaxService(String serviceName) {
		TaxService defaultService = new HardcodedTax();
		try {
			Class<?> newClass = Class.forName("vea.itm.jade2015.taxServices."+serviceName);
			return (TaxService) newClass.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return defaultService;
		} catch (InstantiationException e) {
			e.printStackTrace();
			return defaultService;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return defaultService;
		}
	}

}
