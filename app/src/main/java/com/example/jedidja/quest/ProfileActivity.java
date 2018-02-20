package com.example.jedidja.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.FloatingActionButton;
import android.widget.ListView;
import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.StaticRepo.QuestRepo;


public class ProfileActivity extends AppCompatActivity {

    ListView currentListView;

    QuestRepo currentQuestRepo = new QuestRepo();

    Quest[] currentQuests = currentQuestRepo.GetAll();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        currentListView = findViewById(R.id.profile_list_view);
        ListViewAdapter profileListAdapter = new ListViewAdapter(this, currentQuests);
        currentListView.setAdapter(profileListAdapter);

        FloatingActionButton addButton = findViewById(R.id.floating_action_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chooseQuest();
            }
        });
    }

    public void chooseQuest() {

        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }
}
