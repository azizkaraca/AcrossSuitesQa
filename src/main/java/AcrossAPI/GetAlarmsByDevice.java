package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAlarmsByDevice extends AcrossToken {

    @Test
    public void getTest(){

        given()
                .headers("Authorization","Bearer "+ jwtToken)
                .contentType(ContentType.JSON)
                .when()
                .get("devices/1467/alerts/table?page=0&rowsPerPage=15&order=asc&rows=15&language_id=en")
                .then()
                .log().body()
                .statusCode(200);

    }

}
