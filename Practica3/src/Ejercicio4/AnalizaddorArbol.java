package Ejercicio4;



import java.util.List;

import ejercicio1.GeneralTree;
import tp1.Queue8.Queue;



public class AnalizaddorArbol {
private GeneralTree<AreaEmpresa> arbol;



public double devolverMaximoPromedio (GeneralTree<AreaEmpresa> arbol) {
	
	if ((arbol != null) && (!arbol.isEmpty())) {
		return devolverMaximoPromedioHelper (arbol);
	}
	return -1;
}



private double devolverMaximoPromedioHelper(GeneralTree<AreaEmpresa> arbol2) {
	int cantNodos = 0;
	double prom = 0;
	double promMax= Double.MIN_VALUE;
	Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
	GeneralTree<AreaEmpresa> aux;
	cola.enqueue(arbol);
	cola.enqueue(null);
	while (!cola.isEmpty()) {
		aux = cola.dequeue();
		if (aux != null) {
			cantNodos++;
			prom += aux.getData().getTardanza();
			List <GeneralTree<AreaEmpresa>> children = aux.getChildren();
			for (GeneralTree<AreaEmpresa> child : children) {
				cola.enqueue(child);
			}
		}
		else
			if (!cola.isEmpty()) {
				if (prom/cantNodos > promMax) {
					promMax = prom/cantNodos;
				}
				prom = 0;
				cantNodos = 0;
				cola.enqueue(null);
			}
		
	}
	return promMax;
	
	}
}

