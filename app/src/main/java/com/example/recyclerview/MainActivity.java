package com.example.recyclerview;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<DataModel> dataModelArrayList = new ArrayList<>();
    RecyclerView recyclerView;
    RecylcerViewAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        dataModelArrayList.add(new DataModel("Spiderman", "This is Spidy"));
        dataModelArrayList.add(new DataModel("Saktiman", "I am saktiman"));
        dataModelArrayList.add(new DataModel("Logan", "I am deadpool"));
        dataModelArrayList.add(new DataModel("XMen", "I am X"));
        Toast.makeText(this, "" + dataModelArrayList.size(), Toast.LENGTH_SHORT).show();
        myAdapter = new RecylcerViewAdapter(dataModelArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }
}