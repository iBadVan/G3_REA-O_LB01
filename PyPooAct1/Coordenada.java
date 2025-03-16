package PyPooAct1;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada(){
        this.x=0;
        this.y=0;
    }

    public Coordenada(int nx, int ny){
        this.x=nx;
        this.y=ny;
    }

    public Coordenada( Coordenada co){
        this.x=co.x;
        this.y=co.y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int nx){
        this.x=nx;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int ny){
        this.y=ny;
    }

    public double distancia(Coordenada co){
        double dx=this.x-co.x;
        double dy=this.y-co.y;

        double sumacuadrados=(dx*dx)+(dy*dy);

        return Math.sqrt(sumacuadrados);
    }

    public static double distancia(Coordenada co1,Coordenada co2){
        return co1.distancia(co2);
    }

    public String toString(){
        return "Coordenadas: "+x+" , "+y;
    }
}
