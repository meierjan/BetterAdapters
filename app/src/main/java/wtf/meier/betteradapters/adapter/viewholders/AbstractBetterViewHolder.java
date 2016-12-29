package wtf.meier.betteradapters.adapter.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by meier on 29/12/2016.
 */

public abstract class AbstractBetterViewHolder<T> extends RecyclerView.ViewHolder {
    AbstractBetterViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public abstract void bind(T element);
}
