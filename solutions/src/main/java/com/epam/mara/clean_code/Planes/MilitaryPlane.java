package com.epam.mara.clean_code.Planes;

import com.epam.mara.clean_code.models.MilitaryPlaneTypes;
import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryPlaneTypes militaryPlaneType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneTypes militaryPlaneType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryPlaneType = militaryPlaneType;
    }

    public MilitaryPlaneTypes getMilitaryPlaneType() {
        return militaryPlaneType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryPlaneType +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) o;
        return militaryPlaneType == militaryPlane.militaryPlaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryPlaneType);
    }
}
