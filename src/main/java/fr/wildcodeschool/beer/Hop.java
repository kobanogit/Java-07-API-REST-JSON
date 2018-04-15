package fr.wildcodeschool.beer;

public class Hop implements Ingredient{
    private String name;
    private Double value;
    private String unit = "grams";

    public Hop(){}

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String getUnit() {
        return this.unit;
    }

}
