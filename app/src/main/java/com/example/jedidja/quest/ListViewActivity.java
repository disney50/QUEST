package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.StaticRepo.QuestRepo;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    /* public static Integer[] explore = {R.drawable.explore_black_36dp,
            R.drawable.explore_black_36dp,
            R.drawable.explore_black_36dp,
            R.drawable.explore_black_36dp,
            R.drawable.explore_black_36dp};

    public static String[] category = {"HTML", "DESIGN", "ANDROID", "DESIGN", "BOOTSTRAP"};

    public static Integer[] stripe = {R.drawable.stripe_purple_56x0dp,
            R.drawable.stripe_purple_56x0dp,
            R.drawable.stripe_purple_56x0dp,
            R.drawable.stripe_purple_56x0dp,
            R.drawable.stripe_purple_56x0dp};

    public static String[] description = {"Build website backbone using HTML",
            "Build 1 page prototype",
            "Implement prototype",
            "Research screenshots of list apps",
            "Implement Bootstrap in website"};

    public static Integer[] arrow = {R.drawable.arrow_purple_24dp,
            R.drawable.arrow_purple_24dp,
            R.drawable.arrow_purple_24dp,
            R.drawable.arrow_purple_24dp,
            R.drawable.arrow_purple_24dp}; */

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
