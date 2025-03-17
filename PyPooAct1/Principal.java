package PyPooAct1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 1 PARA R1 ");
        System.out.println("ESQUINA1 X de R1: ");
        int r1x1=scan.nextInt();
        System.out.println("ESQUINA1 Y de R1: ");
        int r1y1=scan.nextInt();
        System.out.println(r1x1+" "+r1y1);
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 2 PARA R1 ");
        System.out.println("ESQUINA2 X de R1: ");
        int r1x2=scan.nextInt();
        System.out.println("ESQUINA2 Y de R1: ");
        int r1y2=scan.nextInt();
        System.out.println(r1x2+" "+r1y2);
        Rectangulo Rectangulo1= new Rectangulo(new Coordenada(r1x1,r1y1), new Coordenada(r1x2,r1y2));

        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 1 PARA R2 ");
        System.out.println("ESQUINA1 X de R2: ");
        int r2x1=scan.nextInt();
        System.out.println("ESQUINA1 Y de R2: ");
        int r2y1=scan.nextInt();
        System.out.println(r2x1+" "+r2y1);
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 2 PARA R2 ");
        System.out.println("ESQUINA2 X de R2: ");
        int r2x2=scan.nextInt();
        System.out.println("ESQUINA2 Y de R2: ");
        int r2y2=scan.nextInt();
        System.out.println(r2x2+" "+r2y2);
        Rectangulo Rectangulo2= new Rectangulo(new Coordenada(r2x1,r2y1), new Coordenada(r2x2,r2y2));

        System.out.println("Se crearon los rectangulos: R1: "+Rectangulo1+" ; R2: "+Rectangulo2);
        
        System.out.println("EL VERIFICADOR DICE: ");
        if(Verificador.esSobrePos(Rectangulo1, Rectangulo2)){
            System.out.println("Estan sobre puestos");
        }else if (Verificador.esJunto(Rectangulo1, Rectangulo2)){
            System.out.println("Estan Juntos");
        }else if (Verificador.esDisjunto(Rectangulo1, Rectangulo2)){
            System.out.println("Estan disjuntos");
        }

        scan.close();

    }
}
