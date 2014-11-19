package com.example.nihon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import com.example.nihon.data.Database;

import Adapter.WordAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ChaoHoiActivity extends Activity {
	ListView lvData;
	WordAdapter adapter;
	Button click;
	TextView pinyin;
	TextToSpeech tts;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chao_hoi);

		isCreateDB();

		lvData = (ListView) findViewById(R.id.listView1);
		adapter = new WordAdapter(this);
		adapter.setListView(getWordbyID());
		lvData.setAdapter(adapter);

		pinyin = (TextView) findViewById(R.id.pinyin);
		click = (Button) findViewById(R.id.button1);
		tts = new TextToSpeech(getApplicationContext(),
				new TextToSpeech.OnInitListener() {
					@Override
					public void onInit(int status) {
						if (status != TextToSpeech.ERROR) {
							tts.setLanguage(Locale.JAPAN);
						}
					}
				});

	}

	private ArrayList<Object> getWordbyID() {
		Database data = new Database(this);
		return data.getWordById(1);
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

	@Override
	public void onDestroy() {
		// Don't forget to shutdown!
		if (tts != null) {
			tts.stop();
			tts.shutdown();
		}
		super.onDestroy();
	}

	public void speakText() {
		String toSpeak = pinyin.getText().toString();

		tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

	}

}
