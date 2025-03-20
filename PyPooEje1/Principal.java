package PyPooEje1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        //CONTENEDOL

        ContainerRect contenedor = new ContainerRect(5);

        //PRIMER RECT
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 1 PARA R1 ");
        System.out.println("ESQUINA1 X de R1: ");
        double r1x1=scan.nextDouble();
        System.out.println("ESQUINA1 Y de R1: ");
        double r1y1=scan.nextDouble();
        System.out.println(r1x1+" "+r1y1);
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 2 PARA R1 ");
        System.out.println("ESQUINA2 X de R1: ");
        double r1x2=scan.nextDouble();
        System.out.println("ESQUINA2 Y de R1: ");
        double r1y2=scan.nextDouble();
        System.out.println(r1x2+" "+r1y2);
        Rectangulo Rectangulo1= new Rectangulo(new Coordenada(r1x1,r1y1), new Coordenada(r1x2,r1y2));
        contenedor.anadirRectangulo(Rectangulo1);

        //SEGUNDO RECT
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 1 PARA R2 ");
        System.out.println("ESQUINA1 X de R2: ");
        double r2x1=scan.nextDouble();
        System.out.println("ESQUINA1 Y de R2: ");
        double r2y1=scan.nextDouble();
        System.out.println(r2x1+" "+r2y1);
        System.out.println("INGRESE LAS COORDENADAS DE LA ESQUINA 2 PARA R2 ");
        System.out.println("ESQUINA2 X de R2: ");
        double r2x2=scan.nextDouble();
        System.out.println("ESQUINA2 Y de R2: ");
        double r2y2=scan.nextDouble();
        System.out.println(r2x2+" "+r2y2);
        Rectangulo Rectangulo2= new Rectangulo(new Coordenada(r2x1,r2y1), new Coordenada(r2x2,r2y2));
        contenedor.anadirRectangulo(Rectangulo2);

        //USAMOS EL METODO QUE SOBREESCRIBIMOS EN LA NUEVA CLASE CONTAINER
        System.out.println("Se crearon los rectángulos: ");
        System.out.println(contenedor.toString());
        
        System.out.println("Rectángulo A = " + Rectangulo1);
        System.out.println("Rectángulo B = " + Rectangulo2);


        System.out.println("EL VERIFICADOR DICE: ");
        if(Verificador.esSobrePos(Rectangulo1, Rectangulo2)){
            System.out.println("El Rectángulo A y B estan sobre puestos");

            Rectangulo rectSobrePuesto = Verificador.rectanguloSobre(Rectangulo1, Rectangulo2);
            if (rectSobrePuesto != null) {
                System.out.println("Área de la sobreposición: " + rectSobrePuesto.calculoArea());
            }

        }else if (Verificador.esJunto(Rectangulo1, Rectangulo2)){
            System.out.println("El Rectángulo A y B  estan Juntos");
        }else if (Verificador.esDisjunto(Rectangulo1, Rectangulo2)){
            System.out.println("El Rectángulo A y B estan disjuntos");
        }

        scan.close();

    }
}
