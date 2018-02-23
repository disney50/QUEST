package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jedidja.quest.Domain.Explorer;
import com.example.jedidja.quest.Domain.Gender;
import com.example.jedidja.quest.StaticRepo.ExplorerRepository;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ExplorerRepository repo = new ExplorerRepository();

        Explorer explorer = repo.GetMockProfile();

        ImageView profileAvatarImage = findViewById(R.id.image_profile_avatar);

        profileAvatarImage.setImageResource(R.drawable.female_avatar);

        if(explorer.Gender == Gender.MALE) {
            profileAvatarImage.setImageResource(R.drawable.male_avatar);
        }

        String fullName = explorer.Name + " " + explorer.Surname;

        TextView explorerNameSurname = findViewById(R.id.text_explorer_fullname);
        explorerNameSurname.setText(fullName);


    }
}
