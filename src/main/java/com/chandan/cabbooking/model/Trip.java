package com.chandan.cabbooking.model;

import lombok.NonNull;

enum TripStatus {
    IN_PROGRESS,
    FINISHED
}
public class Trip {
    private Rider rider;
    private Cab cab;
    private TripStatus status;
    private Double price;
    private Location fromPoint;
    private Location toPoint;

    public Trip(
            @NonNull final Rider rider,
            @NonNull final Cab cab,
            @NonNull final Double price,
            @NonNull final Location fromPoint,
            @NonNull final Location toPoint) {
        this.rider = rider;
        this.cab = cab;
        this.price = price;
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.status = TripStatus.IN_PROGRESS;
    }

    public void endTrip() {
        this.status = TripStatus.FINISHED;
    }
}
