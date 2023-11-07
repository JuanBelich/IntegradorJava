
package Ahorcado;


class guiones {

static char[] getGuionesFromPalabra(String palabra){
        //Se cuentan las letras de la palabra secreta 
        int nLetrasPalabraSecreta = palabra.length();
        //array de char
        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        //Para rellenar la palabra secreta con guiones 
        for(int i = 0; i < palabraGuiones.length; i++) {
         
            palabraGuiones[i] = '_'; //comillas simples
            
        }
    return palabraGuiones;
}
}


