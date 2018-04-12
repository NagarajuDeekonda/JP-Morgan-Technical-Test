package co.in.jpmorgan.test;

import java.util.List;

import co.in.jpmorgan.test.entities.Item;
import co.in.jpmorgan.test.service.Report;
import co.in.jpmorgan.test.service.ReportFactory;
import co.in.jpmorgan.test.service.ReportType;
import co.in.jpmorgan.test.utils.DataMapper;


public class App 
{
    public static void main( String[] args )
    {
    	ReportFactory reportFactory = new ReportFactory();

    	List<Item> units = null;
    	
    	try {
			units = DataMapper.proceed();
		} catch (java.text.ParseException e) {
		}
    	
        Report reportUSDIncoming = reportFactory.getReport(ReportType.USD_INCOMING);

        reportUSDIncoming.generate(units);

        Report reportUSDOutgoing = reportFactory.getReport(ReportType.USD_OUTGOING);

        reportUSDOutgoing.generate(units);

        Report reportRanking = reportFactory.getReport(ReportType.RANKING);

        reportRanking.generate(units);
    }
    
    
}
