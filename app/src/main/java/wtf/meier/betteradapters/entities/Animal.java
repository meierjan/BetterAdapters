package wtf.meier.betteradapters.entities;

import wtf.meier.betteradapters.adapter.Visitable;

/**
 * Created by meier on 29/12/2016.
 */

public interface Animal extends Visitable {
    /**
     * case animals have names
     */
    String getName();
}
