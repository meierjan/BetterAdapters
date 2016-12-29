package wtf.meier.betteradapters.entities;

import wtf.meier.betteradapters.adapter.TypeFactory;
import wtf.meier.betteradapters.adapter.Visitable;

/**
 * Created by meier on 29/12/2016.
 */

public class Car implements Visitable {
    private final String manufacturer;
    private final int powerInPs;

    public Car(String manufacterer, int powerInPs) {
        this.manufacturer = manufacterer;
        this.powerInPs = powerInPs;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerInPs() {
        return powerInPs;
    }
}
