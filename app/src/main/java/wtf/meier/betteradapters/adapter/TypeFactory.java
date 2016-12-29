package wtf.meier.betteradapters.adapter;

import android.view.View;

import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder;
import wtf.meier.betteradapters.entities.Car;
import wtf.meier.betteradapters.entities.Duck;
import wtf.meier.betteradapters.entities.Mouse;

/**
 * Created by meier on 29/12/2016.
 */

public interface TypeFactory {
    int type(Duck duck);

    int type(Mouse mouse);

    int type(Car car);

    AbstractBetterViewHolder createViewHolder(View parent, int type);
}
