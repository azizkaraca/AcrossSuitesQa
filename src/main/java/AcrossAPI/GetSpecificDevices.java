package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSpecificDevices extends AcrossToken {

    @Test
    public void getTest() {

        given()
                .header("Authorization","Bearer "+ jwtToken )
                .contentType(ContentType.JSON)
                .when()
                .get("stations/24/devices/2880")
                .then()
                .log().body()
                .statusCode(200);

    }
}