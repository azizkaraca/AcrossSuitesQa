package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class _AcrossToken {


    String body = "{ \"email\": \"ppc@maseurope.com\", \"password\": \"Ppc123456!\"}";
    //String body = "{ \"email\": \"mas@maseurope.com\", \"password\": \"ma$_@8miN%\"}";
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
                .log().body()
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
    public void getFeedersTest() {

        given()
                .headers("Authorization","Bearer "+ jwtToken )
                .headers("Authorization","Bearer "+ jwtToken )
                .contentType(ContentType.JSON)
                .when()
                .get("stations/24/feeders/table?page=0&rowsPerPage=15&order=asc&rows=15&language_id=en")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200);

    }
}