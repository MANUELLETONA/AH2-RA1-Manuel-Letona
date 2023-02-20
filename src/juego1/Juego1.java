
package juego1;
import java.util.Scanner;
public class Juego1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        boolean salir = false; 
        
        System.out.println("------MENÚ PRI1NCIPAL------");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Retornar juego");
        System.out.println("3. Salir");
        
        System.out.println(" ");
        int menu=0;
    menu = sp.nextInt();
        switch (menu){
                case 1: 
                    int numero [][] = new int[8][8];
        char jugador [][]=new char[8][8];
        char trampas [][]=new char[8][8];
               
            int posicion = 0;
                    
        int valor =64;
        boolean cambio = true;
        
        for (int i=0; i<numero.length; i++){
            if (cambio){
                for (int j = numero[i].length-1;j<=0;j--){
                    numero[i][j]=valor;
                    valor--;
                }
                cambio = false;
            } else {
                for (int j=0; j<numero[i].length;j++){
                    numero[i][j]=valor;
                    valor--;
                }
                cambio = true;
            }                    
          }
        
        trampas[0][1]='#';
        trampas[2][7]='#';
        trampas[2][1]='#';
        trampas[4][1]='#';
        trampas[5][1]='#';
        trampas[5][0]='#';
        trampas[6][3]='#';
        trampas[7][6]='#';
        jugador[7][7]='@';
        while (posicion<=64){
             System.out.println("----------------------------------------------");
                for ( int i = 0; i<numero.length; i++){
                    for ( int j = 0; j<numero.length; j++){ 
                        
                        if (numero[i][j]<10){
                        System.out.print("|    "+numero[i][j]);
                            }else {
                                System.out.print("|   "+numero[i][j]);
                            }
                    } 
                    System.out.println("|    ");
                    for (int j=0; j< trampas.length; j++){
                    System.out.print("|     "+jugador[i][j]+trampas[i][j]);   
                    }
                    
                    System.out.println("|     ");
                    System.out.println("------------------------------------------------");
                } 
                System.out.println("Deseas tirar el dado con r o salir al menu con p");
                String opcion = sp.nextLine();
                
                for (int i=0; i<jugador.length;i++){
                                for (int j=0;j<jugador.length;j++){
                                    jugador[i][j]=' ';
                                }
                                    
                            }
                
                switch (opcion){
                        case "r":
                            int dado =(int)(Math.random()*(6-2)+2);
                            System.out.println("Tu dado salio con "+dado);
                            posicion += dado;
                            
                            if (posicion >=56){
                                jugador[0][21-posicion]='@';
                            }else if (posicion>=48){
                                jugador[1][21-posicion]='@';
                            }else if (posicion>=40){
                                jugador[2][21-posicion]='@';
                            }else if (posicion>=32){
                                jugador[3][21-posicion]='@';
                            }else if (posicion>=24){
                                jugador[4][21-posicion]='@';
                            }else if (posicion>=16){
                                jugador[5][21-posicion]='@';
                            }else if (posicion>=8){
                                jugador[1][posicion-8]='@';
                            }else{
                                jugador[7][7-posicion]='@';
                            }
                                                      
                            break;
                        case "p":
                            System.out.println("------MENÚ PRI1NCIPAL------");
                            System.out.println("1. Iniciar juego");
                            System.out.println("2. Retornar juego");
                            System.out.println("3. Salir");
                            break;
            }
        }
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;                    
                case 3: 
                    System.out.println("Opcion ");
                    salir=true;
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 3");
                    
            }
            
    }
    
}
