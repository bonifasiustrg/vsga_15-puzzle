package com.takasima.vsga_15_puzzle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnA  = findViewById(R.id.btn_a);
        final Button btnB  = findViewById(R.id.btn_b);
        final Button btnC  = findViewById(R.id.btn_c);
        final Button btnD  = findViewById(R.id.btn_d);
        final Button btnE  = findViewById(R.id.btn_e);
        final Button btnF  = findViewById(R.id.btn_f);
        final Button btnG  = findViewById(R.id.btn_g);
        final Button btnH  = findViewById(R.id.btn_h);
        final Button btnI  = findViewById(R.id.btn_i);
        final Button btnJ  = findViewById(R.id.btn_j);
        final Button btnK  = findViewById(R.id.btn_k);
        final Button btnL  = findViewById(R.id.btn_l);
        final Button btnM  = findViewById(R.id.btn_m);
        final Button btnN  = findViewById(R.id.btn_n);
        final Button btnO  = findViewById(R.id.btn_o);

//        btnA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                btnA.setBackgroundColor(Color.GREEN);
//                Toast.makeText(MainActivity.this, "Tombol A ditekan", Toast.LENGTH_SHORT).show();
//            }
//        });
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnJ.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnN.setOnClickListener(this);
        btnO.setOnClickListener(this);

    }

    //get the menu option page
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflaters = getMenuInflater();
        inflaters.inflate(R.menu.menu, menu);

        return true;
    }

    //onclick menu option
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_ulangi)
            startActivity(new Intent(this, UlangiActivity.class));
        else if (item.getItemId() == R.id.menu_keluar)
            finish();
        return true;
    }

    // OnClick Button Action  Class
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_a:
                Toast.makeText(this, "Tombol A diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_b:
                Toast.makeText(this, "Tombol B diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_c:
                Toast.makeText(this, "Tombol C diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_d:
                Toast.makeText(this, "Tombol D diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_e:
                Toast.makeText(this, "Tombol E diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_f:
                Toast.makeText(this, "Tombol F diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_g:
                Toast.makeText(this, "Tombol G diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_h:
                Toast.makeText(this, "Tombol H diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_i:
                Toast.makeText(this, "Tombol I diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_j:
                Toast.makeText(this, "Tombol J diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_k:
                Toast.makeText(this, "Tombol K diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_l:
                Toast.makeText(this, "Tombol L diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_m:
                Toast.makeText(this, "Tombol M diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_n:
                Toast.makeText(this, "Tombol N diklik", Toast.LENGTH_SHORT).show();
            case R.id.btn_o:
                Toast.makeText(this, "Tombol O diklik", Toast.LENGTH_SHORT).show();

        }
    }
}