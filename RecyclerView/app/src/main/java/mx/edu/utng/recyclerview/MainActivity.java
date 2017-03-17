package mx.edu.utng.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvList = (RecyclerView)findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);


        LinearLayoutManager manager = new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Jimena","33 year old", R.drawable.jimea));




    }
}
