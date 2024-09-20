package io.github.orionlibs.orion_physics;

import io.github.orionlibs.orion_physics.unit_of_measurement.UnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.derived.ForceUnitOfMeasurement;
import io.github.orionlibs.orion_tiny_math.Point;

public class Force
{
    public static final UnitOfMeasurement unitOfMeasurement;
    private Point pointOfApplication;
    private Point endpoint;
    private double magnitude;

    static
    {
        unitOfMeasurement = new ForceUnitOfMeasurement();
    }
}
