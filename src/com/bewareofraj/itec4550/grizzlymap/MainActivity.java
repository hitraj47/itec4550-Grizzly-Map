package com.bewareofraj.itec4550.grizzlymap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private ImageButton btnAreaMap;
	private ImageButton btnCampusMap;
	private ImageButton btnAbout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initializeButtons();
	}

	private void initializeButtons() {
		btnAreaMap = (ImageButton) findViewById(R.id.btnAreaMap);
		btnAreaMap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent areaMapIntent = new Intent(MainActivity.this, AreaMapActivity.class);
				startActivity(areaMapIntent);
			}
		});
		
		btnCampusMap = (ImageButton) findViewById(R.id.btnCampusMap);
		btnCampusMap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent campusMapIntent = new Intent(MainActivity.this, CampusMapActivity.class);
				startActivity(campusMapIntent);
			}
		});
		
		btnAbout = (ImageButton) findViewById(R.id.btnAbout);
		btnAbout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
				startActivity(aboutIntent);
			}
		});
	}
}
