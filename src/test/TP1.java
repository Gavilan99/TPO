package test;

import implementaciones.PilaTF;
import tools.Metodos;

public class TP1 {
//ejercicio a para la implementación Pila 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaTF po=new PilaTF();
		po.InicializarPila();
		po.Apilar(1);
		po.Apilar(7);
		po.Apilar(3);
		po.Apilar(4);
		PilaTF pd=new PilaTF();
		pd.InicializarPila();
		Metodos. MostrarPila(po);
		//a) pasar una pila a otra
		Metodos.PasarPila(po, pd);
		PilaTF aux=new PilaTF();
		aux.InicializarPila();
		Metodos. MostrarPila(pd);
		
		//c) Invertir el contenido de una Pila. 
		Metodos.invertirContenidoPila(pd);
		Metodos. MostrarPila(pd);
		System.out.println("El tamaño de la pila:"+Metodos.contarElementosPila(pd));
		
		//e) Sumar los elementos de una Pila 
		System.out.println("Los elementos de la pila suman: "+Metodos.sumarElemPila(pd));
		
		//f) Calcular el promedio de los elementos de una Pila
		System.out.println("El promedio de la pila es: "+Metodos.promElemPila(pd));
	}

}
