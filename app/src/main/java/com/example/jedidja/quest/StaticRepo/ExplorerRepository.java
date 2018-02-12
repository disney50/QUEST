package com.example.jedidja.quest.StaticRepo;

import com.example.jedidja.quest.Domain.Explorer;
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
                new Explorer("Ruan","Botha","Botha@gmail.com", Rank.EXPERT,"model1"),
                new Explorer("Kyle","Venter","Venter@gmail.com", Rank.ROOKIE,"model1"),
                new Explorer("Susan","Lood","Lood@gmail.com",Rank.APPRENTICE, "model1"),
                };
    }
}
