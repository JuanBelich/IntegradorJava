
package domain;

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
        Random aleatorio = new Random(System.currentTimeMillis());
        cara= aleatorio.nextInt(2)+1; //utilizo el objeto de la clase Random para generar un valor aleatorio entre 1 y 2
        System.out.println(cara);
        if(cara==1){
            moneda=1;
        }else{
            if(cara==2){
                moneda=2;
            }
            moneda=2;
        }
        
        if(moneda == 1){
            System.out.println("");
            System.out.println("El resultado del azar es: Cara");
        }else{
            if(moneda == 2){
                System.out.println("");
                System.out.println("El resultado del azar es: Seca");
            }
        }
        if(moneda == tipeado){
            System.out.println("Ganaste!!");
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
            //se cargan en la matriz el numero 0 en posiciones aleatorias
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
            matriz[aleatorio.nextInt(3)][aleatorio.nextInt(3)]=0;
        }
    public static void comparar(int [][]matriz, int pos,int intentos){
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
            Scanner entrada= new Scanner(System.in);
            int pos,posTablero=1;
            
            System.out.println(" B I E N V E N I D O  A  L A   B U S Q U E D A   D E L   T E S O R O\n");
            System.out.println("   Tenes 4 intentos!\n");
            for(int i=0;i<=2;i++){
                for(int j=0;j<=2;j++){
                    System.out.print(" ["+posTablero+"] ");
                    posTablero+=1;
                }
                System.out.println("");
            }     
            llenarMatriz(matriz);
            
           for(int i=0;i==2;i++){
               for(int j=0;j==2;j++){
                   System.out.print("["+posTablero+"]");
                   posTablero+=1;
               }
               System.out.println("");
           }
            
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
    
    
    //////////////////  PROCESO PRINCIPAL DEL PROGRAMA /////////////////////////////////////////////////////////
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
                    break;
                    
                case 4:
                    break;
            }
        
        
        
        
        }
        
       
       
    }

    
      
}
