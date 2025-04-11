package hcmute.edu.vn.fefinalproject.Activities.User;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import hcmute.edu.vn.fefinalproject.R;

public class ProfileActivity extends AppCompatActivity {


    ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);


        btnBack = findViewById(R.id.btn_back_profile);
        btnBack.setOnClickListener(v -> finish());




    }
}