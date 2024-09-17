package io.github.orionlibs.orion_physics.unit_of_measurement;

public abstract class DerivedUnitOfMeasurement extends UnitOfMeasurement
{
    protected BasicUnitOfMeasurement[] basicConstituentUnits;


    public DerivedUnitOfMeasurement(String name, String symbol, String quantityName, String quantitySymbol, BasicUnitOfMeasurement[] basicConstituentUnits)
    {
        super(name, symbol, quantityName, quantitySymbol);
        this.basicConstituentUnits = basicConstituentUnits;
    }
}
