package vea.itm.jade2015.tax.services.LV;

import java.util.Calendar;

import vea.itm.jade2015.tax.TaxJarAPI;
import vea.itm.jade2015.tax.interfaces.TaxService;

public class LVTaxService implements TaxService {

	/**
	 * Return latest tax rate for Latvia, on November 18th tax rate = 0
	 * @return return tax rate
	 */
	public double getTax() {
		//Check if it's 18th November, if true then tax rate = 0, else calculate regular tax rate
		Calendar calendar = Calendar.getInstance();
		return (calendar.get(Calendar.MONTH) == Calendar.NOVEMBER && calendar.get(Calendar.DAY_OF_MONTH) == 18) ? 0 : TaxJarAPI.getTax("LV");
	}

}
