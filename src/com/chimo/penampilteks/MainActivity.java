package com.chimo.penampilteks;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button btnTampil, btnExit;
	TextView tvTampil;
	EditText etInput;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
                //memanggil method initialize()
		initialize();
	}
               //method ini digunakan untuk inisialisasi object2
	private void initialize() {
		// TODO Auto-generated method stub
		btnTampil = (Button) findViewById(R.id.btnTampil);
		btnExit = (Button) findViewById(R.id.btnExit);
		etInput = (EditText) findViewById(R.id.etInput);
		tvTampil = (TextView) findViewById(R.id.tvTampil);		
		btnTampil.setOnClickListener(this);
		btnExit.setOnClickListener(this);
	}
                  //method yang menangani event click pada button
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btnTampil:
                        //ambil tulisan pada EditText, kemudian tampilkan pada TextView
			tvTampil.setText(etInput.getText().toString());
                        //merubah ukuran font
			tvTampil.setTextSize(36);
                         //merubah tampilan warna menjadi CYAN
			tvTampil.setTextColor(Color.CYAN);
			break;
		case R.id.btnExit:
			finish();
			break;
		
		}
		
	}
}
