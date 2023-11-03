
package domain;

public class guiones {
    static char[] getGuionesFromPalabra(String palabra){
//Con este metodo se recibira la palabra y la escondera con un guion bajo        
//Se cuentan las letras de la palabra secreta con la funcion length
        int nLetrasPalabraSecreta = palabra.length();
        //array de char: (creamos una array de letras que se rellenaran con guiones bajo)
        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        //Para rellenar la palabra secreta con guiones se utiliza un ciclo foro for donde se le pide al programa que recorra la longitud de la palabra y reemplace las letras con el guion bajo)
        for(int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_'; //comillas simples
            
        }
    return palabraGuiones;
}//se devuelve palabraGuiones
}
