package com.epam.mara.clean_code.Planes;

import com.epam.mara.clean_code.models.ExperimentalPlaneClassificationLevels;
import com.epam.mara.clean_code.models.ExperimentalPlaneTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalPlaneTypes experimentalPlaneType;
    private ExperimentalPlaneClassificationLevels classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalPlaneTypes experimentalPlaneType, ExperimentalPlaneClassificationLevels classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalPlaneType = experimentalPlaneType;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalPlaneClassificationLevels getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ExperimentalPlaneClassificationLevels classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExperimentalPlane)) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) o;
        return experimentalPlaneType == experimentalPlane.experimentalPlaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalPlaneType);
    }
}
