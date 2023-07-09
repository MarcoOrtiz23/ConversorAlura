public abstract class Conversor {
    protected double valor;

    public Conversor(double valor) {
        this.valor = valor;
    }
    
    public abstract double convertir(double indiceConversion);

}
