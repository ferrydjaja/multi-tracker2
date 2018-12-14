package com.google.android.gms.samples.vision.face.multitracker;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


;
import com.google.android.gms.samples.vision.face.multitracker.MultiTrackerActivity;


public class SendScannedBarcode extends AppCompatActivity {
    public static String scannedBarcode = "";
    public static final String EXTRA_MESSAGE = "com.google.android.gms.samples.vision.face.multitracker.MESSAGE";

    private Context mContext;
    private Activity mActivity;
    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_scanned_barcode);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String scannedValue = intent.getStringExtra(SendScannedBarcode.EXTRA_MESSAGE);

        TextView txtScannedValue = (TextView) findViewById(R.id.txtScannedValue);
        txtScannedValue.setText(scannedValue);

        Button btnSendScannedValue = (Button) findViewById(R.id.btnSendScannedValue);
        btnSendScannedValue.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Snackbar.make(v, "Haha", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                finish();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
