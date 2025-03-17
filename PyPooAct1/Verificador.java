package PyPooAct1;

public class Verificador {
    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
        boolean noSuperponeX = r1.getEsquina2().getX() <= r2.getEsquina1().getX() || r1.getEsquina1().getX() >= r2.getEsquina2().getX();
        boolean noSuperponeY = r1.getEsquina2().getY() <= r2.getEsquina1().getY() || r1.getEsquina1().getY() >= r2.getEsquina2().getY();

        return !(noSuperponeX || noSuperponeY);
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
