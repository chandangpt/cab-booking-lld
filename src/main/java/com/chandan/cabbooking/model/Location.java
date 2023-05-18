package com.chandan.cabbooking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
@Getter
@AllArgsConstructor
@ToString
public class Location {
    private Double x;
    private Double y;

    public Double distance(Location loc) {
            return sqrt(pow(this.x - loc.x, 2) + sqrt(pow(this.y - loc.y, 2)));
    }
}
