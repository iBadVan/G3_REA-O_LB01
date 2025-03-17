package PyPooAct1;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada co1, Coordenada co2){
        this.esquina1=new Coordenada(co1);
        this.esquina2=new Coordenada(co2);
    }

    public Coordenada getEsquina1() { 
        return esquina1; 
    }

    public void setEsquina1(Coordenada co) { 
        this.esquina1 = new Coordenada(co); 
    }

    public Coordenada getEsquina2() { 
        return esquina2; 
    }
    public void setEsquina2(Coordenada co) { 
        this.esquina2 = new Coordenada(co); 
    }

    public String toString() {
        return "Rectangulo [" + esquina1 + ", " + esquina2 + "]";
    }

}
