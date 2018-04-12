package co.in.jpmorgan.test.service; 

import java.util.Collections;
import java.util.List;

import co.in.jpmorgan.test.entities.Item;
import co.in.jpmorgan.test.utils.BuyInstructionComparator;

public class ReportRanking implements Report {

	public final static String MESSAGE = "Ranking settled for outgoing: ";
	
	public void generate(List<Item> units) {
		
		Collections.sort(units, new BuyInstructionComparator());
		
		System.out.println(MESSAGE);
		
		int i=1;
		for (Item unit : units) {
			if (unit.isOutgoing()) {				
				System.out.println(i+" "+unit.getEntity());
				
				i++;
			}
		}
	}
}
