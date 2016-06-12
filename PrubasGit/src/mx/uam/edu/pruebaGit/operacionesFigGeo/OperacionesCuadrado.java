package mx.uam.edu.pruebaGit.operacionesFigGeo;

import mx.uam.edu.pruebaGit.figGeometricas.Cuadrado;

/**
 *
 * @author Isaac MG
 */
public class OperacionesCuadrado {
    
    public static int perimetro(Cuadrado c){
        return c.getAltura()*2 + c.getBase()*2;
    }
    
    public static int area(Cuadrado c){
        return c.getBase()*c.getAltura();
    }
    
    
}
