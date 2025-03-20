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

        boolean noSeparadosX = !(r1X2 <= r2X1 || r1X1 >= r2X2);
        boolean noSeparadosY = !(r1Y2 <= r2Y1 || r1Y1 >= r2Y2);

        return noSeparadosX && noSeparadosY;
        
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
    
    }




}
