package org.api;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;
import io.restassured.config.SSLConfig;

public class RestUtil {


  public void getApiTestMethod(){
  given()
      .baseUri("https://reqres.in")
      .queryParams("page",2)
      .config(config.sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation()))
      .log().all()
      .when()
      .get("/api/users")
      .then()
      .statusCode(200)
      .log().all();
  }





}
