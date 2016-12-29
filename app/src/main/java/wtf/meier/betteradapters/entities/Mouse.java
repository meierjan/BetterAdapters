package wtf.meier.betteradapters.entities;

import wtf.meier.betteradapters.adapter.TypeFactory;

/**
 * Created by meier on 29/12/2016.
 */

public class Mouse implements Animal {

    private final String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }

    @Override
    public String getName() {
        return "Mimimi" + name;
    }
}
