package vea.itm.jade2015.taxServices;
public class HardcodedTax implements TaxService {

	public double getTax(TaxObject customer) {
		
		if(customer.getCountryCode().equals("UK")){
			return 0.04d;
		}
		else if(customer.getCountryCode().equals("RUS")){
			return 0.03d;
		}
		else if(customer.getCountryCode().equals("US")){
			return 0.05d;
		}
		else if(customer.getCountryCode().equals("KR")){
			return 0.06d;
		}
		else if(customer.getCountryCode().equals("JP")){
			return 0.08d;
		}
		else if(customer.getCountryCode().equals("EST")){
			return 0.06d;
		}
		else if(customer.getCountryCode().equals("LT")){
			return 0.03d;
		}
		else if(customer.getCountryCode().equals("LVL")){
			return 0.04d;
		}
		else if(customer.getCountryCode().equals("FR")){
			return 0.09d;
		}
		else if(customer.getCountryCode().equals("DE")){
			return 0.08d;
		}
		
		return 0;
	}

}
