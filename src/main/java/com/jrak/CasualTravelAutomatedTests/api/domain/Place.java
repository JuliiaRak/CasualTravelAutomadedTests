package com.jrak.CasualTravelAutomatedTests.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Data
@Getter
@Setter
public class Place {
    private Long placeId;
    private Long googleId;
    private String nameForUser;
    private Location location;
    private int visitTime;
    private Float visitCost;
    private List<Interest> categories;
}
