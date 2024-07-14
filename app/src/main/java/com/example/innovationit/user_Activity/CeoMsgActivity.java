package com.example.innovationit.user_Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.innovationit.R;

public class CeoMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceo_msg);
    }

    public void backBtn(View view) {
        onBackPressed();
    }
}