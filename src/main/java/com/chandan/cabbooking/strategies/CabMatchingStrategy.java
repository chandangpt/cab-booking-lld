package com.chandan.cabbooking.strategies;

import com.chandan.cabbooking.model.Cab;
import com.chandan.cabbooking.model.Location;
import com.chandan.cabbooking.model.Rider;

import java.util.List;

public interface CabMatchingStrategy {
    Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
