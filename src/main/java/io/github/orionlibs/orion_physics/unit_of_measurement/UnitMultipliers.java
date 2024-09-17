package io.github.orionlibs.orion_physics.unit_of_measurement;

import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.GigaMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.KiloMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.MegaMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.MicroMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.MilliMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.NanoMultiplier;
import io.github.orionlibs.orion_physics.unit_of_measurement.multiplier.TeraMultiplier;

public class UnitMultipliers
{
    public static final KiloMultiplier kilo;
    public static final MegaMultiplier mega;
    public static final GigaMultiplier giga;
    public static final TeraMultiplier tera;
    public static final MilliMultiplier milli;
    public static final MicroMultiplier micro;
    public static final NanoMultiplier nano;

    static
    {
        kilo = new KiloMultiplier();
        mega = new MegaMultiplier();
        giga = new GigaMultiplier();
        tera = new TeraMultiplier();
        milli = new MilliMultiplier();
        micro = new MicroMultiplier();
        nano = new NanoMultiplier();
    }
}
