package wtf.meier.betteradapters.adapter.viewholders;

import android.annotation.SuppressLint;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import wtf.meier.betteradapters.R;
import wtf.meier.betteradapters.entities.Car;

/**
 * Created by meier on 29/12/2016.
 */

public class CarViewHolder extends AbstractBetterViewHolder<Car> {

    @LayoutRes
    public static final int LAYOUT = R.layout.viewholder_car;

    @BindView(R.id.viewholder_car_name)
    TextView manufacturer;
    @BindView(R.id.viewholder_car_ps)
    TextView power;

    public CarViewHolder(View itemView) {
        super(itemView);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void bind(Car car) {
        manufacturer.setText(car.getManufacturer());
        power.setText(String.format("%d PS", car.getPowerInPs()));
    }
}
