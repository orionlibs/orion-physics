package io.github.orionlibs.orion_physics.unit_of_measurement;

public abstract class UnitOfMeasurement
{
    //e.g. mass
    protected String name;
    //e.g. M for mass
    protected String symbol;
    //e.g. kilogram
    protected String quantityName;
    //e.g. kg
    protected String quantitySymbol;


    public UnitOfMeasurement(String name, String symbol, String quantityName, String quantitySymbol)
    {
        this.name = name;
        this.symbol = symbol;
        this.quantityName = quantityName;
        this.quantitySymbol = quantitySymbol;
    }
}
