package implementaciones;

import apis.ColaPrioridadTDA;

public class ColaPrioridadDA implements ColaPrioridadTDA{
		int [] elementos; 
		int [] prioridades; 
		int indice;
		
		@Override
		public void inicializarCola() {
			indice = 0; 
			elementos = new int [100];
			prioridades = new int [100];
			
		}
		@Override
		public void acolarPrioridad(int x, int prioridad) {
			//desplaza a derecha los elementos de la cola mientras 
			//estos tengan mayor o igual prioridad que la de x 
			int j = indice;
			for ( ; j>0 && prioridades[j-1]>= prioridad; j-- )
			{ elementos[j] = elementos[j-1];
			prioridades[j] = prioridades[j-1];
			} 
			elementos[j] = x;
			prioridades[j] = prioridad;
			indice++;
		}
		@Override
		public void desacolar() {
			indice --;
			
		}
		@Override
		public int primero() {
			return elementos[indice -1]; 
			
		}
		@Override
		public boolean colaVacia() {
			return (indice == 0);
		}
		@Override
		public int prioridad() {
			 return prioridades[indice -1];
		}
} 


