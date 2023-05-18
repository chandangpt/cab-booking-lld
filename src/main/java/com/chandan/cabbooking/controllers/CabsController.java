package com.chandan.cabbooking.controllers;

import com.chandan.cabbooking.database.CabsManager;
import com.chandan.cabbooking.database.TripsManager;
import com.chandan.cabbooking.model.Cab;
import com.chandan.cabbooking.model.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CabsController {
    private  CabsManager cabsManager;
    private TripsManager tripsManager;

    public CabsController(CabsManager cabsManager, TripsManager tripsManager) {
        this.cabsManager = cabsManager;
        this.tripsManager = tripsManager;
    }

    @RequestMapping(value="/register/cab", method = RequestMethod.POST)
    public ResponseEntity registerCab(final String cabId, final String driverName) {
        cabsManager.createCab(new Cab(cabId, driverName));
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "/update/cab/location", method = RequestMethod.POST)
    public ResponseEntity updateCabLocation(final String cabId, final Double newX, final Double newY) {
        cabsManager.updateCabLocation(cabId, new Location(newX, newY));
        return ResponseEntity.ok("");
    }

    @RequestMapping(value="/update/cab/availability", method = RequestMethod.POST)
    public ResponseEntity updateCabAvailability(final String cabId, final Boolean newAvailability) {
        cabsManager.updateCabAvailability(cabId, newAvailability);
        return ResponseEntity.ok("");
    }

    @RequestMapping(value = "/update/cab/end/trip", method = RequestMethod.POST)
    public ResponseEntity endTrip(final String cabId) {
        tripsManager.endTrip(cabsManager.getCab(cabId));
        return ResponseEntity.ok("");
    }
}
