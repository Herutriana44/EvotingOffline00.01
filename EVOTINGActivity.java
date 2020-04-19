package com.evoting;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import java.lang.Override;


public class EVOTINGActivity extends Activity implements RadioGroup.OnCheckedChangeListener
{
	private String Kelas01;
    private Button add;
    private EditText entri;
    private TextView hasil;
  //  private String kelasI = "Kelas";
    private TextView keluaran;
    private Spinner klas;
    private TextView klas01;
    private TextView nama;
  //  private String namaI = "Nama";
    private RadioGroup pil;
  //  private String pilihanI = "pilihan";
    private Button results;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    	add = (Button) findViewById(R.id.add);
        entri = (EditText) findViewById(R.id.nama);
        klas = (Spinner) findViewById(R.id.kelas);
        results = (Button) findViewById(R.id.result);
        nama = (TextView) findViewById(R.id.nama01);
        klas01 = (TextView) findViewById(R.id.kelas01);
        hasil = (TextView) findViewById(R.id.hasil01);
        keluaran = (TextView) findViewById(R.id.keluar);
        pil = (RadioGroup) findViewById(R.id.pil);
        pil.setOnCheckedChangeListener(this);
        add.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View arg0)
        	{
        		keluaran.setText("tombol <tambahkan> aktif");
        	}
        });
        results.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View arg1)
        	{
        		keluaran.setText("tombol <lihat hasil> aktif");
        	}
        });
    }
    public void onCheckedChanged(RadioGroup radioGroup, int checkId)
    {
        switch (checkId)
        {
            case R.id.pil1:
                nama.setText(entri.getText());
                Kelas01 = klas.getSelectedItem().toString();
                klas01.setText(Kelas01.toString());
                hasil.setText("No. 1");
                break;
            case R.id.pil2:
                nama.setText(entri.getText());
                Kelas01 = klas.getSelectedItem().toString();
                klas01.setText(Kelas01.toString());
                hasil.setText("No. 2");
                break;
            case R.id.pil3:
                nama.setText(entri.getText());
                Kelas01 = klas.getSelectedItem().toString();
                klas01.setText(Kelas01.toString());
                hasil.setText("No. 3");
                break;
         }
     }
     
}
