package com.jrak.CasualTravelAutomatedTests.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;

@Endpoint(url = "${config.api_url}/users/me", methodType = HttpMethodType.GET)
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
@ResponseTemplatePath(path = "api/users/get_user_by_token_rs.json")
public class GetUserByTokenMethod extends AbstractApiMethodV2 {
    public GetUserByTokenMethod(String token) {
        setHeader("Authorization", token);
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}