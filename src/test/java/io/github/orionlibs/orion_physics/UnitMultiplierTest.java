package io.github.orionlibs.orion_physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.orionlibs.orion_physics.unit_of_measurement.UnitMultipliers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//@Execution(ExecutionMode.CONCURRENT)
public class UnitMultiplierTest extends ATest
{
    @Test
    void test_multipliers()
    {
        assertEquals("kilo", UnitMultipliers.kilo.getName());
        assertEquals("k", UnitMultipliers.kilo.getSymbol());
        assertEquals(1000.0d, UnitMultipliers.kilo.getQuantityMultiplier());
        assertEquals("milli", UnitMultipliers.milli.getName());
        assertEquals("m", UnitMultipliers.milli.getSymbol());
        assertEquals(0.001d, UnitMultipliers.milli.getQuantityMultiplier());
    }
}
