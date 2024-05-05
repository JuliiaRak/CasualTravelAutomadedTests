package com.jrak.CasualTravelAutomatedTests.api;

import com.jrak.CasualTravelAutomatedTests.api.methods.GetPlacesMethod;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Optional;

public class PlaceTests {

    @Test
    public void verifyGetPlacesWorksCorrectTest() {

        GetPlacesMethod getPlacesMethod = new GetPlacesMethod();

        Optional<Response> response = getPlacesMethod.callAPIWithRetry()
                .until(rs -> rs.getBody().asString().contains("..."))
                .execute();

//        String body = response.get().getBody().asString();
//        String title = JsonPath.from(body).getString("title");
//        System.out.println(body);
//        System.out.println(title);
//
//        String body2 = getPostById.callAPIExpectSuccess().asString();
//        String title2 = JsonPath.from(body2).getString("title");
//        System.out.println(body2);
//        System.out.println(title2);

        getPlacesMethod.callAPIExpectSuccess();
        getPlacesMethod.validateResponse();
    }
}
