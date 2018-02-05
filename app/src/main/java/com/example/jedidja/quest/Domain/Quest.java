package com.example.jedidja.quest.Domain;

/**
 * Created by anthoniedeklerk on 2018/02/05.
 */

public class Quest {
    public QuestCategory QuestCategory;
    public String Description;

    public Quest(QuestCategory category, String description){
        QuestCategory = category;
        Description = description;
    }
}
