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

    public void anadirRectangulo(Rectangulo rectangulito){
        if (numRect<n){
            this.arregloRectangulos[numRect]=rectangulito;
            this.distancias[numRect]=rectangulito.getEsquina1().distancia(rectangulito.getEsquina2());
            this.areas[numRect]=rectangulito.calculoArea();
            numRect++;
        } else {
            System.out.println("NO HAY ESPACIO");
        }
    }

    @Override
    public String toString(){
        StringBuilder textoF = new StringBuilder();
        
        for (int i=0; i<numRect; i++){

            Coordenada esquina1=new Coordenada(arregloRectangulos[i].getEsquina1()); 
            Coordenada esquina2=new Coordenada(arregloRectangulos[i].getEsquina2()); 

            String coordenadas="["+esquina1.getX()+", "+esquina1.getY()+"] " + " ["+esquina2.getX()+", "+esquina2.getY()+"]" ;

            textoF.append( "|| #Rectagngulo: "+ (i+1) );
            textoF.append( " || Coordenadas: "+coordenadas );
            textoF.append( " || Distancia: " + distancias[i] );
            textoF.append( " || Área: "+ areas[i] );
              

        }
        return textoF.toString();
        
    }

}



