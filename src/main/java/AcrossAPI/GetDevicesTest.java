package AcrossAPI;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetDevicesTest extends AcrossToken {

    @Test
    public void getTest() {

        // test for given index of data and find first id and finding displayName with found id

        int IdForName =
                given()
                        .headers("Authorization", "Bearer " + jwtToken)
                        .contentType(ContentType.JSON)
                        .when()
                        .get("stations/22/devices?grid_view=true&language_id=en?page=0&rows=100&rowsPerPage=100&order=asc&stationId=22&machineType=devices&language_id=en")
                        .then()
                        .statusCode(200)
//                        .extract().path("[5].'id'");
                        .extract().jsonPath().getInt("[5].'id'");

        String displayName =
                given()
                        .headers("Authorization", "Bearer " + jwtToken)
                        .contentType(ContentType.JSON)
                        .when()
                        .get("stations/22/devices?grid_view=true&language_id=en?page=0&rows=100&rowsPerPage=100&order=asc&stationId=22&machineType=devices&language_id=en")
                        .then()
//                        .log().body()
                        .statusCode(200)
                        .extract().jsonPath().getString("findAll { it.id == " + IdForName + " }.displayName");

        System.out.println(IdForName+ " ID Display Name = " +displayName);

    }
}