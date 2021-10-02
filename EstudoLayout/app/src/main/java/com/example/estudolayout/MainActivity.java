package com.example.estudolayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.estudolayout.item.Item;
import com.example.estudolayout.item.itemAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Item> lista  = new ArrayList<>();

        Item item = new Item();
        item.setTitle("Sao paulo");
        item.setValue("12,99");
        item.setDias("2");
        item.setImg("sao_paulo_sp");

        Item item2 = new Item();
        item2.setTitle("belo horizonte");
        item2.setValue("12,99");
        item2.setDias("3");
        item2.setImg("belo_horizonte_mg");

        lista.add(item);
        lista.add(item2);

        RecyclerView  recyclerView =  findViewById(R.id.recicler_id);

        itemAdapter adapter = new itemAdapter(lista);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}