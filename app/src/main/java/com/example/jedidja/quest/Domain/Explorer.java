package com.example.jedidja.quest.Domain;

/**
 * Created by anthoniedeklerk on 2018/02/07.
 */

public class Explorer {
   public String Name;
   public String Surname;
   public String Email;
   public Rank Rank;
   public String Avatar;
   public Gender Gender;

   public Explorer(String name, String surname, String email, Rank rank, String avatar, Gender gender)
   {
       Name = name;
       Surname = surname;
       Email = email;
       Rank = rank;
       Avatar = avatar;
       Gender = gender;
   }

}
