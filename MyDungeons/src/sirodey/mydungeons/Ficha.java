package sirodey.mydungeons;

import java.util.ArrayList;
import java.util.List;

public class Ficha {
//CONSTANTES
public  static final String BARBARO		= "brb";
public  static final String BARDO		= "brd";
public  static final String CLERIGO		= "cle";
public  static final String DRUIDA		= "drd";
public  static final String EXPLORADOR	= "exp";
public  static final String GUERRERO	= "gue";
public  static final String HECHICERO	= "hec";
public  static final String MAGO		= "mag";
public  static final String MONJE		= "mnj";
public  static final String PALADIN		= "pal";
public  static final String PICARO		= "pic";

public 	static final String RAZA		= "raza";
public 	static final String ELFO 		= "elfo";
public 	static final String ENANO		= "enano";
public 	static final String GNOMO		= "gnomo";
public 	static final String HUMANO 		= "humano";
public 	static final String MEDIANO 	= "mediano";
public 	static final String SEMIELFO 	= "semielfo";
public 	static final String SEMIORCO 	= "semiorco";


private static final int TAM_MEDIANO = 5;
public static final int LEGAL 	= 0;
public static final int NEUTRAL	= 1;
public static final int CAOTICO	= 2;
public static final int BUENO 	= 0;
public static final int MALIGNO	= 2;

public static final String FUERZA 		= "fuerza";
public static final String DESTREZA 	= "destreza";
public static final String CONSTITUCION = "constitucion";
public static final String INTELIGENCIA = "inteligencia";
public static final String SABIDURIA	= "sabiduria";
public static final String CARISMA		= "carisma";





//ATRIBUTOS	
	private List<Modificador> modificadores = new ArrayList<Modificador>();
	private List<Habilidad>   habilidades 	= new ArrayList<Habilidad>();
	private List<Item> 		  invetario 	= new ArrayList<Item>();

	private int nv	=1;
	private int px 	=0;
	private int rangos_hab_max	=	4;
	private int conj_diarios_0, conj_diarios_1, conj_diarios_2, conj_diarios_3, conj_diarios_4, conj_diarios_5, conj_diarios_6, conj_diarios_7, conj_diarios_8, conj_diarios_9;
	private int conj_conoc_0, conj_conoc_1, conj_conoc_2, conj_conoc_3, conj_conoc_4, conj_conoc_5, conj_conoc_6,conj_conoc_7, conj_conoc_8, conj_conoc_9;
	
	private String deidad, nombre,sexo,aspecto,personalidad, transfondo, raza, clase;
	private int atq, ca, tamaño, sf,sv,sr,edad,altura,peso,dinero,alienamientoLC,alienamientoBM;
	private int fuerza, destreza,constitución,inteligencia,sabiduria,carisma;

	public Ficha() {
		super();
	}



	// GETTERS & SETTERS BASICOS	
	public int getFuerza() {
		return fuerza;
	}



	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}



	public int getDestreza() {
		return destreza;
	}



	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}



	public int getConstitución() {
		return constitución;
	}



	public void setConstitución(int constitución) {
		this.constitución = constitución;
	}



	public int getInteligencia() {
		return inteligencia;
	}



	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}



	public int getSabiduria() {
		return sabiduria;
	}



	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}



	public int getCarisma() {
		return carisma;
	}



	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
	
		//TODO: meter los modificadores en la clase Razas.
		//TODO: meter el resto de atributos relacionados con la raza: tamaño, hab claseas, etc
		if (raza.compareTo(ELFO)==0){
			modificadores.add(new Modificador(RAZA, DESTREZA, 2));
			modificadores.add(new Modificador(RAZA, CONSTITUCION, -2));
			
		}
		else if( raza.compareTo(ENANO)==0){
			modificadores.add(new Modificador(RAZA, CONSTITUCION, 2));
			modificadores.add(new Modificador(RAZA, CARISMA, -2));
		}
		else if( raza.compareTo(GNOMO)==0){
			modificadores.add(new Modificador(RAZA, CONSTITUCION, 2));
			modificadores.add(new Modificador(RAZA, FUERZA, -2));
			
		}
		else if( raza.compareTo(HUMANO)==0){
			
		}
		else if( raza.compareTo(MEDIANO)==0){
			modificadores.add(new Modificador(RAZA, DESTREZA, 2));
			modificadores.add(new Modificador(RAZA, FUERZA,  -2));
			
		}
		else if( raza.compareTo(SEMIELFO)==0){
			
		}
		else if( raza.compareTo(SEMIORCO)==0){
			modificadores.add(new Modificador(RAZA, FUERZA, 2));
			modificadores.add(new Modificador(RAZA, INTELIGENCIA, -2));
			modificadores.add(new Modificador(RAZA, CARISMA, -2));
		}
		else{
				throw new IllegalArgumentException("Raza incorrecta: " + raza);
		}
		
		this.raza = raza;
	}



	public List<Modificador> getModificadores() {
		return modificadores;
	}



	public void setModificadores(List<Modificador> modificadores) {
		this.modificadores = modificadores;
	}



	public int getSf() {
		return sf;
	}



	public void setSf(int sf) {
		this.sf = sf;
	}



	public int getSr() {
		return sr;
	}



	public void setSr(int sr) {
		this.sr = sr;
	}



	public int getSv() {
		return sv;
	}



	public void setSv(int sv) {
		this.sv = sv;
	}



	public int getNv() {
		return nv;
	}



	public void setNv(int nv) {
		this.nv = nv;
	}



	public int getAtq() {
		return atq;
	}



	public void setAtq(int atq) {
		this.atq = atq;
	}



	public int getPx() {
		return px;
	}



	public void setPx(int px) {
		this.px = px;
	}



	public int getRangos_hab_max() {
		return rangos_hab_max;
	}



	public void setRangos_hab_max(int rangos_hab_max) {
		this.rangos_hab_max = rangos_hab_max;
	}


	public List<Habilidad> getHabilidades() {
		return habilidades;
	}



	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}



	public int getConj_diarios_0() {
		return conj_diarios_0;
	}



	public void setConj_diarios_0(int conj_diarios_0) {
		this.conj_diarios_0 = conj_diarios_0;
	}



	public int getConj_diarios_1() {
		return conj_diarios_1;
	}



	public void setConj_diarios_1(int conj_diarios_1) {
		this.conj_diarios_1 = conj_diarios_1;
	}



	public int getConj_diarios_2() {
		return conj_diarios_2;
	}



	public void setConj_diarios_2(int conj_diarios_2) {
		this.conj_diarios_2 = conj_diarios_2;
	}



	public int getConj_diarios_3() {
		return conj_diarios_3;
	}



	public void setConj_diarios_3(int conj_diarios_3) {
		this.conj_diarios_3 = conj_diarios_3;
	}



	public int getConj_diarios_4() {
		return conj_diarios_4;
	}



	public void setConj_diarios_4(int conj_diarios_4) {
		this.conj_diarios_4 = conj_diarios_4;
	}



	public int getConj_diarios_5() {
		return conj_diarios_5;
	}



	public void setConj_diarios_5(int conj_diarios_5) {
		this.conj_diarios_5 = conj_diarios_5;
	}



	public int getConj_diarios_6() {
		return conj_diarios_6;
	}



	public void setConj_diarios_6(int conj_diarios_6) {
		this.conj_diarios_6 = conj_diarios_6;
	}



	public int getConj_diarios_7() {
		return conj_diarios_7;
	}



	public void setConj_diarios_7(int conj_diarios_7) {
		this.conj_diarios_7 = conj_diarios_7;
	}



	public int getConj_diarios_8() {
		return conj_diarios_8;
	}



	public void setConj_diarios_8(int conj_diarios_8) {
		this.conj_diarios_8 = conj_diarios_8;
	}



	public int getConj_diarios_9() {
		return conj_diarios_9;
	}



	public void setConj_diarios_9(int conj_diarios_9) {
		this.conj_diarios_9 = conj_diarios_9;
	}



	public int getConj_conoc_0() {
		return conj_conoc_0;
	}



	public void setConj_conoc_0(int conj_conoc_0) {
		this.conj_conoc_0 = conj_conoc_0;
	}



	public int getConj_conoc_1() {
		return conj_conoc_1;
	}



	public void setConj_conoc_1(int conj_conoc_1) {
		this.conj_conoc_1 = conj_conoc_1;
	}



	public int getConj_conoc_2() {
		return conj_conoc_2;
	}



	public void setConj_conoc_2(int conj_conoc_2) {
		this.conj_conoc_2 = conj_conoc_2;
	}



	public int getConj_conoc_3() {
		return conj_conoc_3;
	}



	public void setConj_conoc_3(int conj_conoc_3) {
		this.conj_conoc_3 = conj_conoc_3;
	}



	public int getConj_conoc_4() {
		return conj_conoc_4;
	}



	public void setConj_conoc_4(int conj_conoc_4) {
		this.conj_conoc_4 = conj_conoc_4;
	}



	public int getConj_conoc_5() {
		return conj_conoc_5;
	}



	public void setConj_conoc_5(int conj_conoc_5) {
		this.conj_conoc_5 = conj_conoc_5;
	}



	public int getConj_conoc_6() {
		return conj_conoc_6;
	}



	public void setConj_conoc_6(int conj_conoc_6) {
		this.conj_conoc_6 = conj_conoc_6;
	}



	public int getConj_conoc_7() {
		return conj_conoc_7;
	}



	public void setConj_conoc_7(int conj_conoc_7) {
		this.conj_conoc_7 = conj_conoc_7;
	}



	public int getConj_conoc_8() {
		return conj_conoc_8;
	}



	public void setConj_conoc_8(int conj_conoc_8) {
		this.conj_conoc_8 = conj_conoc_8;
	}



	public int getConj_conoc_9() {
		return conj_conoc_9;
	}



	public void setConj_conoc_9(int conj_conoc_9) {
		this.conj_conoc_9 = conj_conoc_9;
	}



	public int getCa() {
		return ca;
	}



	public void setCa(int ca) {
		this.ca = ca;
	}



	public int getTamaño() {
		return tamaño;
	}



	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}



	public int getAlienamientoBM() {
		return alienamientoBM;
	}



	public void setAlienamientoBM(int alienamientoBM) {
		this.alienamientoBM = alienamientoBM;
	}



	public int getAlienamientoLC() {
		return alienamientoLC;
	}



	public void setAlienamientoLC(int alienamientoLC) {
		this.alienamientoLC = alienamientoLC;
	}



	public String getDeidad() {
		return deidad;
	}



	public void setDeidad(String deidad) {
		this.deidad = deidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getAspecto() {
		return aspecto;
	}



	public void setAspecto(String aspecto) {
		this.aspecto = aspecto;
	}



	public String getPersonalidad() {
		return personalidad;
	}



	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}



	public String getTransfondo() {
		return transfondo;
	}



	public void setTransfondo(String transfondo) {
		this.transfondo = transfondo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getDinero() {
		return dinero;
	}



	public void setDinero(int dinero) {
		this.dinero = dinero;
	}



	public List<Item> getInvetario() {
		return invetario;
	}



	public void setInvetario(List<Item> invetario) {
		this.invetario = invetario;
	}



	public String getClase() {
		return clase;
	}



	
	
	

	public void setClase(String clase) {
		this.clase = clase;
	}



	//si le paso FUERZA quiero la suma que afecta a fuerza
	//si le paso FUERZA, RAZA quiero el valor del modif de fuerza obtenido por raza
	public int getModificador(String atributo) {
		int res =0;
		for ( Modificador m : modificadores) {
			if (atributo.compareTo(m.getAtributo())==0 ) {
				res += m.getValor();
			}
		}
		return res;
	}
	
	
	public int getModificador(String atributo, String fuente ) {
		int res =0;
		for ( Modificador m : modificadores) {
			if (fuente.compareTo(m.getFuente())==0 && atributo.compareTo(m.getAtributo())==0 ) {
				res += m.getValor();
			}
		}
		return res;
	}
 
	
	

}
