package StepDefinationLayer;

import org.testng.Assert;

import BaseAPI.BaseApi;
import HelperClassesLayer.ReadJsonFile;
import UtilsLayer.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiStepDefination extends BaseApi {
	
	public static ReadJsonFile data;
	public static RestUtils utils;
	public static Response resp;
	@SuppressWarnings("unused")
	private static String id;
	
	@Given("Get RequestSpecification Object to hit HTTP POST Request by passing basepath as {string}")
	public void get_request_specification_object_to_hit_http_post_request_by_passing_basepath_as(String basepath) 
	{
		httpReq=getRequestSpecification().basePath(basepath);
	}
	@Given("user add contentType Header and Request body")
	public void user_add_content_type_header_and_request_body() throws Exception {
		 data=new ReadJsonFile();
		 
		httpReq.contentType(ContentType.JSON).body(data.readJsonfile());
	   
	}
	@When("user hit HTTP POST Request")
	public void user_hit_http_post_request() {
		 utils=new RestUtils();
		  resp=utils.createUser();
	    
	}
	@Then("validate status code as {int}")
	public void validate_status_code_as(Integer code) {
		
		resp.then().assertThat().statusCode(code);
	    
	}
	@Then("validate Status line a {string}")
	public void validate_status_line_a(String line) {
		resp.then().assertThat().statusLine(line);
	    
	}
	@Then("validate ContentType Header as {string}")
	public void validate_content_type_header_as(String expectedHeader) {
		String actualheader=resp.getHeader("Content-Type");
		Assert.assertEquals(expectedHeader,actualheader);
	    
	}
	@Then("capture id from responsebody")
	public void capture_id_from_responsebody() {
	    id=resp.jsonPath().getString("id");
	}

}
