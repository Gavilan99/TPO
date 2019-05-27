package tools;

import apis.ColaTDA;
import apis.PilaTDA;
import implementaciones.ColaPU;
import implementaciones.PilaTF;

public class Metodos {
	
	/************pilas************/
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
	

	
public static void invertirContenidoPila(PilaTDA o) {
	int a[]=new int[20];
	int i=0;
	while(!o.PilaVacia()) {
		a[i]=o.Tope();
		i++;
		o.Desapilar();
	}
	
	for(int j=0;j<i;j++) {
		o.Apilar(a[j]);
	}
}

public static  int contarElementosPila(PilaTDA o) {
	int element=0;
	PilaTDA aux= new PilaTF();
	CopiarPila(o,aux);
	while (!aux.PilaVacia()) {
		element ++;
		aux.Desapilar();
	}
	return element;
}

public static int sumarElemPila(PilaTDA o) {
	int element=0;
	PilaTDA aux= new PilaTF();
	CopiarPila(o,aux);
	while (!aux.PilaVacia()) {
		element += aux.Tope();
		aux.Desapilar();
	}
	return element;
}

public static int promElemPila(PilaTDA o) {
	return (sumarElemPila(o)/contarElementosPila(o));
}

	
/*********colas********/	
//ejercicio 4-a)
public static void pasarCola(ColaTDA o,ColaTDA d) {
	while(!o.ColaVacia()) {
	d.Acolar(o.Primero());
	o.Desacolar();
	}
}
//ejercicio 4-b)

public static void invertirColaConPila(ColaTDA co) {
	PilaTDA p = new PilaTF();
	p.InicializarPila();
	while(!co.ColaVacia()) {
		p.Apilar(co.Primero());
		co.Desacolar();
	}
	while(!p.PilaVacia()) {
		co.Acolar(p.Tope());
		p.Desapilar();
	}
	
}
//ejercicio 4-c)
public static void invertirCola(ColaTDA co) {
	int [] a = new int[100];
	int i=0;
	while(!co.ColaVacia()) {
		a[i]=co.Primero();
		co.Desacolar();
		i++;
	}
	for(i--;i>=0;i--) {
		co.Acolar(a[i]);
	}
	
}
//ejercicio 4 -d)
public static boolean ultimoElementoIgual(ColaTDA c1,ColaTDA c2) {
	invertirCola(c1);
	invertirCola(c2);
	return (c1.Primero() == c2.Primero());
}

//ejercicio 4 -e)
public static boolean esCapicuaCola(ColaTDA c1,ColaTDA c2) {

	if(!c1.ColaVacia() && !c2.ColaVacia()) {
		while(!c1.ColaVacia() && c1.Primero()==c2.Primero()) {
		c1.Desacolar();
		c2.Desacolar();
	}
	return (c1.ColaVacia())?true:false;
	}
	else return false;
}

public static boolean capicuaInversaCola(ColaTDA c1, ColaTDA c2) {
	invertirCola(c1);
	invertirCola(c2);
	return esCapicuaCola(c1,c2);
}

public static void mostrarCola(ColaTDA a) {
	ColaTDA aux= new ColaPU();
	aux.InicializarCola();
	while(!a.ColaVacia()) {
		int valor=a.Primero();
		aux.Acolar(valor);
		System.out.print(valor+" ");
		a.Desacolar();
	}
	while(!aux.ColaVacia()) {
		a.Acolar(aux.Primero());
		aux.Desacolar();
	}
	
}

}                                                                                                                                    