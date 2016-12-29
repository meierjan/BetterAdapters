package wtf.meier.betteradapters.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import wtf.meier.betteradapters.adapter.viewholders.AbstractBetterViewHolder;

/**
 *
 */
public class BetterAdapter_Visitor extends RecyclerView.Adapter<AbstractBetterViewHolder> {

    private final List<Visitable> elements;
    private final TypeFactory typeFactory;

    public BetterAdapter_Visitor(List<Visitable> elements, TypeFactory typeFactory) {
        this.elements = elements;
        this.typeFactory = typeFactory;
    }

    @Override
    public AbstractBetterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        /**
         * attention: {@link viewType} as resource
         */
        View contactView = LayoutInflater.from(context).inflate(viewType, parent, false);
        return typeFactory.createViewHolder(contactView, viewType);
    }

    @Override
    public void onBindViewHolder(AbstractBetterViewHolder holder, int position) {
        /**
         * attention: unchecked
         */
        holder.bind(elements.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return elements.get(position).type(typeFactory);
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

}
