package com.alexdo.projects.debtninja.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.alexdo.projects.debtninja.R;
import com.alexdo.projects.debtninja.sharedpref.session.SessionManager;
import com.alexdo.projects.debtninja.ui.receipt.ReceiptActivity;

public class MainActivity extends AppCompatActivity {

    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView actMonthTextView = findViewById(R.id.actMonthTextView);
        final TextView balanceTextView = findViewById(R.id.balanceTextView);
        final TextView debtTextView = findViewById(R.id.debtView);
        final ImageButton addReceiptImageButton = findViewById(R.id.addBillImageButton);
        session = new SessionManager(getApplicationContext());

        session.checkLogin();


        addReceiptImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ReceiptActivity.class);
                myIntent.putExtra("key", "value"); //Optional parameters
                myIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                MainActivity.this.startActivity(myIntent);
            }
        });

    }

}
