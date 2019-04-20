package com.alexdo.projects.debtninja.ui.mainscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.alexdo.projects.debtninja.R;
import com.alexdo.projects.debtninja.sharedpref.session.SessionManager;

public class MainActivity extends AppCompatActivity {

    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView actMonthTextView = findViewById(R.id.actMonthTextView);
        final TextView balanceTextView = findViewById(R.id.balanceTextView);
        final TextView debtTextView = findViewById(R.id.debtView);
        final ImageButton addBillImageButton = findViewById(R.id.addBillImageButton);
        session = new SessionManager(getApplicationContext());

        session.checkLogin();

    }

}
