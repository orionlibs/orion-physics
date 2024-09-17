package io.github.orionlibs.orion_physics.unit_of_measurement;

import io.github.orionlibs.orion_physics.unit_of_measurement.basic.LengthUnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.basic.MassUnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.basic.TimeUnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.derived.ForceUnitOfMeasurement;

public class UnitsOfMeasurement
{
    public static final TimeUnitOfMeasurement time;
    public static final MassUnitOfMeasurement mass;
    public static final LengthUnitOfMeasurement length;
    public static final ForceUnitOfMeasurement force;

    static
    {
        time = new TimeUnitOfMeasurement();
        mass = new MassUnitOfMeasurement();
        length = new LengthUnitOfMeasurement();
        force = new ForceUnitOfMeasurement();
    }
}
