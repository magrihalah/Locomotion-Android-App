package com.example.locomotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    float v=0;
    private Button joinAccountButton ;
    private EditText inputUsername , inputPassword ;
    private TextView resetPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        joinAccountButton = findViewById(R.id.login_button);
        inputUsername = findViewById(R.id.login_useranme);
        inputPassword = findViewById(R.id.login_password);
        resetPassword = findViewById(R.id.login_forgotten_password);


        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Forgotten.class);
                startActivity(intent);
            }
        });

        joinAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { userLogin(); }

            private void userLogin() {

                String email = inputUsername.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                ////// VERIFIER SI LES CHAMPS NE SONT PAS EMPTY //////

                if (email.isEmpty()) {
                    inputUsername.setError("Saisissez votre nom d'utilisateur !");
                    inputUsername.requestFocus();
                    return;
                }

                if (password.isEmpty()){
                    inputPassword.setError("Saisissez votre mot de passe !");
                    inputPassword.requestFocus();
                    return;
                }

                ////// VERIFIER SI LE MOT DE PASSE EST VALIDE //////

                if (password.length() < 4) {
                    inputPassword.setError("Votre mot de passe doit contenir au moins 4 caractères !");
                    inputPassword.requestFocus();
                    return;
                }
            }
        });





    }
}