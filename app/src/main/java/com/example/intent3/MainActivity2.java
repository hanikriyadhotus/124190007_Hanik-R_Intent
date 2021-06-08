package com.example.intent3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.namaValue);
        TextView umur = (TextView) findViewById(R.id.umurValue);
        TextView jeniskelamin = (TextView) findViewById(R.id.jeniskelaminValue);
        //menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        umur.setText(b.getCharSequence("umur"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
    }
}
