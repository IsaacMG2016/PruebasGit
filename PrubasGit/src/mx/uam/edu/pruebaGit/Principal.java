package mx.uam.edu.pruebaGit;

import mx.uam.edu.pruebaGit.figGeometricas.Cuadrado;
import mx.uam.edu.pruebaGit.operacionesFigGeo.OperacionesCuadrado;

/**
 *
 * @author Isaac MG
 */
public class Principal {

    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado(5,5);
        System.out.println("Perimetro Cuadrado:"+OperacionesCuadrado.perimetro(c));
        System.out.println("Area Cuadrado:"+OperacionesCuadrado.area(c));
    }
    
}
