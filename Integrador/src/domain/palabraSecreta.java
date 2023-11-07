
package domain;

import java.util.Random;

class palabraSecreta {
//Metodo estático para la palabra secreta que devuelve la palabra secreta, es decir un string
    static String obtenerPalabraSecreta() {
        //Array de palabras 
        String [] palabras = {"perro","tecnologica","mendoza","universidad","arquitectura", "ovoviviparo", "caleidoscopio", "campo", "juega", "mina", "jazmin", "carnear", "limon", "bondadoso", "desquiciado", "eolico", "modernismo", "sindicato", "localmente", "barbacoa", "blanquecino", "armario", "decisivo", "teclado","proyecto","github","switch","herencia","polimorfismo","encapsulamiento","obstraccion"};
        //Usamos la clase random para elegir una palabra al azar 
        Random r = new Random(); //Hay que importar la clase Random
        //Esto generará un numero aleatorio (-1 a la cantidad de palabras que tenemos para que entre dentro del rango)
        int n = r.nextInt(palabras.length); //palabra.length es la longitd de las palabras
        
        //Este paso muestra qué palabra secreta se eligio 
        return palabras[n]; //retorna la palabra secreta
}


    static int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


