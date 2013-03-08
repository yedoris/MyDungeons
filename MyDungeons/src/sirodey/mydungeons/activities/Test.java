package sirodey.mydungeons.activities;

import sirodey.mydungeons.Ficha;
import sirodey.mydungeons.R;
import sirodey.mydungeons.R.id;
import sirodey.mydungeons.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class Test extends Activity {
	
	TextView cabecera;
	ImageView brb,brd,cle,drd, exp, gue, hec, mag, mnj, pal, pic;
	Ficha f;
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_test);
	        f = new Ficha();
	        
	        cabecera = (TextView)findViewById(R.id.nf_class);
	    	brb = (ImageView)findViewById(R.id.nf_brb);
	    	brd = (ImageView)findViewById(R.id.nf_brd);
	    	cle = (ImageView)findViewById(R.id.nf_cle);
	    	drd = (ImageView)findViewById(R.id.nf_drd);
	    	exp = (ImageView)findViewById(R.id.nf_exp);
	    	gue = (ImageView)findViewById(R.id.nf_gue);
	    	hec = (ImageView)findViewById(R.id.nf_hec);
	    	mag = (ImageView)findViewById(R.id.nf_mag);
	    	mnj = (ImageView)findViewById(R.id.nf_mnj);
	    	pal = (ImageView)findViewById(R.id.nf_pal);
	    	pic = (ImageView)findViewById(R.id.nf_pic);
	  
	    	brb.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("brb");
	    	      cabecera.setText("has seleccionado Bárbaro");
	    	      
	    	    }
	    	});
	    	brd.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("brd");
	    	      cabecera.setText("has seleccionado Bardo");
	    	    }
	    	});
	    	cle.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("cle");
	    	      cabecera.setText("has seleccionado Clérigo");
	    	      
	    	    }
	    	});
	    	drd.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("drd");
	    	      
	    	    }
	    	});
	    	exp.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("exp");
	    	      
	    	    }
	    	});
	    	gue.setOnClickListener(new View.OnClickListener() {
	    	    public void onClick(View arg0)
	    	    {
	    	      f.setClase("gue");
	    	      
	    	    }
	    	});

	 }
}