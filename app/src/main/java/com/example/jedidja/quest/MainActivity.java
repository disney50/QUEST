package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.StaticRepo.QuestRepository;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    QuestRepository repo = new QuestRepository();

    Quest[] quests = repo.GetAll();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        CustomAdapter customAdapter = new CustomAdapter(this, quests);
        listView.setAdapter(customAdapter);
    }
}
