package com.example.krap;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class Summary extends AppCompatActivity {

    private Spinner addressSpinner;
    ImageView paytmImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        addListenerOnSpinnerItemSelection();

        paytmImageView = (ImageView)findViewById(R.id.paytmImageView);

        paytmImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Summary.this, Checksum.class);
                intent.putExtra("orderid", "anything");
                intent.putExtra("custid", "something");
                intent.putExtra("Amount", "100");
                startActivity(intent);
            }
        });



        if (ContextCompat.checkSelfPermission(Summary.this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(Summary.this, new String[]{Manifest.permission.READ_SMS, Manifest.permission.RECEIVE_SMS}, 101);
        }

    }

    public void addListenerOnSpinnerItemSelection(){
        addressSpinner = (Spinner) findViewById(R.id.addressSpinner);
        addressSpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }



}
