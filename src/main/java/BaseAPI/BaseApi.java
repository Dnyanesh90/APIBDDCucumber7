package BaseAPI;

import java.io.FileOutputStream;
import java.io.PrintStream;

import HelperClassesLayer.ReadProperties;
import UtilsLayer.Utils;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class BaseApi {

	private static ReadProperties prop;
	private static FileOutputStream fos;
	private static PrintStream log;
	public static RequestSpecification httpReq;
	public static String path = System.getProperty("user.dir") + "\\LogFolder" + Utils.getCurrentDateTime() + ".txt";

	public RequestSpecification getRequestSpecification() {
		if (httpReq == null) {

			prop = new ReadProperties();

			try {
				fos = new FileOutputStream(path);
				log = new PrintStream(fos);

			} catch (Exception e) {
				e.printStackTrace();
			}

			httpReq = RestAssured.given().baseUri(prop.getProperty("baseuri")).log().all()
					.filter(RequestLoggingFilter.logRequestTo(log)).filter(ResponseLoggingFilter.logResponseTo(log));
		}
		return httpReq;
	}
}
