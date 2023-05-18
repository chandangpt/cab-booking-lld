package com.chandan.cabbooking.strategies;

import com.chandan.cabbooking.model.Location;

public interface PricingStrategy {
    Double findPrice(Location fromPoint, Location toPoint);
}
