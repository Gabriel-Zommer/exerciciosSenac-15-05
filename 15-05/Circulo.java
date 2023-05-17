public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);

        
        double area = circulo.calcularArea();
        System.out.println("Área do círculo: " + area);
    }
}

