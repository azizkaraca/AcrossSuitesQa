package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetDevices extends AcrossToken {

    @Test
    public void getTest() {

        given()
                .headers("Authorization","Bearer "+ jwtToken )
                .contentType(ContentType.JSON)
                .when()
                .get("stations/22/devices?grid_view=true&language_id=en?page=0&rows=100&rowsPerPage=100&order=asc&stationId=22&machineType=devices&language_id=en")
                .then()
                .log().body()
                .statusCode(200);

    }
}