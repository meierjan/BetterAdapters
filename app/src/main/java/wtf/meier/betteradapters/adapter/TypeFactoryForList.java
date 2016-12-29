package wtf.meier.betteradapters.adapter;

import android.annotation.SuppressLint;
import android.view.View;

import wtf.meier.betteradapters.adapter.exception.TypeNotSupportedException;
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
        return DuckViewHolder.LAYOUT;
    }

    @Override
    public int type(Mouse mouse) {
        return MouseViewHolder.LAYOUT;
    }

    @Override
    public int type(Car car) {
        return CarViewHolder.LAYOUT;
    }

    @Override
    @SuppressLint("DefaultLocale")
    public AbstractBetterViewHolder createViewHolder(View parent, int type) {
        AbstractBetterViewHolder createdViewHolder;
        switch (type) {
            case CarViewHolder.LAYOUT:
                createdViewHolder = new CarViewHolder(parent);
                break;
            case DuckViewHolder.LAYOUT:
                createdViewHolder = new DuckViewHolder(parent);
                break;
            case MouseViewHolder.LAYOUT:
                createdViewHolder = new MouseViewHolder(parent);
                break;
            default:
                throw TypeNotSupportedException.create(String.format("LayoutType: %d", type));
        }
        return createdViewHolder;
    }
}
