package com.example.nested;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview1);


        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);


        RootAdapter rootAdapter = new RootAdapter(
                ParentItemList());


        recyclerView.setAdapter(rootAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private List<RootItem> ParentItemList()
    {
        List<RootItem> itemList
                = new ArrayList<>();

        RootItem item
                = new RootItem(
                "Title 1",
                ChildItemList());
        itemList.add(item);
       RootItem item1
                = new RootItem(
                "Title 2",
                ChildItemList());
        itemList.add(item1);
        RootItem item2
                = new RootItem(
                "Title 3",
                ChildItemList());
        itemList.add(item2);
       RootItem item3
                = new RootItem(
                "Title 4",
                ChildItemList());
        itemList.add(item3);

        return itemList;
    }

    // Method to pass the arguments
    // for the elements
    // of child RecyclerView
    private List<ChildItem> ChildItemList()
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();

        ChildItemList.add(new ChildItem("Card 1 "));
        ChildItemList.add(new ChildItem("Card 2"));
        ChildItemList.add(new ChildItem("Card 3"));
        ChildItemList.add(new ChildItem("Card 4"));

        return ChildItemList;
    }
}