package Adapter;

import com.example.nihon.R;
import com.example.nihon.wordlist.WordListItem;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class WordAdapter extends MyBaseAdapter {

	TextView txteng, txtpinyin, txtjapanese, txtvietnamese;
	

	public WordAdapter(Context context) {
		super(context);
		//
	}

	@Override
	public View getLayout(Object obj, View v, int position) {
		WordListItem cc = (WordListItem) obj;

		if (v == null) {
			v = (View) m_Inflater.inflate(R.layout.item, null);
		}

		txteng = (TextView) v.findViewById(R.id.english);
		txtpinyin = (TextView) v.findViewById(R.id.pinyin);
		txtjapanese = (TextView) v.findViewById(R.id.japanese);
		txtvietnamese = (TextView) v.findViewById(R.id.vietnamese);

		txteng.setText(cc.getEnglish());
		txtpinyin.setText(cc.getPinyin());
		txtjapanese.setText(cc.getJapanese());
		txtvietnamese.setText(cc.getVietnamese());

		return v;
	}

}
