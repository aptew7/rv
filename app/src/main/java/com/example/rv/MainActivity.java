package com.example.rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Line> lines = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.rv);
        // создаем адаптер
        Adapter adapter = new Adapter(this, lines);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        for (int i=1; i<33; ++i){
            lines.add(new Line (" --- " + i +" --- ", R.drawable.favourite));
        }
    }
}