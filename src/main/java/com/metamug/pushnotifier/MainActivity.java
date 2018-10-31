package com.metamug.pushnotifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    public static final String TOPIC_NAME = "messages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic(TOPIC_NAME);
        Toast.makeText(this,"Subscribed to topic: "+TOPIC_NAME,Toast.LENGTH_SHORT).show();
    }
}
