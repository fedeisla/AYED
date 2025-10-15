package TestDeParciales;
import java.util.*;

import Estructuras.GeneralTree;
import Parciales2025.ParcialArbolesTema1;

public class TestParcialesTema1 {

	public static void main(String[] args) {
	        // Nivel más profundo
	        GeneralTree<Integer> nodo8 = new GeneralTree<>(8);

	        // Subárboles intermedios
	        GeneralTree<Integer> nodo6_izq = new GeneralTree<>(6);
	        nodo6_izq.addChild(nodo8);

	        GeneralTree<Integer> nodo1 = new GeneralTree<>(1);
	        GeneralTree<Integer> nodo4 = new GeneralTree<>(4);

	        // Rama izquierda del nodo 2
	        GeneralTree<Integer> nodo3 = new GeneralTree<>(3);
	        nodo3.addChild(nodo1);
	        nodo3.addChild(nodo4);
	        nodo3.addChild(nodo6_izq);

	        // Rama derecha del nodo 2
	        GeneralTree<Integer> nodo6_der = new GeneralTree<>(6);
	        GeneralTree<Integer> nodo5 = new GeneralTree<>(5);
	        nodo5.addChild(nodo6_der);

	        // Raíz
	        GeneralTree<Integer> raiz = new GeneralTree<>(2);
	        raiz.addChild(nodo3);
	        raiz.addChild(nodo5);

	       List<Integer> resultado = ParcialArbolesTema1.caminoParidadAlternante(raiz);
	       System.out.print(resultado);
	    }
	
}
