package objects;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Builder {
	public ArrayList<ExpoHalls> buildExpoHalls() throws IOException, InstantiationException, IllegalAccessException {
		ArrayList<ExpoHalls> result = new ArrayList<ExpoHalls>();
		
		File parseFile = new File("Istochniki/Vistovochiy_zali.csv");

        CSVParser parser = CSVParser.parse(parseFile, Charset.forName("UTF-8"), CSVFormat.EXCEL); 

        for (CSVRecord record : parser) {
        	result.add(parseExpoHalls(record));
        }
        
        return result;
	}
	
	private ExpoHalls parseExpoHalls(CSVRecord record) {
		ExpoHalls expoHall = new ExpoHalls();
		expoHall.name = record.get(1);
		expoHall.address = record.get(4);
		expoHall.area = record.get(6);
		expoHall.phone = record.get(16);
		expoHall.mail = record.get(17);
        return expoHall;
	}
	
	
	public ArrayList<Organisation> buildOrganisation() throws IOException, InstantiationException, IllegalAccessException {
		ArrayList<Organisation> result = new ArrayList<Organisation>();
		
		File parseFile = new File("Istochniki/Perechen_dor_organization.csv");

        CSVParser parser = CSVParser.parse(parseFile, Charset.forName("UTF-8"), CSVFormat.EXCEL);

        for (CSVRecord record : parser) {
        	result.add(parseOrganisation(record));
        }
        
        return result;
	}
	
	private Organisation parseOrganisation(CSVRecord record) {
		Organisation organis = new Organisation();
		organis.name = record.get(1);
		organis.address = record.get(2);
		organis.head = record.get(3);
		organis.phone = record.get(4);
		organis.mail = record.get(6);
        return organis;
	}
	
}
