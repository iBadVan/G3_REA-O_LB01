package PyPooAct1;

public class Verificador {
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
        /*
        boolean verificarEsquinasMAYORES= r1.getEsquina1().getX()<=r2.getEsquina2().getX() && r1.getEsquina1().getY()<=r2.getEsquina2().getY();

        boolean verificarEsquinasMENORES= r2.getEsquina1().getX()<=r1.getEsquina2().getX() && r2.getEsquina1().getY()<=r1.getEsquina2().getY();

        return verificarEsquinasMENORES && verificarEsquinasMAYORES;
        NO funciona si es que uno esta dentro y en algunos casos de si esta al revés.
        */

        //ACA OBTENGO EL PAR ORDENADO MAS PEQUEÑO POSIBLE PARA CADA EL R1
        double r1X1, r1Y1, r1X2, r1Y2;
        if (r1.getEsquina1().getX() < r1.getEsquina2().getX()) {
            r1X1 = r1.getEsquina1().getX();
            r1X2 = r1.getEsquina2().getX();
        } else {
            r1X1 = r1.getEsquina2().getX();
            r1X2 = r1.getEsquina1().getX();
        }

        if (r1.getEsquina1().getY() < r1.getEsquina2().getY()) {
            r1Y1 = r1.getEsquina1().getY();
            r1Y2 = r1.getEsquina2().getY();
        } else {
            r1Y1 = r1.getEsquina2().getY();
            r1Y2 = r1.getEsquina1().getY();
        }

        //ACA OBTENGO EL PAR ORDENADO MAS PEQUEÑO POSIBLE PARA CADA EL R2 
        double r2X1, r2Y1, r2X2, r2Y2;
        if (r2.getEsquina1().getX() < r2.getEsquina2().getX()) {
            r2X1 = r2.getEsquina1().getX();
            r2X2 = r2.getEsquina2().getX();
        } else {
            r2X1 = r2.getEsquina2().getX();
            r2X2 = r2.getEsquina1().getX();
        }

        if (r2.getEsquina1().getY() < r2.getEsquina2().getY()) {
            r2Y1 = r2.getEsquina1().getY();
            r2Y2 = r2.getEsquina2().getY();
        } else {
            r2Y1 = r2.getEsquina2().getY();
            r2Y2 = r2.getEsquina1().getY();
        }

        boolean seSuperponenX = !(r1X2 <= r2X1 || r1X1 >= r2X2);
        boolean seSuperponenY = !(r1Y2 <= r2Y1 || r1Y1 >= r2Y2);

        return seSuperponenX && seSuperponenY;
        
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2){
        //APLicamos la misma logica de arriba

        double r1X1, r1Y1, r1X2, r1Y2;

        if (r1.getEsquina1().getX() < r1.getEsquina2().getX()) {
            r1X1 = r1.getEsquina1().getX();
            r1X2 = r1.getEsquina2().getX();
        } else {
            r1X1 = r1.getEsquina2().getX();
            r1X2 = r1.getEsquina1().getX();
        }

        if (r1.getEsquina1().getY() < r1.getEsquina2().getY()) {
            r1Y1 = r1.getEsquina1().getY();
            r1Y2 = r1.getEsquina2().getY();
        } else {
            r1Y1 = r1.getEsquina2().getY();
            r1Y2 = r1.getEsquina1().getY();
        }
        
        double r2X1, r2Y1, r2X2, r2Y2;
        if (r2.getEsquina1().getX() < r2.getEsquina2().getX()) {
            r2X1 = r2.getEsquina1().getX();
            r2X2 = r2.getEsquina2().getX();
        } else {
            r2X1 = r2.getEsquina2().getX();
            r2X2 = r2.getEsquina1().getX();
        }
    
        if (r2.getEsquina1().getY() < r2.getEsquina2().getY()) {
            r2Y1 = r2.getEsquina1().getY();
            r2Y2 = r2.getEsquina2().getY();
        } else {
            r2Y1 = r2.getEsquina2().getY();
            r2Y2 = r2.getEsquina1().getY();
        }

        boolean juntoVertical = (r1Y2 == r2Y1 || r1Y1 == r2Y2) && (r1X1 < r2X2 && r1X2 > r2X1);
        boolean juntoHorizontal = (r1X2 == r2X1 || r1X1 == r2X2) && (r1Y1 < r2Y2 && r1Y2 > r2Y1);

        return juntoVertical || juntoHorizontal;
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2){

        if (esSobrePos(r1, r2) || esJunto(r1, r2) ){
            return false;
        } else { return true;}

    }

    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        if (!esSobrePos(r1, r2)) {
            return null; 
        }
        double r1X1, r1Y1, r1X2, r1Y2;

        if (r1.getEsquina1().getX() < r1.getEsquina2().getX()) {
            r1X1 = r1.getEsquina1().getX();
            r1X2 = r1.getEsquina2().getX();
        } else {
            r1X1 = r1.getEsquina2().getX();
            r1X2 = r1.getEsquina1().getX();
        }

        if (r1.getEsquina1().getY() < r1.getEsquina2().getY()) {
            r1Y1 = r1.getEsquina1().getY();
            r1Y2 = r1.getEsquina2().getY();
        } else {
            r1Y1 = r1.getEsquina2().getY();
            r1Y2 = r1.getEsquina1().getY();
        }
        
        double r2X1, r2Y1, r2X2, r2Y2;
        if (r2.getEsquina1().getX() < r2.getEsquina2().getX()) {
            r2X1 = r2.getEsquina1().getX();
            r2X2 = r2.getEsquina2().getX();
        } else {
            r2X1 = r2.getEsquina2().getX();
            r2X2 = r2.getEsquina1().getX();
        }
    
        if (r2.getEsquina1().getY() < r2.getEsquina2().getY()) {
            r2Y1 = r2.getEsquina1().getY();
            r2Y2 = r2.getEsquina2().getY();
        } else {
            r2Y1 = r2.getEsquina2().getY();
            r2Y2 = r2.getEsquina1().getY();
        }

        //ahora calculamos la intersección
        double interX1, interY1, interX2, interY2;

        if (r1X1 > r2X1) {
            interX1 = r1X1;
        } else {
            interX1 = r2X1; 
        }
    
        if (r1Y1 > r2Y1) {
            interY1 = r1Y1;
        } else {
            interY1 = r2Y1; 
        }
    
        if (r1X2 < r2X2) {
            interX2 = r1X2; 
        } else {
            interX2 = r2X2;
        }
    
        if (r1Y2 < r2Y2) {
            interY2 = r1Y2; 
        } else {
            interY2 = r2Y2; 
        }

        return new Rectangulo(new Coordenada(interX1, interY1), new Coordenada( interX2, interY2));

    }




}
