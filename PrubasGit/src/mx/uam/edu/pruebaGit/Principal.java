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
        
        System.out.println("Prueba 1 17 junio 2016");
        System.out.println("Prueba 2 17 Junio 2016");
        
        System.out.println("Prueba 1 17 junio 2016");
        System.out.println("Prueba 2 17 Junio 2016");
        
        int var1, var2, var3;
        var1 = 3;
        Integer integer = new Integer(3);
        System.out.println(integer.compareTo(var1));
     
        
        
    }
    
}
