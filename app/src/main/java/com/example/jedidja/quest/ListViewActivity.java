package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.StaticRepo.QuestRepo;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    QuestRepo questRepo = new QuestRepo();

    Quest[] quests = questRepo.GetAll();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, quests);
        listView.setAdapter(listViewAdapter);
    }
}
