package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;

public class AcrossToken {


    String login = "{ \"email\": \"ppc@maseurope.com\", \"password\": \"Ppc123456!\"}";
    //String login = "{ \"email\": \"mas@maseurope.com\", \"password\": \"ma$_@8miN%\"}";
    String jwtToken = " ";

    @BeforeClass
    public void setup() {

        baseURI="http://10.10.10.79:30256/api/v1/";
        //baseURI="http://192.168.200.160:30081/api/v1/";

        given()
                .contentType(ContentType.JSON)
                .body(login)
                .when()
                .post("session/login")
                .then()
                .assertThat()
                //.log().body()
                .statusCode(200);

        jwtToken = given()
                .contentType(ContentType.JSON)
                .body(login)
                .when()
                .post("session/login")
                .jsonPath()
                .get("jwtToken");
    }

}