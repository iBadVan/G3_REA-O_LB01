package PyPooEje1;

public class ContainerRect {

    private Rectangulo[] arregloRectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private int numRect; //contadol de ractangulos hasta ciertos tiempos;

    public ContainerRect (int tamano){
        this.n=tamano;
        this.arregloRectangulos=new Rectangulo[tamano];
        this.distancias= new double[tamano];
        this.areas= new double[tamano];
        int numRect=0;
    }

    


    
}
