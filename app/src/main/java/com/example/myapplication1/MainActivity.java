package com.example.myapplication1;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Model> mModelList;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new RecyclerViewAdapter(getListData());
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    private List<Model> getListData() {
        mModelList = new ArrayList<>();
        for (int i = 1; i <= 33; i++) {
            mModelList.add(new Model("TextView " + i, R.drawable.max_5));
        }
        return mModelList;
    }


}