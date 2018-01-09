package com.studio.alba33.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Widget Button
    Button btnPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Memanggil id Button
        btnPersegi = (Button)findViewById(R.id.btnPersegi);
        //Agat button Persegi dapat diklik
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Menambahkan intent agar pindah halaman activity lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //Agar bisa pindah activity maka kita harus nambahin startActivty
                startActivity(a1);
            }
        });
    }
}
