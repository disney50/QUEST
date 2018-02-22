package com.example.jedidja.quest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jedidja.quest.Domain.Explorer;
import com.example.jedidja.quest.StaticRepo.ExplorerRepository;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ExplorerRepository repo = new ExplorerRepository();

        Explorer explorer = repo.GetMockProfile();

        TextView nameSurnameText = findViewById(R.id.text_view_explorer_name);
        nameSurnameText.setText(explorer.FullName);

        /* TextView rankText = findViewById(R.id.text_view_rank);
        rankText.setText();

        TextView genderText = findViewById(R.id.text_view_gender);
        genderText.setText(); */

        TextView emailText = findViewById(R.id.text_view_email);
        emailText.setText(explorer.Email);
    }
}
