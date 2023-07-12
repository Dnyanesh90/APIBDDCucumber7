package HelperClassesLayer;

import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

import POJOClassesLayer.EmployeePojo;

public class ReadJsonFile {
	

	public String readJsonfile() throws Exception
	{
		
		String path = System.getProperty("user.dir") + "\\Resourses\\employee.json";

		FileReader file = new FileReader(path);
		
		ObjectMapper mapper = new ObjectMapper();

		EmployeePojo emp=mapper.readValue(file, EmployeePojo.class);

		return  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);

	}
}