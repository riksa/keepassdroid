package com.keepassdroid.fileselect;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.keepass.R;
import com.keepassdroid.utils.Util;

public class BrowserDialog extends Dialog {

	public BrowserDialog(Context context) {
		super(context);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser_install);
		setTitle(R.string.file_browser);
		
		Button cancel = (Button) findViewById(R.id.cancel);
		cancel.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				BrowserDialog.this.cancel();
			}
		});
		
		Button market = (Button) findViewById(R.id.install_market);
		market.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Util.gotoUrl(getContext(), R.string.oi_filemanager_market);
				BrowserDialog.this.cancel();
			}
		});
		
		Button web = (Button) findViewById(R.id.install_web);
		web.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Util.gotoUrl(getContext(), R.string.oi_filemanager_web);
				BrowserDialog.this.cancel();
			}
		});
	}

}
