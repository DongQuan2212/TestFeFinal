package hcmute.edu.vn.fefinalproject.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;

import hcmute.edu.vn.fefinalproject.Activities.User.ForgotPasswordActivity;
import hcmute.edu.vn.fefinalproject.Activities.User.MainActivity;
import hcmute.edu.vn.fefinalproject.R;

public class LoginActivity extends AppCompatActivity {

    TextView tvTitle,tvSubtitle,txForgotPassword;
    ConstraintLayout btnSignIn;

    LottieAnimationView video_intro;
    Animation topAnim, botAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        topAnim = AnimationUtils.loadAnimation(this, R.anim.anim_down);
        botAnim = AnimationUtils.loadAnimation(this, R.anim.anim_up);

        txForgotPassword = findViewById(R.id.tx_forgot_password);
        tvSubtitle = findViewById(R.id.tvSubtitle);
        tvTitle = findViewById(R.id.tvTitle);
        video_intro = findViewById(R.id.video_intro);
        btnSignIn = findViewById(R.id.btn_sign_in);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        txForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
                finish();
            }
        });


        tvSubtitle.setAnimation(topAnim);
        tvTitle.setAnimation(topAnim);
        video_intro.setAnimation(botAnim);


    }
}