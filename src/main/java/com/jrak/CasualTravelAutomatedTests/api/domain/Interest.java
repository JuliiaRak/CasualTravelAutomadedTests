package com.jrak.CasualTravelAutomatedTests.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Interest {
    private Long interestId;
    private String interestName;
    private String imgUrl;
    private Double wage;
}
