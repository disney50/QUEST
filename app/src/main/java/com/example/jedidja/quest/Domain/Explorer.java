package com.example.jedidja.quest.Domain;

/**
 * Created by anthoniedeklerk on 2018/02/07.
 */

public class Explorer {
   public String FullName;
   public String Email;
   public Rank Rank;
   public String Avatar;
   public Gender Gender;

   public Explorer(String fullname, String email, Rank rank, String avatar, Gender gender)
   {
       FullName = fullname;
       Email = email;
       Rank = rank;
       Avatar = avatar;
       Gender = gender;
   }

}
