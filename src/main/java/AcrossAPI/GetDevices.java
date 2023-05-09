package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetDevices {


    String body = "{ \"email\": \"ppc@maseurope.com\", \"password\": \"Ppc123456!\"}";
    String jwtToken = " ";

    @BeforeClass
    public void setup() {

        baseURI="http://10.10.10.79:30256/api/v1/";

        given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("session/login")
                .then()
                .assertThat()
                .statusCode(200);

        jwtToken = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("session/login")
                .jsonPath()
                .get("jwtToken");
    }

    @Test
    public void getTest() {

        given()
                .headers("Authorization","Bearer "+ jwtToken )
                .contentType(ContentType.JSON)
                .when()
                .get("stations/24/devices?grid_view=true&language_id=en")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);

    }
}