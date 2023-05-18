package com.chandan.cabbooking.database;

import com.chandan.cabbooking.exceptions.RiderAlreadyExistsException;
import com.chandan.cabbooking.exceptions.RiderNotFoundException;
import com.chandan.cabbooking.model.Rider;
import org.springframework.lang.NonNull;

import java.util.HashMap;
import java.util.Map;

public class RidersManager {
    Map<String, Rider> riders = new HashMap<>();

    public void createRider(@NonNull final Rider rider) {
        if(riders.containsKey(rider.getId())) {
            throw new RiderAlreadyExistsException();
        }
        riders.put(rider.getId(), rider);
    }

    public  Rider getRider(@NonNull final String riderId) {
        if(!riders.containsKey(riderId)) {
            throw new RiderNotFoundException();
        }
        return riders.get(riderId);
    }
}
