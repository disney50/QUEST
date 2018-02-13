package com.example.jedidja.quest.Domain;

/**
 * Created by Jedidja on 07 Feb 2018.
 */

public class Quest {
    public QuestCategories Categories;
    public String Descriptions;

    public Quest(QuestCategories categories, String descriptions) {
        Categories = categories;
        Descriptions = descriptions;
    }
}
