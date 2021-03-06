package com.example.nihon;

import java.io.IOException;
import java.util.ArrayList;

import com.example.nihon.data.Database;

import Adapter.WordAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class SucKhoeActivity extends Activity {

	ListView lvData;
	WordAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suc_khoe);
		
		isCreateDB();

		lvData = (ListView) findViewById(R.id.listView1);
		adapter = new WordAdapter(this);
		adapter.setListView(getWordbyID());
		lvData.setAdapter(adapter);
		
	}

	private ArrayList<Object> getWordbyID() {
		Database data = new Database(this);
		return data.getWordById(17);
	}

	private boolean isCreateDB() {
		Database data = new Database(this);
		try {
			return data.isCreatedDatabase();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

	}
}
