package com.example.jedidja.quest.StaticRepo;

import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.Domain.QuestCategories;

/**
 * Created by Jedidja on 07 Feb 2018.
 */

public class QuestRepo {

    public Quest[] GetAll() {
        return new Quest[]{
                new Quest(QuestCategories.HTML, "Build website backbone using HTML"),
                new Quest(QuestCategories.DESIGN, "Build 1 page prototype"),
                new Quest(QuestCategories.ANDROID, "Implement prototype"),
                new Quest(QuestCategories.DESIGN, "Research screenshots of list apps"),
                new Quest(QuestCategories.BOOTSTRAP, "Implement Bootstrap in website")
        };
    }
}
