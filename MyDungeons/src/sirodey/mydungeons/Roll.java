package sirodey.mydungeons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import android.R.color;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Roll extends LinearLayout {

	//CONSTANTES
	private static final boolean ENABLE 	   = true;
	private static final boolean NOT_ENABLE  = false;
	private static final boolean READY	    = true;
	private static final boolean NO_READY   = false;
	
	//CONTROLES
	ImageView dice1,dice2,dice3,dice4;
	Button button_roll;
	TextView tv_resultado;

	//ATRIBUTOS
	private boolean ready = NO_READY;
	private boolean button_enable = ENABLE;
	private int resultado = 0;
	
	//CONSTRUCTORES
	public Roll(Context context) {
		super(context);
		inicializar();
	}
	public Roll(Context context, AttributeSet attrs) {
		super(context, attrs);
		inicializar();
	}
	private void inicializar() {
		
		//Utilizamos el layout 'control_login' como interfaz del control
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
		li.inflate(R.layout.controlroll, this, true);
		
		//Obtenemos las referencias a los distintos control
		
		  dice1 = (ImageView) findViewById(R.id.dice_1);
		  dice2 = (ImageView) findViewById(R.id.dice_2);
		  dice3 = (ImageView) findViewById(R.id.dice_3);
		  dice4 = (ImageView) findViewById(R.id.dice_4);
		  button_roll      = (Button) findViewById(R.id.button_roll);
		  tv_resultado        = (TextView)findViewById(R.id.dice_resultado);
		  
		  
		  if (!isInEditMode()){
		  button_roll.setOnClickListener(new OnClickListener(){
					public void onClick(View v) {
						if (button_enable){
							button_enable= NOT_ENABLE;
							button_roll.setBackgroundResource(R.drawable.celda_gris);
							roll();
							ready = READY;
						}
							
						
					}
				});
		  }
	}
	
	//METODOS PUBLICOS
	public boolean isReady(){
		return ready;
	}
	public void enable(){
		ready = NO_READY;
		button_enable= ENABLE;
		button_roll.setBackgroundResource(R.drawable.celda_marron_claro);
	}
	public int getResultado(){
		int ret = 0;
		if (ready)
			ret = resultado;

		return ret;
	}
	
	//METODOS PRIVADOS
	private void roll(){

		List<Integer> dados = new ArrayList<Integer>();
		Random r = new Random();
		int x;
		
		/*Lanzar 4D6, descartar el mas bajo*/
		x = r.nextInt(6)+1;
		setDado(1,x);
		dados.add(x);
		
		x = r.nextInt(6)+1;
		setDado(2,x);
		dados.add(x);
		
		x = r.nextInt(6)+1;
		setDado(3,x);
		dados.add(x);
		
		x = r.nextInt(6)+1;
		setDado(4,x);
		dados.add(x);
		
        Collections.sort(dados);  
		x = dados.get(1) + dados.get(2) + dados.get(3);

		//una vez con el resultado, imprimimos la solucion en tv_resultado
		int modificador = x/2-5;
		
		if (modificador >=0){
			tv_resultado.setText( Integer.toString(x) + " (+" + modificador + ")"); 
					//
		}
		else{
			tv_resultado.setText( Integer.toString(x) + " (" + modificador + ")");
		}
		
		resultado = x;
		button_roll.setBackgroundResource(R.drawable.celda_gris);
		
	}

	// metodo usado por roll para mostrar las imagenes de los dados
	private void setDado(int position, int value){
		
		if (position==1){
			if (value ==1){
				dice1.setImageResource(R.drawable.dice1);
			}
			else if(value==2){
				dice1.setImageResource(R.drawable.dice2);
			}
			else if(value==3){
				dice1.setImageResource(R.drawable.dice3);
			}
			else if(value==4){
				dice1.setImageResource(R.drawable.dice4);
			}
			else if(value==5){
				dice1.setImageResource(R.drawable.dice5);
			}
			else if(value==6){
				dice1.setImageResource(R.drawable.dice6);
			}
		}
		
		else if (position==2){
			if (value ==1){
				dice2.setImageResource(R.drawable.dice1);
			}
			else if(value==2){
				dice2.setImageResource(R.drawable.dice2);
			}
			else if(value==3){
				dice2.setImageResource(R.drawable.dice3);
			}
			else if(value==4){
				dice2.setImageResource(R.drawable.dice4);
			}
			else if(value==5){
				dice2.setImageResource(R.drawable.dice5);
			}
			else if(value==6){
				dice2.setImageResource(R.drawable.dice6);
			}
		}
		
		else if (position==3){
			if (value ==1){
				dice3.setImageResource(R.drawable.dice1);
			}
			else if(value==2){
				dice3.setImageResource(R.drawable.dice2);
			}
			else if(value==3){
				dice3.setImageResource(R.drawable.dice3);
			}
			else if(value==4){
				dice3.setImageResource(R.drawable.dice4);
			}
			else if(value==5){
				dice3.setImageResource(R.drawable.dice5);
			}
			else if(value==6){
				dice3.setImageResource(R.drawable.dice6);
			}
		}
				else if (position==4){
			if (value ==1){
				dice4.setImageResource(R.drawable.dice1);
			}
			else if(value==2){
				dice4.setImageResource(R.drawable.dice2);
			}
			else if(value==3){
				dice4.setImageResource(R.drawable.dice3);
			}
			else if(value==4){
				dice4.setImageResource(R.drawable.dice4);
			}
			else if(value==5){
				dice4.setImageResource(R.drawable.dice5);
			}
			else if(value==6){
				dice4.setImageResource(R.drawable.dice6);
			}
		}
	}


}
