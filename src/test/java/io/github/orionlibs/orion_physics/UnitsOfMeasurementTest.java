package io.github.orionlibs.orion_physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.orionlibs.orion_physics.unit_of_measurement.UnitsOfMeasurement;
import io.github.orionlibs.orion_physics.unit_of_measurement.derived.ForceUnitOfMeasurement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class UnitsOfMeasurementTest extends ATest
{
    @Test
    void test_get()
    {
        ForceUnitOfMeasurement force = UnitsOfMeasurement.force;
        assertEquals("force", force.getName());
        assertEquals("F", force.getSymbol());
        assertEquals("Newton", force.getQuantityName());
        assertEquals("N", force.getQuantitySymbol());
        assertEquals("mass", force.getBasicConstituentUnits()[0].getName());
        assertEquals("length", force.getBasicConstituentUnits()[1].getName());
        assertEquals("time", force.getBasicConstituentUnits()[2].getName());
    }
}
