package com.example.krap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dominos extends AppCompatActivity {

    Button paymentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dominos);

        paymentButton = (Button)findViewById(R.id.paymentButton1);

        ///////////////////////////////////////////////////////////

        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Dominos.this, Summary.class);
                startActivity(k);
            }
        });

    }
}
