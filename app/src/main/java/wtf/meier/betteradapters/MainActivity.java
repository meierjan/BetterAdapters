package wtf.meier.betteradapters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import wtf.meier.betteradapters.adapter.BetterAdapter_Visitor;
import wtf.meier.betteradapters.adapter.TypeFactory;
import wtf.meier.betteradapters.adapter.TypeFactoryForList;
import wtf.meier.betteradapters.adapter.Visitable;
import wtf.meier.betteradapters.entities.Car;
import wtf.meier.betteradapters.entities.Duck;
import wtf.meier.betteradapters.entities.Mouse;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TypeFactory typeFactory = new TypeFactoryForList();
        List<Visitable> elementList = Arrays.asList(
                new Car("Mercedes", 625),
                new Duck(),
                new Duck(),
                new Mouse("Mickey"),
                new Duck(),
                new Duck(),
                new Mouse("Not-Donald"),
                new Duck(),
                new Duck(),
                new Mouse("Mini"),
                new Car("Clownscar", 10)
        );

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new BetterAdapter_Visitor(
                elementList,
                typeFactory
        ));
    }
}
