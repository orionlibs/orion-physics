package io.github.orionlibs.orion_physics.unit_of_measurement;

public abstract class UnitMultiplier
{
    //e.g. mega
    protected String name;
    //e.g. M for mega
    protected String symbol;
    protected double quantityMultiplier;


    public UnitMultiplier(String name, String symbol, double quantityMultiplier)
    {
        this.name = name;
        this.symbol = symbol;
        this.quantityMultiplier = quantityMultiplier;
    }


    public String getName()
    {
        return name;
    }


    public String getSymbol()
    {
        return symbol;
    }


    public double getQuantityMultiplier()
    {
        return quantityMultiplier;
    }
}
