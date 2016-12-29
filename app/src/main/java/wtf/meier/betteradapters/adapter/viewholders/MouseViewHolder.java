package wtf.meier.betteradapters.adapter.viewholders;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import wtf.meier.betteradapters.R;
import wtf.meier.betteradapters.entities.Mouse;

/**
 * Created by meier on 29/12/2016.
 */

public class MouseViewHolder extends AbstractBetterViewHolder<Mouse> {

    @LayoutRes
    public static final int LAYOUT = R.layout.viewholder_mouse;

    @BindView(R.id.viewholder_mouse_name)
    TextView name;

    public MouseViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Mouse mouse) {
        name.setText(mouse.getName());
    }
}
