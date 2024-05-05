package com.jrak.CasualTravelAutomatedTests.api;

import com.jrak.CasualTravelAutomatedTests.api.methods.GetUserByTokenMethod;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.Test;

public class UserTests {

    private static final String TOKEN = R.TESTDATA.get("token");

    @Test
    public void verifyGetUserByTokenCorrectTest() {
        GetUserByTokenMethod getUserByTokenMethod = new GetUserByTokenMethod(TOKEN);

//        Optional<Response> response = getPlacesMethod.callAPIWithRetry()
//                .until(rs -> rs.getBody().asString().contains("..."))
//                .execute();
//        String body = response.get().getBody().asString();
//        String title = JsonPath.from(body).getString("title");
//        System.out.println(body);
//        System.out.println(title);
//
//        String body2 = getPostById.callAPIExpectSuccess().asString();
//        String title2 = JsonPath.from(body2).getString("title");
//        System.out.println(body2);
//        System.out.println(title2);

        getUserByTokenMethod.callAPIExpectSuccess();
        getUserByTokenMethod.validateResponse();
    }
}
