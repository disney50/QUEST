package com.example.jedidja.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jedidja.quest.Domain.Explorer;
import com.example.jedidja.quest.StaticRepo.ExplorerRepository;

public class ExplorersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorers);

        Explorer[] explorers = new ExplorerRepository().GetAll();

        ListView explorersListView = findViewById(R.id.list_view_explorers);
        ExplorerAdapter adapter = new ExplorerAdapter(this, explorers);
        explorersListView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(ExplorersActivity.this, ListViewActivity.class);
                startActivity(myIntent);
            }
        };
        explorersListView.setOnItemClickListener(itemClickListener);
    }
}
