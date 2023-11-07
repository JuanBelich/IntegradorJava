
package domain;

import static domain.guiones.getGuionesFromPalabra;
import static domain.palabraSecreta.obtenerPalabraSecreta;
import java.util.Random;
import java.util.Scanner;


public class integrador {
    //Metodo MenuPrincipal
    public static void menuPrincipal(){
        System.out.println(" ***********************************************");
        System.out.println(" *                                             ");
        System.out.println(" *       Bienvenidos a la Juegoteca!           ");
        System.out.println(" *                                             ");
        System.out.println(" *   Elegi como queres perder tu tiempo        ");
        System.out.println(" *                                             "); 
        System.out.println(" * 1- Suerte                                   ");
        System.out.println(" *                                             ");
        System.out.println(" * 2- Busqueda del Tesoro                      ");
        System.out.println(" *                                             ");
        System.out.println(" * 3- 5mil                                     ");
        System.out.println(" *                                             ");
        System.out.println(" * 4- Ahorcado                                 ");
        System.out.println(" *                                             ");
        System.out.println(" * 5- Salir                                    ");
        System.out.println(" *                                             ");
        System.out.println(" ***********************************************");
    }
    ///////// JUEGO 1 SUERTE! /////////////////
    public static void suerte(int moneda, int tipeado){
        Scanner entrada=new Scanner(System.in);
        int num,cara;
        // ingreso de datos 1 o 2 para elegir cara o seca
        System.out.println("");
        System.out.println("Elegi: 1 = Cara o 2 = Cruz");
        tipeado=Integer.parseInt(entrada.nextLine());
        
        //control de los datos ingresados
        while(tipeado!=1 && tipeado!=2){
            System.out.println("");
            System.out.println("Opcion no valida");
            System.out.println("Elegi: 1 = Cara o 2 = Seca");
            tipeado=Integer.parseInt(entrada.nextLine());
        }
        // se crea un objeto de la clase random 
        Random aleatorio = new Random(System.currentTimeMillis());
         //utilizo el objeto de la clase Random para generar un valor aleatorio entre 1 y 2
        cara= aleatorio.nextInt(2)+1;
        //se muestra el resultado
        System.out.println(cara);
        //se le asigna el valor random a la variable moneda
        if(cara==1){
            moneda=1;
        }else{
            if(cara==2){
                moneda=2;
            }
            moneda=2;
        }
        //se compara la variable moneda con 1 o 2 para saber el resultado
        if(moneda == 1){
            System.out.println("");
            System.out.println("El resultado del azar es: Cara");
        }else{
            if(moneda == 2){
                System.out.println("");
                System.out.println("El resultado del azar es: Seca");
            }
        }
        //se compara para saber si el usuario gano o perdio
        if(moneda == tipeado){
            System.out.println("GANASTE!!");
        }else{
            System.out.println("PERDISTE :c ");
        }        
    }
    
    //////////////JUEGO 2 BUSQUEDA DEL TESORO //////////////////////////// 
    public static void llenarMatriz(int [][]matriz){
            Random aleatorio = new Random(System.currentTimeMillis());
            //cargar la matriz con 1 
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    matriz[i][j]=1;
                }
            }
            //se cargan en la matriz el numero 0 en posiciones aleatorias que serian los tesoros
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
        }
    public static void comparar(int [][]matriz, int pos,int intentos){
        /* metodo para saber si en la posicion ingresada por el usuario
          se encuentra un 0 que equivaldria al tesoro, si se encuentra un 0
          se da por ganado el juego y sino se resta un intento y se pide 
          que se ingrese un valor nuevo cando los intentos klleguen a 3
          el juego se termina*/
        Scanner entrada= new Scanner(System.in);
        do{
            if(matriz[0][0]==0 && pos==1){
                System.out.println("GANASTE");
                intentos=3;
            }else{
                if(matriz[0][1]==0 && pos==2){
                    System.out.println("GANASTE");
                    intentos=3;
                }else{
                    if(matriz[0][2]==0 && pos==3){
                        System.out.println("GANASTE");
                        intentos=3;
                    }else{
                        if(matriz[1][0]==0 && pos==4){
                            System.out.println("GANASTE");
                            intentos=3;
                        }else{
                            if(matriz[1][1]==0 && pos==5){
                                System.out.println("GANASTE");
                                intentos=3;
                            }else{
                                if(matriz[1][2]==0 && pos==6){
                                    System.out.println("GANASTE");
                                    intentos=3;
                                }else{
                                    if(matriz[2][0]==0 && pos==7){
                                        System.out.println("GANASTE");
                                        intentos=3;
                                    }else{
                                        if(matriz[2][1]==0 && pos==8){
                                            System.out.println("GANASTE");
                                            intentos=3;
                                        }else{
                                            if(matriz[2][2]==0 && pos==9){
                                                System.out.println("GANASTE");
                                                intentos=3;
                                            }else{
                                                System.out.println("PERDISTE! intenta de nuevo");
                                                System.out.println("Ingresa un numero entre 1 y 9 para intentar encontrar el tesoro perdido");
                                                pos=Integer.parseInt(entrada.nextLine());
                                                while(pos<1 || pos>9){
                                                    System.out.println("La opcion ingresada no es valida");
                                                    System.out.println("Ingresa un numero entre 1 y 9 para intentar encontrar el tesoro perdido");
                                                    pos=Integer.parseInt(entrada.nextLine());
                                                }
                                                intentos+=1;
                                                if(intentos==3){
                                                    System.out.println("PERDISTE!!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }while(intentos!=3);
    }
    public static void tesoro(int [][]matriz,int intentos){
            /*
                metodo principal del juego tesoro, menus e indicaciones
            */
            Scanner entrada= new Scanner(System.in);
            int pos,posTablero=1;
            
            System.out.println(" B I E N V E N I D O  A  L A   B U S Q U E D A   D E L   T E S O R O\n");
            System.out.println("   Tenes 4 intentos!\n");
            //se muestra la matriz con sus respectivas posiciones al usuario
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    System.out.print(" ["+posTablero+"] ");
                    posTablero+=1;
                }
                System.out.println("");
            }     
            //llamamos al metodo llenar matriz para agregar 1 y 0 en posiciones aleatorias
            llenarMatriz(matriz);
            
            //se pide al usuario que ingrese una posicion de la matriz para saber si esta el tesoro
            System.out.println("Ingresa un numero entre 1 y 9 para intentar encontrar el tesoro perdido");
            pos=Integer.parseInt(entrada.nextLine());
            //bucle de control de ingreso
            while(pos<1 && pos<9){
                System.out.println("Opcion no válida");
                System.out.println("Ingresa un numero entre 1 y 9 para intentar encontrar el tesoro perdido");
            pos=Integer.parseInt(entrada.nextLine());
            }
            
            // ahora comprobamos si hay 1 o 0 en la posicion
            comparar(matriz,pos,intentos);

        }
    
    /////////////////// JUEGO 3 CINCOMIL ///////////////////////////////////////
    public static void Cincomil(){
        System.out.println("");
        System.out.println("BIENVENIDOS AL 5MIL!!");
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*         - Reglas:                                           *");
        System.out.println("*         - Unos sueltos:20p c/u                              *");
        System.out.println("*         - Cincos sueltos:10p c/u                            *");
        System.out.println("*         - Cualquier terna de dados:200p                     *");
        System.out.println("*         - Escalera:500p                                     *");
        System.out.println("*   El primer jugador en llegar a los 1000p gana la partida   *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
        System.out.println("");
        System.out.println("Presione enter para continuar");
        Scanner entrada= new Scanner(System.in);
        String enter= entrada.nextLine();
        int dadoJugador = lanza1dado();
        int dadoContrincante = lanza1dado();
        System.out.println("se lanzara un dado al azar");
        System.out.println("quien saque el dado mas alto comienza jugando");
        System.out.println("dadoJugador = " + dadoJugador);
        System.out.println("dadoContrincante = " + dadoContrincante);
        if(dadoJugador == dadoContrincante){
        System.out.println("Empate de dados! Arrojan de nuevo");
        while(dadoJugador == dadoContrincante){
            dadoJugador = lanza1dado();
            dadoContrincante = lanza1dado();
            System.out.println("dadoJugador = " + dadoJugador);
            System.out.println("dadoContrincante = " + dadoContrincante);
            if(dadoJugador > dadoContrincante){
                System.out.println("El Jugador Comienza");
            }else{
                System.out.println("El Contrincante Comienza");
            }   
        }
        }else if(dadoJugador > dadoContrincante){
            System.out.println("El Jugador Comienza");
        }else{
            System.out.println("El Contrincante Comienza");
        }
        int puntajeJugador = 0,puntajeContrincante = 0,ronda = 1;
        do{
            System.out.println("Presione enter para avanzar a la siguiente ronda");
            Scanner entrada1= new Scanner(System.in);
            String enter2 = entrada1.nextLine();
            System.out.println("************");
            System.out.println("Ronda Nº:"+ronda);
            System.out.println("************");
            if(dadoJugador > dadoContrincante){
                System.out.println("Jugador Lanza los dados");
                int numJ[] = lanza5dados();
                int resultadoJ = puntajes(numJ);
                System.out.println("Puntos esta ronda = " + resultadoJ);
                puntajeJugador = puntajeJugador + resultadoJ;
                System.out.println("puntaje Total del jugador: "+puntajeJugador);
                System.out.println("");
                System.out.println("Contrincante lanza los dados");
                int numC[] = lanza5dados();
                int resultadoC = puntajes(numC);
                System.out.println("Puntos esta ronda = " + resultadoC);
                puntajeContrincante = puntajeContrincante + resultadoC;
                System.out.println("puntaje Total del contrincante: "+puntajeContrincante);
                System.out.println("");
            }else if(dadoContrincante > dadoJugador){
                System.out.println("Contrincante lanza los dados");
                int numC[] = lanza5dados();
                int resultadoC = puntajes(numC);
                System.out.println("Puntos esta ronda = " + resultadoC);
                puntajeContrincante = puntajeContrincante + resultadoC;
                System.out.println("puntaje Total del contrincante: "+puntajeContrincante);
                System.out.println("");
                System.out.println("Jugador lanza los dados");
                int numJ[] = lanza5dados();
                int resultadoJ = puntajes(numJ);
                System.out.println("Puntos esta ronda = " + resultadoJ);
                puntajeJugador = puntajeJugador + resultadoJ;
                System.out.println("puntaje Total del jugador: "+puntajeJugador);
                System.out.println("");
            
            }
            ronda = ronda+1;
        }while(puntajeJugador < 1000 && puntajeContrincante < 1000);
        if(puntajeJugador > puntajeContrincante){
            System.out.println("El jugador es el ganador con: "+puntajeJugador+" Puntos, Felicidades!");
            System.out.println("Puntaje del contrincante: "+puntajeContrincante);
            System.out.println("La partuda duró: "+(ronda-1)+" rondas");
        }else{
            System.out.println("El contrincante es el ganador con: "+puntajeContrincante+" Puntos, Suerte para la proxima!");
            System.out.println("Puntaje del jugador: "+puntajeJugador);
            System.out.println("La partuda duró: "+(ronda-1)+" rondas");
        }
    }
    public static int lanza1dado(){ //metodo encargado de lanzar un dado
        return (int)Math.floor(Math.random()*6+1);
    }
    public static int[] lanza5dados(){ //metodo encargado de lanzar 5 dados, ordenarlos y mostrarlos
        int dado1 = lanza1dado();
        int dado2 = lanza1dado();
        int dado3 = lanza1dado(); //lanzamiento de los 5 dados
        int dado4 = lanza1dado();
        int dado5 = lanza1dado();
        int dados[] = {dado1,dado2,dado3,dado4,dado5}; //asignacion del valor de los 5 dados al arreglo
        for(int i = 0;i < dados.length;i++){// ordenamiento del arreglo
            for(int j = 0;j < dados.length - 1;j++){
                if(dados[j] > dados[j+1]){
                    int temp = dados[j];
                    dados[j] = dados[j+1];
                    dados[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < dados.length;i ++ ){
            System.out.println("["+dados[i]+"]");// mostrado del arreglo ordenado
        }
        return dados;
    }
    public static int puntajes(int vectorD[]){
        int cont5 = 0,cont1 = 0,contT = 0,contE = 0,contEsc = 0;
        for(int i = 0; i < vectorD.length;i++){
            if(vectorD[i]==5){
                cont5 = cont5 + 1;
            }
            if(vectorD[i]==1){
                cont1 = cont1 + 1;
            }
        }
        if(cont5 !=0 ){
            System.out.println(cont5+" Cincos!");
        }
        if(cont1 !=0 ){
            System.out.println(cont1+" Unos!");
        }
        for(int i = 0;i < 3;i++){
            if((vectorD[i]==vectorD[i+1])&&(vectorD[i+1]==vectorD[i+2])){
                contT = 1;
            }
        }
        if(contT == 1){
            System.out.println("Terna!");
        }
        for(int i = 0; i < 4;i++){
            if(vectorD[i]+1 == vectorD[i+1]){
                contEsc = contEsc + 1;
            }
        }
        if(contEsc == 4){
            System.out.println("Escalera!");
            contE = 1;
        }
        int puntos = (cont5*10)+(cont1*20)+(contT*200)+(contE*500);
        return puntos;   
    }   
    
    ////////////////// JUEGO AHORCADO///////////////////////////////////////////
    public static void JuegoAhorcado() {
    
        //En esta parte se mostrará las palabras y su longitud a traves de un metodo
        String palabraSecreta = obtenerPalabraSecreta();
//        //Muestra la palabra
        //System.out.println(palabraSecreta);
        //Este es el metodo con el que se mostrarán las palabras escondidas usando un guion bajo
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
       
        //Para terminar el juego: Mientras que no acertemos todas las letras el juego no terminará, al transformarse en verdadero, le da final al juego
        boolean juegoTerminado = false;
        //Le pedimos una palabra al lector, para ello se hace un scanner, se va a leer del teclado.
        
            int intentos = 3;
            //Con un ciclo do, le pedimos al programa que haga lo siguiente:
            do {
                System.out.println("Te quedan " + intentos + " intentos");
                System.out.println(palabraGuiones);
                System.out.println("Ingresa una letra:");
                //Aqui se lee la palabra introducida, que nos interesa la primera letra, vez que tenemos esta letra hay que ver si está dentro de la palabra secreta.
                Scanner lector = new Scanner(System.in);
                char letra = (char) lector.next().charAt(0);
                boolean algunaLetraAcertada = false;
                //Con este ciclo recorremos la palabra para ver si la letra ingresada por el usuario coincide con alguna que haya en la palabra, la letra en la posicion i comparada con la introducida por el usuario.
                //si son iguales, (palabraGuiones[i]=letra) entonces usamos la variable se convierte en verdadera y se mostrara esa letra en la pantalla. (letraAcertada fue previamente declarada como falsa)
                for(int i = 0; i < palabraSecreta.length(); i++){
                    if(palabraSecreta.charAt(i) == letra ){
                        palabraGuiones[i] = letra;
                        algunaLetraAcertada = true;
                        }
                    }
                //En caso de que la variable "algunaLetraAcertada sea falsa, entonces se le mostrara al usuario un mensaje indicandole que no adivino una letra.
                    if(!algunaLetraAcertada){
                        System.out.println("No has acertado ninguna letra");
                        --intentos;       //cada vez que no se adivine una letra, se iran descontando intentos, que inicialmente se colocaron 5 intentos, y se modifica cuando no se acierta una letra, muestra un mensaje de error y va decrementando su valor hasta llegar a 0.                
                    }else{
                            boolean juegoGanado = !hayGuiones(palabraGuiones); //variable booleana que indica que si siguen habiendo guiones es porque aun no se adivina toda la palabra entonces el juego no ha terminado
                            if (juegoGanado){ //si el juego se ha ganado, es porque no hay guiones, se adivinaron todas las letras y se le mostrara al lector dicho resultado
                                System.out.println("Has ganado el juego!!");
                                System.out.println("La palabra era: "+palabraSecreta);
                                juegoTerminado=true; //esta variable rompe el ciclo
                            }
                        } //cuando el contador de intentos llega a cero es porque se le terminaron las oportunidades de adivinar las letras y no descubrio la palabra total, se le mostrara al usuario un mensaje y la variable juegoTerminado se convierte verdadera indicando que el juego finalizo, es para romper el ciclo.
                    if(intentos==0){
                            System.out.println("Agotaste los intentos");
                            juegoTerminado=true;
                    }
               //Mientras que el juego esté terminado, es decir esta variable booleana sea verdadero     
            }while(!juegoTerminado);
            
        
    }
    
   //Este metodo es para indicar si se adivino la palabra, se va a reemplazar el guion con la letra acertada
    static boolean hayGuiones(char[] array){
    for(char l:array){
        if(l=='_') 
            return true; //si L es igualigual a guion bajo, entonces retorna un verdadero, sino encontre ninguna letra retorna un falso
        }
        return false;
    }   
    
    //////////////////  PROCESO PRINCIPAL DEL PROGRAMA /////////////////////////
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int  moneda=0,tipeado=0,opcion=0,intentos = 0;
        int matriz[][]=new int[3][3];
        
        while(opcion!=5){
            menuPrincipal();
            System.out.println("");
            System.out.println("Elegi una de las 4 opciones o 5 para salir del juego");
            opcion=Integer.parseInt(entrada.nextLine());
            
            switch(opcion){
                case 1:
                    suerte(moneda,tipeado);
                    break;
                    
                case 2:
                    tesoro(matriz,intentos);
                    break;
                
                case 3:
                    Cincomil();
                    break;
                    
                case 4:
                    JuegoAhorcado();
                    break;
                case 5:
                    break;
            }
        }
    }    
}
