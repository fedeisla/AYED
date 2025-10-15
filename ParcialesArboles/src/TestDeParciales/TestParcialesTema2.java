package TestDeParciales;
import java.util.List;

import Estructuras.GeneralTree;
import Parciales2025.ParcialArbolesTema2;

public class TestParcialesTema2 {

	public static void main(String[] args) {
		// Nivel más profundo
        GeneralTree<Integer> nodo8 = new GeneralTree<>(-1);

        // Subárboles intermedios
        GeneralTree<Integer> nodo6_izq = new GeneralTree<>(8);
        nodo6_izq.addChild(nodo8);

        GeneralTree<Integer> nodo1 = new GeneralTree<>(7);
        GeneralTree<Integer> nodo4 = new GeneralTree<>(-5);

        // Rama izquierda del nodo 2
        GeneralTree<Integer> nodo3 = new GeneralTree<>(-2);
        nodo3.addChild(nodo1);
        nodo3.addChild(nodo4);
        nodo3.addChild(nodo6_izq);

        // Rama derecha del nodo 2
        GeneralTree<Integer> nodo6_der = new GeneralTree<>(-4);
        GeneralTree<Integer> nodo5 = new GeneralTree<>(6);
        nodo5.addChild(nodo6_der);
        // Raíz
        GeneralTree<Integer> raiz = new GeneralTree<>(5);
        raiz.addChild(nodo3);
        raiz.addChild(nodo5);

       List<Integer> resultado = ParcialArbolesTema2.caminoSignoAlternante(raiz);
       System.out.print(resultado);
	}

}
