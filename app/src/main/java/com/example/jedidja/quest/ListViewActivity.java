package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.StaticRepo.QuestRepository;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    QuestRepository questRepository = new QuestRepository();

    Quest[] quests = questRepository.GetAll();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quests);

        listView = findViewById(R.id.list_view_quests);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, quests);
        listView.setAdapter(listViewAdapter);
    }
}
