package tools;

import apis.PilaTDA;
import implementaciones.PilaTF;

public class Metodos {
	
	
	public static void PasarPila(PilaTDA o, PilaTDA d){
		while (!o.PilaVacia()){// Mientras pila origen no este vacia
			d.Apilar(o.Tope());
			o.Desapilar();
				}
     }
	
public static void CopiarPila(PilaTDA o, PilaTDA d){
	int a[]=new int[30]; 
	int i=0;
	while (!o.PilaVacia()){// Mientras pila origen no este vacia
		a[i]=o.Tope();
		i++;
		o.Desapilar();
			}
	d.InicializarPila();
	
	while (i!=0){// Mientras pila origen no este vacia
		i--;
		o.Apilar(a[i]);	
		d.Apilar(a[i]);
		
		}
		
}

public static void MostrarPila(PilaTDA o){
	
		PilaTDA aux= new PilaTF();
		CopiarPila(o,aux);
		while (!aux.PilaVacia()){// Mientras pila origen no este vacia
			System.out.print(aux.Tope());
			aux.Desapilar();
				}
		System.out.println("");
     }
	

	
	
	
	
		
}
	
	

