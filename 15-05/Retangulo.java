public class Retangulo {
    private double base;
    private double altura;

    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo(5.0, 3.0);

        
        double area = retangulo.calcularArea();
        System.out.println("Área do retângulo: " + area);
    }
}
