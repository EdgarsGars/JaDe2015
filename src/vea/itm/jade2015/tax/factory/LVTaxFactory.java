package vea.itm.jade2015.tax.factory;

import vea.itm.jade2015.tax.interfaces.CountryTaxFactory;
import vea.itm.jade2015.tax.interfaces.TaxService;
import vea.itm.jade2015.tax.services.LV.LVTaxService;

public class LVTaxFactory implements CountryTaxFactory {

	public TaxService getTaxService(){
		return new LVTaxService();
	}

}
