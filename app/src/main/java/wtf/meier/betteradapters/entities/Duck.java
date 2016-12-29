package wtf.meier.betteradapters.entities;

import android.annotation.SuppressLint;

import wtf.meier.betteradapters.adapter.TypeFactory;

/**
 * Created by meier on 29/12/2016.
 */

public class Duck implements Animal {

    private static int instanceId = 0;
    private String name;
    private int duckNumber;

    @SuppressLint("DefaultLocale")
    public Duck() {
        duckNumber = ++instanceId;
        name = String.format("Duck-%d", duckNumber);
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }

    @Override
    public String getName() {
        return name;
    }

    public int getDuckNumber() {
        return duckNumber;
    }
}
