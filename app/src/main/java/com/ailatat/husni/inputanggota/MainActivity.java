package com.ailatat.husni.inputanggota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mEditNama, mEditJumEsTeh, mEditJumEsJeruk;
    TextView mTextNama, mTextPilih, mTextHarga, mTextTq, mTextHasil;
    CheckBox mCheckEsTeh, mCheckEsJeruk;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditNama = (EditText) findViewById(R.id.editTextNama);
        mEditJumEsTeh = (EditText) findViewById(R.id.editTextJumlahTeh);
        mEditJumEsJeruk = (EditText) findViewById(R.id.editTextJumlahJeruk);

        mTextNama = (TextView) findViewById(R.id.textViewNama);
        mTextPilih = (TextView) findViewById(R.id.textViewPilih);
        mTextHarga = (TextView) findViewById(R.id.textViewHarga);
        mTextTq = (TextView) findViewById(R.id.textViewTq);
        mTextHasil = (TextView) findViewById(R.id.textViewHasil);

        mCheckEsTeh = (CheckBox) findViewById(R.id.checkBoxEsTeh);
        mCheckEsJeruk = (CheckBox) findViewById(R.id.checkBoxEsJeruk);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = mEditNama.getText().toString();

                String mPilih = "";

                int hEsJeruk = 0;
                int hEsTeh = 0;
                int jEsJeruk = 0;
                int jEsTeh = 0;
                int harga = 0;

                if(mCheckEsTeh.isChecked()){
                    mPilih = "Es Teh";
                    hEsTeh = 2000;
                    jEsTeh = Integer.parseInt(mEditJumEsTeh.getText().toString());
                    harga = hEsTeh * jEsTeh;
                }

                if(mCheckEsJeruk.isChecked()){
                    mPilih = "Es Jeruk";
                    hEsJeruk = 3000;
                    jEsJeruk = Integer.parseInt(mEditJumEsJeruk.getText().toString());
                    harga = hEsJeruk * jEsJeruk;
                }

                mTextHasil.setText("Hasil : ");
                mTextNama.setText("Nama Pemesan : "+nama);
                mTextPilih.setText("Pilih : "+mPilih);
                mTextHarga.setText("Total Harga : "+harga);
                mTextTq.setText("Terima Kasih Sudah Order");
            }
        });
    }
}
