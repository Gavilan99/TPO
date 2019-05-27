package test;

import apis.ColaTDA;
import implementaciones.ColaPU;
import implementaciones.PilaTF;
import tools.Metodos;

public class TP1 {
//ejercicio a para la implementación Pila ejercicio 1 y ejercicio 2 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	PilaTF po=new PilaTF();
		po.InicializarPila();
		po.Apilar(1);
		po.Apilar(7);
		po.Apilar(3);
		po.Apilar(90);
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
		*/
		// cola ejercicio 3 y 4 con implementacion ColaPU
		ColaTDA co=new ColaPU();
		ColaTDA cd=new ColaPU();
		co.InicializarCola();
		cd.InicializarCola();
		co.Acolar(10);
		co.Acolar(11);
		co.Acolar(16);
		co.Acolar(20); 
		Metodos.pasarCola(co,cd);
		System.out.print( "Cola destino: ");
		Metodos.mostrarCola(cd);
		Metodos.invertirCola(cd);
		//Metodos.invertirColaConPila(cd);
		System.out.println(" ");
		System.out.print("Luego de invertir con pila aux: ");
		Metodos.mostrarCola(cd);
		System.out.println(" ");
		//prueba ejercicio d
		co.InicializarCola();
		cd.InicializarCola();
		co.Acolar(8);
		co.Acolar(15);
		co.Acolar(6);
		cd.Acolar(8);
		cd.Acolar(15);
		cd.Acolar(6);
		Boolean result= Metodos.capicuaInversaCola(co, cd);
		//Boolean result=Metodos.esCapicuaCola(co,cd);
		//Boolean result=Metodos.ultimoElementoIgual(co,cd);
		System.out.println("Resultado: " + result);		
	}
}
