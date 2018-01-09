package com.studio.alba33.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //Memanggil id widget
        etPanjang = (EditText) findViewById(R.id.etPanjang);
        etLebar = (EditText) findViewById(R.id.etLebar);
        btnHitung = (Button) findViewById(R.id.btnHitungPersegi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Menagmbil nilai dari widget edit text dan memasukkan kedalam nilai string
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();

                //Mengecek apakag edit text ksong
                //kondisi ketika panjangnya kosong
                if(nPanjang.isEmpty()){
                    //Memberikan warning berupa error
                    etPanjang.setError("Panjang tidak boleh kosong");
                }else if (nLebar.isEmpty()){
                    etLebar.setError("Lebar tidak boleh kosong");
                }else{

                    //Mengubah nilai dari String ke Integer
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);

                    //Kondisi ketika panjang dan lebarnya tidak kosong
                    int HasilHitunKeliling = (2 * aPanjang) + (2 * aLebar);
                    int HasilHitungLuas = aPanjang * aLebar;

                    //Menampilkan hasil hitung ke widget textview
                    txtHasil.setText("Keliling = " + HasilHitunKeliling + "Luas = " + HasilHitungLuas);
            }
            }
        });

        //Aksi ketika button btnHitung diklik
//        btnHitung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Menagmbil nilai dari widget edit text dan memasukkan kedalam nilai string
//                String nPanjang = etPanjang.getText().toString();
//                String nLebar = etLebar.getText().toString();
//
//                //Mengecek apakag edit text ksong
//                //kondisi ketika panjangnya kosong
//                if(nPanjang.isEmpty()){
//                    //Memberikan warning berupa error
//                    etPanjang.setError("Panjang tidak boleh kosong");
//                }else if (nLebar.isEmpty()){
//                    etLebar.setError("Lebar tidak boleh kosong");
//                }else{
//
//                    //Mengubah nilai dari String ke Integer
//                    int aPanjang = Integer.parseInt(nPanjang);
//                    int aLebar = Integer.parseInt(nLebar);
//
//                    //Kondisi ketika panjang dan lebarnya tidak kosong
//                    int HasilHitunKeliling = (2 * aPanjang) + (2 * aLebar);
//                    int HasilHitungLuas = aPanjang * aLebar;
//
//                    //Menampilkan hasil hitung ke widget textview
//                    txtHasil.setText("Keliling = " + HasilHitunKeliling + "Luas = " + HasilHitungLuas);

//            });
//
//        }
//
//    }
    }
}
