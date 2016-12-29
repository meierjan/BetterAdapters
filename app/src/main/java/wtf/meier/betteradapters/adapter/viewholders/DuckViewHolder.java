package wtf.meier.betteradapters.adapter.viewholders;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import wtf.meier.betteradapters.R;
import wtf.meier.betteradapters.entities.Duck;

/**
 * Created by meier on 29/12/2016.
 */

public class DuckViewHolder extends AbstractBetterViewHolder<Duck> {

    @BindView(R.id.viewholder_duck_name)
    TextView name;

    @BindView(R.id.viewholder_duck_number)
    TextView number;

    public DuckViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.viewholder_car;
    }

    @Override
    public void bind(Duck duck) {
        name.setText(duck.getName());
        number.setText(String.valueOf(duck.getDuckNumber()));
    }
}
