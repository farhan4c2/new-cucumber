package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReports {

	public static void jvmScript(String jsonPath) {
		
		File f = new File("C:\\Users\\Z FATHIMA FARZANA\\eclipse-workspace\\CucumberTwo\\Reports\\jvmReports");
		
		Configuration c = new Configuration(f, "Adactoin Hotel Application");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}
	
	
}
