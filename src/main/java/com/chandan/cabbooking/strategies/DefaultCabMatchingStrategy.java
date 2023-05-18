package com.chandan.cabbooking.strategies;

import com.chandan.cabbooking.model.Cab;
import com.chandan.cabbooking.model.Location;
import com.chandan.cabbooking.model.Rider;
import org.springframework.lang.NonNull;

import java.util.List;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {
    @Override
    public Cab matchCabToRider(@NonNull Rider rider, @NonNull List<Cab> candidateCabs, @NonNull Location fromPoint, @NonNull Location toPoint) {
        if(candidateCabs.isEmpty()) {
            return null;
        }
        return candidateCabs.get(0);
    }
}
