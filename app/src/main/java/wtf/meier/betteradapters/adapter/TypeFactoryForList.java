package wtf.meier.betteradapters.adapter;

import android.view.View;

import wtf.meier.betteradapters.R;
import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder;
import wtf.meier.betteradapters.adapter.viewholders.CarViewHolder;
import wtf.meier.betteradapters.adapter.viewholders.DuckViewHolder;
import wtf.meier.betteradapters.adapter.viewholders.MouseViewHolder;
import wtf.meier.betteradapters.entities.Car;
import wtf.meier.betteradapters.entities.Duck;
import wtf.meier.betteradapters.entities.Mouse;

/**
 * Created by meier on 29/12/2016.
 */

public class TypeFactoryForList implements TypeFactory {
    @Override
    public int type(Duck duck) {
        return R.layout.viewholder_duck;
    }

    @Override
    public int type(Mouse mouse) {
        return R.layout.viewholder_mouse;
    }

    @Override
    public int type(Car car) {
        return R.layout.viewholder_car;
    }

    @Override
    public AbstractBetterViewHolder createViewHolder(View parent, int type) {
        AbstractBetterViewHolder createdViewHolder;
        switch (type) {
            case R.layout.viewholder_car:
                createdViewHolder = new CarViewHolder(parent);
                break;
            case R.layout.viewholder_duck:
                createdViewHolder = new DuckViewHolder(parent);
                break;
            case R.layout.viewholder_mouse:
                createdViewHolder = new MouseViewHolder(parent);
                break;
            default:
                // improve this
                createdViewHolder = null;
                break;
        }
        return createdViewHolder;
    }
}
