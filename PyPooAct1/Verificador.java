package PyPooAct1;

public class Verificador {
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
        /*
        boolean verificarEsquinasMAYORES= r1.getEsquina1().getX()<=r2.getEsquina2().getX() && r1.getEsquina1().getY()<=r2.getEsquina2().getY();

        boolean verificarEsquinasMENORES= r2.getEsquina1().getX()<=r1.getEsquina2().getX() && r2.getEsquina1().getY()<=r1.getEsquina2().getY();

        return verificarEsquinasMENORES && verificarEsquinasMAYORES;
        NO funciona si es que uno esta dentro y en algunos casos de si esta al revés.
        */

        double r1X1 = Math.min(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Y1 = Math.min(r1.getEsquina1().getY(), r1.getEsquina2().getY());
        double r1X2 = Math.max(r1.getEsquina1().getX(), r1.getEsquina2().getX());
        double r1Y2 = Math.max(r1.getEsquina1().getY(), r1.getEsquina2().getY());

        



    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2){
        boolean juntoVertical = (r1.getEsquina2().getY() == r2.getEsquina1().getY() || r1.getEsquina1().getY() == r2.getEsquina2().getY()) &&
        (r1.getEsquina1().getX() < r2.getEsquina2().getX() && r1.getEsquina2().getX() > r2.getEsquina1().getX());

        boolean juntoHorizontal = (r1.getEsquina2().getX() == r2.getEsquina1().getX() || r1.getEsquina1().getX() == r2.getEsquina2().getX()) &&
        (r1.getEsquina1().getY() < r2.getEsquina2().getY() && r1.getEsquina2().getY() > r2.getEsquina1().getY());

        return juntoVertical || juntoHorizontal;
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2){

        if (esSobrePos(r1, r2) || esJunto(r1, r2) ){
            return false;
        } else { return true;}

    }
}
