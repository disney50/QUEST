package com.example.jedidja.quest.StaticRepo;

import com.example.jedidja.quest.Domain.Quest;
import com.example.jedidja.quest.Domain.QuestCategory;

/**
 * Created by anthoniedeklerk on 2018/02/05.
 */

public class QuestRepository {

    public Quest[] GetAll(){
        return new Quest[]{
            new Quest(QuestCategory.HTML, "Build website backbone using HTML"),
            new Quest(QuestCategory.DESIGN,  "Build 1 page prototype"),
            new Quest(QuestCategory.ANDROID,   "Implement prototype"),
            new Quest(QuestCategory.DESIGN, "Research screenshots of list apps"),
                new Quest(QuestCategory.BOOTSTRAP, "Implement Bootstrap in website")
        };

    }
}
