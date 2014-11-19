package com.example.nihon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button homeclick1, homeclick2, homeclick3, homeclick4, homeclick5,
			homeclick6, homeclick7, homeclick8, homeclick9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		homeclick1 = (Button) findViewById(R.id.button1);

		homeclick2 = (Button) findViewById(R.id.button2);

		homeclick3 = (Button) findViewById(R.id.button3);

		homeclick4 = (Button) findViewById(R.id.button4);
		homeclick1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		homeclick5 = (Button) findViewById(R.id.button5);

		homeclick6 = (Button) findViewById(R.id.button6);
		homeclick1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		homeclick7 = (Button) findViewById(R.id.button7);

		homeclick8 = (Button) findViewById(R.id.button8);
		homeclick1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		homeclick9 = (Button) findViewById(R.id.button9);

		homeclick1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent click1 = new Intent(getApplicationContext(),ChaoHoiActivity.class);
				startActivity(click1);
			}
		});
		
		homeclick2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent click2 = new Intent(getApplicationContext(),SoActivity.class);
				startActivity(click2);
			}
			
		});
homeclick3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent click3 = new Intent(getApplicationContext(),GiaDinhActivity.class);
				startActivity(click3);
			}
			
		});

homeclick4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent click4 = new Intent(getApplicationContext(),AnUongActivity.class);
		startActivity(click4);
	}
	
});

homeclick5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent click5 = new Intent(getApplicationContext(),NgayGioActivity.class);
		startActivity(click5);
	}
	
});

homeclick6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent click6 = new Intent(getApplicationContext(),MauSacActivity.class);
		startActivity(click6);
	}
	
});

homeclick7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent click7 = new Intent(getApplicationContext(),DatNuocActivity.class);
		startActivity(click7);
	}
	
});
homeclick8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent click8 = new Intent(getApplicationContext(),SucKhoeActivity.class);
		startActivity(click8);
	}
	
});
//homeclick6.setOnClickListener(new OnClickListener() {
//	
//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		Intent click6 = new Intent(getApplicationContext(),MauSacActivity.class);
//		startActivity(click6);
//	}
//	
//});


	}
}
