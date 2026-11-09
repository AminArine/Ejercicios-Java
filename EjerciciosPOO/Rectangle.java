public class **{
    float alto,ancho;
    public **(float alto,float ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
    protected float area(float alto,float ancho){
        return alto*ancho;
    }
    protected float perimetro(float alto,float ancho){
        return (alto+ancho)*2;
    }
    
}