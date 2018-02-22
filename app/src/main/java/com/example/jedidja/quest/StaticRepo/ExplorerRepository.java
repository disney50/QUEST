package com.example.jedidja.quest.StaticRepo;

import com.example.jedidja.quest.Domain.Explorer;
import com.example.jedidja.quest.Domain.Gender;
import com.example.jedidja.quest.Domain.Rank;

/**
 * Created by anthoniedeklerk on 2018/02/07.
 */

public class ExplorerRepository
{
    public Explorer[] GetAll()
    {
        return new Explorer[]
                {
                new Explorer("Ruan Botha","Botha@gmail.com", Rank.EXPERT,"model1", Gender.MALE),
                new Explorer("Kyle Venter","Venter@gmail.com", Rank.ROOKIE,"model1", Gender.MALE),
                new Explorer("Susan Lood","Lood@gmail.com",Rank.APPRENTICE, "model1", Gender.FEMALE),
                new Explorer("Mira Marais", "Marais@gmail.com", Rank.MASTER, "modell", Gender.FEMALE)
                };
    }

    public Explorer GetMockProfile(){
        return new Explorer("Jannie Vermeulen", "Vermeulen@gmail.com", Rank.JOURNEYMAN, "ASA", Gender.MALE);
    }
}
