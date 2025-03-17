package PyPooAct1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 1 PARA R1 ");
        System.out.println("ESQUINA1 X de R1: ");
        int x1=scan.nextInt();
        System.out.println("ESQUINA1 Y de R1: ");
        int y1=scan.nextInt();
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 2 PARA R1 ");
        System.out.println("ESQUINA2 X de R1: ");
        int x2=scan.nextInt();
        System.out.println("ESQUINA2 Y de R1: ");
        int y2=scan.nextInt();

        Rectangulo Rectangulo1= new Rectangulo(new Coordenada(x1,y1), new Coordenada(x2,y2));

        


    }
}
