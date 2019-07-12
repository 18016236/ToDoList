package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvItem;
    ArrayList<ItemList>ItemList;
    // ArrayAdapter<ItemList>aaItems;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem=findViewById(R.id.ListViewItems);

        ItemList = new ArrayList<>();
        ItemList.add(new ItemList("MSA","1/7/2019"));
        ItemList.add(new ItemList("Go for haircut","22/9/2019"));
        adapter = new CustomAdapter(this,R.layout.row,ItemList);

        lvItem.setAdapter(adapter);
    }
}
