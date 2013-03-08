package sirodey.mydungeons.activities;

import sirodey.mydungeons.R;
import sirodey.mydungeons.R.id;
import sirodey.mydungeons.R.layout;
import sirodey.mydungeons.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Start extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		final Button btn_nueva_ficha = (Button)findViewById(R.id.btn_nueva_ficha);
		btn_nueva_ficha.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Start.this, NuevaFicha.class);
				startActivity(intent);
			}
		});

		final Button btn2= (Button)findViewById(R.id.button2);

		btn2.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(Start.this, Test.class);
				startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_start, menu);
		return true;
	}

}

