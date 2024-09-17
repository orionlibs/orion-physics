package io.github.orionlibs.orion_physics.unit_of_measurement;

import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.KiloMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.MegaMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.MilliMultiplier;

public class UnitMultipliers
{
    public static final KiloMultiplier kilo;
    public static final MegaMultiplier mega;
    public static final MilliMultiplier milli;

    static
    {
        kilo = new KiloMultiplier();
        mega = new MegaMultiplier();
        milli = new MilliMultiplier();
    }
}
