package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAssetsLibrary extends AcrossToken {

    @Test
    public void getTest(){

        given()
                .headers("Authorization","Bearer "+ jwtToken)
                .contentType(ContentType.JSON)
                .when()
                .get("assets/table?page=0&rowsPerPage=100&order=asc&rows=100&language_id=en")
                .then()
                .log().body()
                .statusCode(200);

    }

}
