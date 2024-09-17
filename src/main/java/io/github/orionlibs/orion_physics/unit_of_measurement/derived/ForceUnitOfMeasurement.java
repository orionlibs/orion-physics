package io.github.orionlibs.orion_physics.unit_of_measurement.derived;

import io.github.orionlibs.orion_physics.unit_of_measurement.BasicUnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.DerivedUnitOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.UnitsOfMeasurement;

/**
 * 1N = 1kg*m/s^2
 */
public class ForceUnitOfMeasurement extends DerivedUnitOfMeasurement
{
    public ForceUnitOfMeasurement()
    {
        super("force", "F", "Newton", "N", new BasicUnitOfMeasurement[] {
                        UnitsOfMeasurement.mass, UnitsOfMeasurement.length, UnitsOfMeasurement.time});
    }
}
