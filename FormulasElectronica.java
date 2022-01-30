package mainIdeas;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormulasElectronica {

	public static void main(String[] args) {
		
		float I,L,R,P,Q,S,V,W,p,q,t;
		float auxiliar,auxiliar2='*',auxiliar3='*';
		int opcion,opcion1,opcion2,opcion3,opcion4,opcion5;
		
		String nombre;
		String respuesta = JOptionPane.showInputDialog("Bienvenido al Programa de Calculo Funciones de Electronica \nEscribe tu nombre:");
		nombre=respuesta;
		System.out.print("Hola "+nombre);
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH");
		String horaActual = formateador.format(LocalDateTime.now());
		int hora = Integer.valueOf(horaActual);
		
		if (hora>12) {
			System.out.println(", buenas tardes.");
			}
		else {
			System.out.println(", buenos dias.");
			}
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Que Formula necesitas para trabajar:\nOpciones \n1) Corriente Electrica \n2) Diferencia de Potencial o Voltaje \n3) Resistencia Electrica \n4) Ley de Ohm \n5) Potencia Electrica"));
		
		switch(opcion) {
		
		case 1:
			opcion1=Integer.parseInt(JOptionPane.showInputDialog("Que necesitas hallar de la Formula Corriente Electrica\nOpciones: \n1) Intensidad (I) \n2) Carga Electrica (q) \n3) Tiempo (t)"));
			
						    
	    switch(opcion1) {
	    
		case 1:
			    System.out.print("Has elegido la formula de Corriente Electrica para hallar Intensidad (I=q/t)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de q"));
			    q=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de t"));
				t=auxiliar2;
				I=auxiliar/auxiliar2;
				System.out.print("La Intensidad es: "+I+" Amperes (A)");
				break;
			
		case 2:
				System.out.print("Has elegido la formula de Corriente Electrica para hallar la Carga Electrica (q=Ixt)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de I"));
				I=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de t"));
				t=auxiliar2;
				q=auxiliar*auxiliar2;
				System.out.print("La Carga Electrica es: "+q+ " Coulombs (C)");
				break;
		case 3:

				System.out.print("Has elegido la formula de Corriente Electrica para hallar el Tiempo (t=q/I)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de q"));
				q=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de I"));
				I=auxiliar2;
				t=auxiliar/auxiliar2;
				System.out.print("El Tiempo es: "+t+ "segundos (s)");
				break; 
				}
	    break;
		case 2:
			opcion2=Integer.parseInt(JOptionPane.showInputDialog("Que necesitas hallar de la Formula de Diferencia de Potencial o Voltaje\nOpciones: \n1) Joules (W) \n2) Volts (V) \n3) Coulombs (Q)"));
		    
		    switch(opcion2) {
		    case 1:
		    	System.out.print("Has elegido la formula de Diferencia de Potencial o Voltaje para hallar los Joules (W=QxV)\n");
		    	auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de Q"));
				Q=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de V"));
				V=auxiliar2;
				W=auxiliar*auxiliar2;
				System.out.print("El resultado es: "+W+ " Joules");
				break;
				
		    case 2:
				System.out.print("Has elegido la formula de Diferencia de Potencial o Voltaje para hallar los Volts (V=W/Q)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de W"));
				W=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de Q"));
				Q=auxiliar2;
				V=auxiliar/auxiliar2;
				System.out.print("El resultado es: "+V+ " Volts");
				break;
			
		    case 3:
				System.out.print("Has elegido la formula de Diferencia de Potencial o Voltaje para hallar los Coulombs (Q=W/V)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de W"));
				W=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de V"));
				V=auxiliar2;
				Q=auxiliar/auxiliar2;
				System.out.print("El resultado es: "+Q+ " Coulombs");
				break; 
				}
		break;
		case 3:
			opcion3=Integer.parseInt(JOptionPane.showInputDialog("Que necesitas hallar de la Formula de Resistencia Electrica\nOpciones: \n1) Resistencia (R) \n2) Resistividad (p) \n3) Seccion o Area (S) \n4) Largo (L)"));
		    
		   switch(opcion3) {
		   
		   case 1:
			    System.out.print("Has elegido la formula de Resistencia Electrica para hallar la Resistencia (R=pxL/S)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de p"));
				p=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de L"));
				L=auxiliar2;
				auxiliar3=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de S"));
				S=auxiliar3;
				R=(auxiliar*auxiliar2)/auxiliar3;
				System.out.print("El resultado es: "+R+ " Ohms");
				break;
				
			case 2:
			    System.out.print("Has elegido la formula de Resistencia Electrica para hallar la Resistividad (p=RxS/L)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de R"));
				R=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de S"));
				S=auxiliar2;
				auxiliar3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de L"));
				L=auxiliar3;
				p=(auxiliar*auxiliar2)/auxiliar3;
				System.out.print("El resultado es: "+p+ " (ohm.m)");
				break;
					
			case 3:
			    System.out.print("Has elegido la formula de Resistencia Electrica para hallar la Superficie o Area (S=pxL/R)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de p"));
				p=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de L"));
				L=auxiliar2;
				auxiliar3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de R"));
				R=auxiliar3;
				S=(auxiliar*auxiliar2)/auxiliar3;
				System.out.print("El resultado es: "+S+ " m2");
				break;
				
			case 4:
			    System.out.print("Has elegido la formula de Resistencia Electrica para hallar el Largo (L=RxS/p)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de R"));
				R=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de S"));
				S=auxiliar2;
				auxiliar3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de p"));
				p=auxiliar3;
				L=(auxiliar*auxiliar2)/auxiliar3;
				System.out.print("El resultado es: "+L+ " m");
				break; 
				}
		break;
		case 4:
			opcion4=Integer.parseInt(JOptionPane.showInputDialog("Que necesitas hallar de la Ley de Ohm\nOpciones: \n1) Resistencia (ohms) \n2) Voltaje (V) \n3) Intensidad (A)"));
		    
		    switch(opcion4) {
		    
			case 1:
				System.out.print("Has elegido la formula de Ley de Ohm para hallar la Resistencia (R=V/I)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de V"));
				V=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de I"));
				I=auxiliar2;
				R=auxiliar/auxiliar2;
				System.out.print("La Resistencia es: "+R+ " Ohms");
				break;
				
			case 2:
				System.out.print("Has elegido la formula de Ley de Ohm para hallar el Voltaje (V=IxR)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de I"));
				I=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de R"));
				R=auxiliar2;
				V=auxiliar*auxiliar2;
				System.out.print("El Voltaje es: "+V+ " Volts");
				break;
			
			case 3:
				System.out.print("Has elegido la formula de Ley de Ohm para hallar la Intensidad (I=V/R)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de V"));
				V=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de R"));
				R=auxiliar2;
				I=auxiliar/auxiliar2;
				System.out.print("La Intensidad es: "+I+ " Amperios");
				break; 
				}
		break;    
		case 5:
			opcion5=Integer.parseInt(JOptionPane.showInputDialog("Que necesitas hallar de la Formula de Potencia Electrica\nOpciones: \n1) Potencia (P) \n2) Tiempo (t) \n3) Energia (W) \n4) KW/H"));
		    
		    switch(opcion5) {
		    
			case 1:
			    System.out.print("Has elegido la formula de Potencia Electica para hallar la Potencia (P=W/t)\n");
			    auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de W"));
				W=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de t"));
				t=auxiliar2;
				P=auxiliar/auxiliar2;
				System.out.print("La Potencia es: "+P+ " Wats");
				break;
				
			case 2:
				System.out.print("Has elegido la formula de Potencia Electrica para hallar el Tiempo (t=W/P)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de W"));
				W=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de P"));
				P=auxiliar2;
				t=auxiliar/auxiliar2;
				System.out.print("El Tiempo es: "+t+ " segundos");
				break;
			
			case 3:
				System.out.print("Has elegido la formula de Potencia Electrica para hallar la Energia (W=Pxt)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de P"));
				P=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de t"));
				t=auxiliar2;
				W=auxiliar*auxiliar2;
				System.out.print("La Energia es: "+W+ " Jouls");
				break; 
				
			case 4:
				System.out.print("Has elegido la formula de Potencia Electrica para hallar los KW/H (W=Pxt)\n");
				auxiliar=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de P"));
				P=auxiliar;
				auxiliar2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de t"));
				t=auxiliar2;
				W=(auxiliar/1000)*(auxiliar2/3600);
				System.out.print("La Energia es: "+W+ " KW/H");
				break; 
				}
		    }
		}
	}