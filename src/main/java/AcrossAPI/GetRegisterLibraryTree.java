package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetRegisterLibraryTree extends AcrossToken {

    @Test
    public void getTest(){

        given()
                .headers("Authorization","Bearer "+ jwtToken)
                .contentType(ContentType.JSON)
                .when()
                .get("library-topic-tree/registers/10866/info?extendedView=true&language_id=en")
                .then()
                .log().body()
                .statusCode(200);

    }

}
