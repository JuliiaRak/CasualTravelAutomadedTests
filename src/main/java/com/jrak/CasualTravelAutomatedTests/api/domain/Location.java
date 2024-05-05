package com.jrak.CasualTravelAutomatedTests.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Location {
    private Double latitude;
    private Double longitude;
}