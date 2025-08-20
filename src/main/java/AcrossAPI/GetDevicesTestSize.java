package AcrossAPI;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

public class GetDevicesTestSize extends AcrossToken {

    @Test
    public void getTest() {

        // finding the total records quantity in the requested data

        int records =
                given()
                        .headers("Authorization", "Bearer " + jwtToken) // there is blank after Bearer
                        .contentType(ContentType.JSON)
                        .when()
                        .get("stations/22/devices?grid_view=true&language_id=en?page=0&rows=100&rowsPerPage=100&order=asc&stationId=22&machineType=devices&language_id=en")
                        .then()
                        .log().body()
                        .statusCode(200)
                        .assertThat().body("id.size", Matchers.equalTo(7)) // size assertion of records quantity
                        .assertThat().body("id", Matchers.hasSize(7)) // also size assertion of records quantity
                        .assertThat().body("id", Matchers.hasItem(2691)) // assertion for id number is exist in all id
                        .assertThat().body("id", hasItem(2691)) // assertion for id number is exist in all id
                        .extract().jsonPath().getList("").size() // extraction the requested value to use later
                ;

        System.out.println("Record Numbers = "+records); // print the number of records quantity
        Assert.assertEquals(records,7); // this is also assertion for total records quantity after all


    }
}