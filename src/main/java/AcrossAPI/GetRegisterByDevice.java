package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class GetRegisterByDevice extends AcrossToken {

    @Test
    public void getTest(){

        given()
                .headers("Authorization","Bearer "+ jwtToken)
                .contentType(ContentType.JSON)
                .when()
                .get("stations/22/assets/717/registers/table?page=0&rows=100&rowsPerPage=100&order=asc&stationId=22&machineType=assets&machineId=717&language_id=en")
                .then()
                .log().body()
                .assertThat().body("displayName",hasItems("GenPhaseAAmps")) // verify the given item placed in data
                .statusCode(200);

    }

}
