package sirodey.mydungeons.activities;

import sirodey.mydungeons.Ficha;
import sirodey.mydungeons.Lib;
import sirodey.mydungeons.R;
import sirodey.mydungeons.R.id;
import sirodey.mydungeons.R.layout;
import sirodey.mydungeons.Roll;
import android.app.Activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class NuevaFicha extends Activity {
    
	protected static final boolean NOT_ENABLE = false;
	public float init_x;
	private ViewFlipper vf;
	ImageView brb,brd,cle,drd, exp, gue, hec, mag, mnj, pal, pic;
	ImageView elfo,enano,gnomo, humano, mediano, semielfo, semiorco;
	ImageView lb,nb,cb,ln,n,cn,lm,nm,cm;
	//TIRADAS
	private int contador_tiradas =6;
	private int mod=0;
	Roll roll;
	TextView tiradas_msg,fue_base,fue_mod,fue_total,des_base,des_mod,des_total,con_base,con_mod,con_total,
			 int_base, int_mod,int_total,sab_base,sab_mod,sab_total,car_base,car_mod,car_total;


	
	Ficha f;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_ficha);
        vf = (ViewFlipper) findViewById(R.id.viewFlipper);
        f = new Ficha();

        brb = (ImageView)findViewById(R.id.nf_brb);
        brb.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.brb))));
    	brd = (ImageView)findViewById(R.id.nf_brd);
    	brd.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.brd))));
    	cle = (ImageView)findViewById(R.id.nf_cle);
    	cle.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.cle))));
    	drd = (ImageView)findViewById(R.id.nf_drd);
    	drd.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.drd))));
    	exp = (ImageView)findViewById(R.id.nf_exp);
    	exp.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.exp))));
    	gue = (ImageView)findViewById(R.id.nf_gue);
    	gue.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.gue))));
    	hec = (ImageView)findViewById(R.id.nf_hec);
    	hec.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.hec))));
    	mag = (ImageView)findViewById(R.id.nf_mag);
    	mag.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.mag))));
    	mnj = (ImageView)findViewById(R.id.nf_mnj);
    	mnj.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.mnj))));
    	pal		= (ImageView)findViewById(R.id.nf_pal);
    	pal.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.pal))));
    	pic		= (ImageView)findViewById(R.id.nf_pic);
    	pic.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.pic))));
    	
    	elfo	= (ImageView)findViewById(R.id.nf_elfo);
    	elfo.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.elfa))));
    	enano	= (ImageView)findViewById(R.id.nf_enano);
    	enano.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.enano))));
    	gnomo	= (ImageView)findViewById(R.id.nf_gnomo);
    	gnomo.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.gnomo))));
    	humano	= (ImageView)findViewById(R.id.nf_humano);
    	humano.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.human))));
    	mediano	= (ImageView)findViewById(R.id.nf_mediano);
    	mediano.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.mediano))));
    	semielfo= (ImageView)findViewById(R.id.nf_semielfo);
    	semielfo.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.semielfo))));
    	semiorco= (ImageView)findViewById(R.id.nf_semiorco);
    	semiorco.setImageBitmap( Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.semiorco))));
    	
    	lb	= (ImageView)findViewById(R.id.nf_lb);
    	lb.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.lb))));
       	nb	= (ImageView)findViewById(R.id.nf_nb);
    	nb.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.nb))));
       	cb	= (ImageView)findViewById(R.id.nf_cb);
    	cb.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.cb))));
       	ln	= (ImageView)findViewById(R.id.nf_ln);
    	ln.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.ln))));
       	n	= (ImageView)findViewById(R.id.nf_n);
    	n.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.n))));
       	cn	= (ImageView)findViewById(R.id.nf_cn);
    	cn.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.cn))));
       	lm	= (ImageView)findViewById(R.id.nf_lm);
    	lm.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.lm))));
       	nm	= (ImageView)findViewById(R.id.nf_nm);
    	nm.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.nm))));
       	cm	= (ImageView)findViewById(R.id.nf_cm);
    	cm.setImageBitmap(  Lib.getRoundedCornerBitmapWithBorderPaint((getResources().getDrawable(R.drawable.cm))));
 
    	roll = (Roll)findViewById(R.id.nf_roll);
    	tiradas_msg = (TextView)findViewById(R.id.nf_tiradas_msg);
    	fue_base 	= (TextView)findViewById(R.id.nf_fuerza_base);
    	fue_mod 	= (TextView)findViewById(R.id.nf_fuerza_mod);
    	fue_total 	= (TextView)findViewById(R.id.nf_fuerza_total);
    	des_base	= (TextView)findViewById(R.id.nf_destreza_base);
    	des_mod		= (TextView)findViewById(R.id.nf_destreza_mod);
    	des_total	= (TextView)findViewById(R.id.nf_destreza_total);
    	con_base	= (TextView)findViewById(R.id.nf_constitucion_base);
    	con_mod		= (TextView)findViewById(R.id.nf_constitucion_mod);
    	con_total	= (TextView)findViewById(R.id.nf_constitucion_total);
    	int_base	= (TextView)findViewById(R.id.nf_inteligencia_base);
    	int_mod		= (TextView)findViewById(R.id.nf_inteligencia_mod);
    	int_total	= (TextView)findViewById(R.id.nf_inteligencia_total);
    	sab_base	= (TextView)findViewById(R.id.nf_sabiduria_base);
    	sab_mod		= (TextView)findViewById(R.id.nf_sabiduria_mod);
    	sab_total	= (TextView)findViewById(R.id.nf_sabiduria_total);
    	car_base	= (TextView)findViewById(R.id.nf_carisma_base);
    	car_mod		= (TextView)findViewById(R.id.nf_carisma_mod);
    	car_total	= (TextView)findViewById(R.id.nf_carisma_total);
    	
    	
/**
 * 		
 * 		NUEVA FICHA. PAGINA 3 : SELECCION DE CLASE
 * 
 */
    	
    	brb.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.BARBARO);
    	      vf.showNext();
    	    }
    	});
    	brd.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.BARDO);
    	      vf.showNext();
    	    }
    	});
    	cle.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.CLERIGO);
    	      vf.showNext();
    	      
    	    }
    	});
    	drd.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.DRUIDA);
    	      vf.showNext();
    	      
    	    }
    	});
    	exp.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.EXPLORADOR);
    	      vf.showNext();
    	    }
    	});
    	gue.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.GUERRERO);
    	      vf.showNext();
    	    }
    	});	
     	hec.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.HECHICERO);
    	      vf.showNext();
    	    }
    	});
    	mag.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.MAGO);
    	      vf.showNext();
    	    }
    	});   
    	mnj.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.MONJE);
    	      vf.showNext();
    	    }
    	});
    	pal.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.PALADIN);
    	      vf.showNext();
    	    }
    	});
    	pic.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setClase(Ficha.PICARO);
    	      vf.showNext();
    	    }
    	});
    	elfo.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.ELFO);
    	      vf.showNext();
    	    }
    	});
    
/**
 * 		
 * 		NUEVA FICHA. PAGINA 4 : SELECCION DE RAZA
 * 
 */

    	enano.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.ENANO);
    	      fue_mod.setText("+2");
    	      con_mod.setText("-2");
    	      vf.showNext();
    	    }
    	});
    	gnomo.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.GNOMO);
    	      con_mod.setText("+2");
    	      car_mod.setText("-2");
    	      vf.showNext();
    	    }
    	});
    	humano.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.HUMANO);
    	      vf.showNext();
    	    }
    	});
    	mediano.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.MEDIANO);
    	      des_mod.setText("+2");
    	      fue_mod.setText("-2");

    	      vf.showNext();
    	    }
    	});
    	semielfo.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.SEMIELFO);
    	      vf.showNext();
    	    }
    	});
    	semiorco.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setRaza(Ficha.SEMIORCO);
    	      fue_mod.setText("+2");
    	      int_mod.setText("-2");
    	      car_mod.setText("-2");

    	      vf.showNext();
    	    }
    	});

/**
 * 		
 * 		NUEVA FICHA. PAGINA 5 : SELECCION DE ALINEAMIENTO
 * 
 */
    
    	lb.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.LEGAL);
    	      f.setAlienamientoBM(Ficha.BUENO);
    	      vf.showNext();
    	    }
    	});
    	nb.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.NEUTRAL);
    	      f.setAlienamientoBM(Ficha.BUENO);
    	      vf.showNext();
    	    }
    	});
    	cb.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.CAOTICO);
    	      f.setAlienamientoBM(Ficha.BUENO);
    	      vf.showNext();
    	    }
    	});
    	ln.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.LEGAL);
    	      f.setAlienamientoBM(Ficha.NEUTRAL);
    	      vf.showNext();
    	    }
    	});
    	n.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.NEUTRAL);
    	      f.setAlienamientoBM(Ficha.NEUTRAL);
    	      vf.showNext();
    	    }
    	});
    	cn.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.CAOTICO);
    	      f.setAlienamientoBM(Ficha.NEUTRAL);
    	      vf.showNext();
    	    }
    	});
    	lm.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.LEGAL);
    	      f.setAlienamientoBM(Ficha.MALIGNO);
    	      vf.showNext();
    	    }
    	});
    	nm.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.NEUTRAL);
    	      f.setAlienamientoBM(Ficha.MALIGNO);
    	      vf.showNext();
    	    }
    	});
    	cm.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      f.setAlienamientoLC(Ficha.CAOTICO);
    	      f.setAlienamientoBM(Ficha.MALIGNO);
    	      vf.showNext();
    	    }
    	});

/**
 * 		
 * 		NUEVA FICHA. PAGINA 6 : TIRADAS
 * 
 */

    
   
    	fue_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && fue_base.isEnabled()){
    	    		fue_base.setText( Integer.toString(roll.getResultado()));
    	    		fue_base.setEnabled(NOT_ENABLE);
    	    		fue_base.setBackgroundResource(R.drawable.celda_gris);
    	    	
    	    		int x = f.getModificador(Ficha.FUERZA , Ficha.RAZA);
    	    		if (x!=0){
    	    			fue_mod.setText(Integer.toString(x));
    	    		}
    	    		
    	    		fue_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		
    	    		contador_tiradas--;
    	    		roll.enable();
    	    	
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    		
    	    	}
    	    }
    	});
    	des_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && des_base.isEnabled()){
    	    		des_base.setText( Integer.toString(roll.getResultado()));
    	    		des_base.setEnabled(NOT_ENABLE);
    	    		des_base.setBackgroundResource(R.drawable.celda_gris);
    	    	
    	    		int x = f.getModificador(Ficha.DESTREZA, Ficha.RAZA);
    	    		des_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		
    	    		contador_tiradas--;
    	    		roll.enable();
    	    	
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    	}
    	    }
    	});
    	con_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && con_base.isEnabled()){
    	    		con_base.setText( Integer.toString(roll.getResultado()));
    	    		con_base.setEnabled(NOT_ENABLE);
    	    		con_base.setBackgroundResource(R.drawable.celda_gris);
    	    		int x = f.getModificador(Ficha.CONSTITUCION, Ficha.RAZA);
    	    		con_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		contador_tiradas--;
    	    		roll.enable();
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    	}
    	    }
    	});
    	int_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && int_base.isEnabled()){
    	    		int_base.setText( Integer.toString(roll.getResultado()));
    	    		int_base.setEnabled(NOT_ENABLE);
    	    		int_base.setBackgroundResource(R.drawable.celda_gris);
    	    		int x = f.getModificador(Ficha.INTELIGENCIA, Ficha.RAZA);
    	    		int_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		contador_tiradas--;
    	    		roll.enable();
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    	}
    	    }
    	});
    	sab_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && sab_base.isEnabled()){
    	    		sab_base.setText( Integer.toString(roll.getResultado()));
    	    		sab_base.setEnabled(NOT_ENABLE);
    	    		sab_base.setBackgroundResource(R.drawable.celda_gris);
    	    		int x = f.getModificador(Ficha.SABIDURIA, Ficha.RAZA);
    	    		sab_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		contador_tiradas--;
    	    		roll.enable();
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    	}
    	    }
    	});
    	car_base.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	    	
    	    	if (contador_tiradas>0 && roll.isReady() && car_base.isEnabled()){
    	    		car_base.setText( Integer.toString(roll.getResultado()));
    	    		car_base.setEnabled(NOT_ENABLE);
    	    		car_base.setBackgroundResource(R.drawable.celda_gris);
    	    		int x = f.getModificador(Ficha.CARISMA, Ficha.RAZA);
    	    		car_total.setText( Integer.toString(x + roll.getResultado() ));
    	    		contador_tiradas--;
    	    		roll.enable();
    	    		if (contador_tiradas ==0)
    	    				setTiradas();
    	    	}
    	    }
    	});

    	//ImageView lb,nb,cb,ln,n,cn,lm,nm,cm;
    	//CODIGO DE PAGINA 9
    	//CODIGO DE PRUEBA; BORRAR DESPUES DE USAR
        Button b = (Button)findViewById(R.id.control_refresh);
        final TextView ct_c = (TextView)findViewById(R.id.control_clase);
        final TextView ct_r = (TextView)findViewById(R.id.control_raza);
    	b.setOnClickListener(new View.OnClickListener() {
    	    public void onClick(View arg0)
    	    {
    	      ct_c.setText(f.getClase());
       	      ct_r.setText(f.getRaza());
    	    }
    	});

    }

    private void setTiradas(){
    	
    	vf.showNext();
		
	}
    
}


