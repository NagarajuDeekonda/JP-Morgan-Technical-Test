package co.in.jpmorgan.test.service; 

import java.util.List;

import co.in.jpmorgan.test.entities.Item;

public class ReportUSDOutgoing implements Report {

	public final static String MESSAGE = "Amount in USD settled outgoing: ";
	
	public void generate(List<Item> units) {
		
		System.out.println(MESSAGE);
		
		for (Item unit : units) {			
			if (unit.isOutgoing()) {
				String amount = unit.getAmountUSD().toString();
				System.out.println(unit.getSettlementDate()+amount);
			}
		}
		
	}

}
