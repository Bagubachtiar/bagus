package com.bagusbachtiar.tugaslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionLinlayout(View view) {
        Toast.makeText(this, "ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout2(View view) {
        Toast.makeText(this, "ini adalah Relative Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout3(View view) {
        Toast.makeText(this, "ini adalah Constrain Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout4(View view) {
        Toast.makeText(this, "Ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout5(View view) {
        Toast.makeText(this, "ini adalah Tabel Lyaout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout6(View view) {
        Toast.makeText(this, "ini adalah Material Design", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout7(View view) {
        Toast.makeText(this, "ini adalah Scroll View ", Toast.LENGTH_SHORT).show();
    }

    public void actionLinlayout8(View view) {
        Toast.makeText(this, "ini adalah Scroll View Horizontal", Toast.LENGTH_SHORT).show();
    }
}