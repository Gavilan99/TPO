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
		po.Apilar(2);
		po.Apilar(3);
		PilaTF pd=new PilaTF();
		pd.InicializarPila();
		Metodos. MostrarPila(po);
		//a) pasar una pila a otra
		Metodos.PasarPila(po, pd);
		PilaTF aux=new PilaTF();
		aux.InicializarPila();
		Metodos. MostrarPila(pd);
		
	}

}
