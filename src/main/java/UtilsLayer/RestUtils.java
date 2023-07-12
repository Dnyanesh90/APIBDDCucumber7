package UtilsLayer;

import BaseAPI.BaseApi;
import io.restassured.response.Response;

public class RestUtils extends BaseApi {

	public Response createUser() {
		return httpReq.when().post();
	}

	public Response getUserDataAsPerId(String id) {
		return httpReq.when().get(id);
	}
	
	public Response deleteUserAsPerId(String id) {
		return httpReq.when().delete(id);
	}
}
