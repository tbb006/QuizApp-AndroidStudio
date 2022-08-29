package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class QuizMain extends AppCompatActivity {

    private String selectedTopicName = "";

    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView username = findViewById(R.id.Username);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if(userProfile != null){
                    String username1 = userProfile.username;
                    username.setText("Bine ai venit, " + username1);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(QuizMain.this, "Eroare", Toast.LENGTH_LONG).show();
            }
        });


        //Afisare domenii

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout csharp = findViewById(R.id.csharpLayout);
        final LinearLayout python = findViewById(R.id.pythonLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);

        final Button startBtn = findViewById(R.id.startQuiz);

        final Button LogOut = findViewById(R.id.LogOut);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Android Studio";

                java.setBackgroundResource(R.drawable.round_back_white_stroke);

                csharp.setBackgroundResource(R.drawable.round_back_white);
                python.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "C#";

                csharp.setBackgroundResource(R.drawable.round_back_white_stroke);

                java.setBackgroundResource(R.drawable.round_back_white);
                python.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "HTML";

                html.setBackgroundResource(R.drawable.round_back_white_stroke);

                csharp.setBackgroundResource(R.drawable.round_back_white);
                python.setBackgroundResource(R.drawable.round_back_white);
                java.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Python";

                python.setBackgroundResource(R.drawable.round_back_white_stroke);
                csharp.setBackgroundResource(R.drawable.round_back_white);
                java.setBackgroundResource(R.drawable.round_back_white);
                html.setBackgroundResource(R.drawable.round_back_white);

            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(QuizMain.this, "Selectează un limbaj de programare", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(QuizMain.this, QuizActivity.class);
                    intent.putExtra("Test selectat", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(QuizMain.this, MainActivity.class);
                    startActivity(intent);
            }
        });
    }
}