public class Veiculo {
    private String marca;
    protected boolean ligado;
    private double tanque;
    protected double consumo;
    protected double velocidadeAtual;
    protected double litragemDoTanque;
    protected double velocidadeMaxima;

    // construtor
    public Veiculo(String marca, double tanque, double consumo, double velocidadeMaxima) {
        this.marca = marca;
        this.ligado = false;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = 0;
        this.litragemDoTanque = tanque;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // gets e sets
    public void chavear() {
        ligado = !ligado;
    }

    public void acelerar() {
        if (ligado && velocidadeAtual < velocidadeMaxima) {
            velocidadeAtual += 1;
        }
    }

    public void frear() {
        if (ligado && velocidadeAtual > 0) {
            velocidadeAtual -= 1;
        }
    }

    //metodos
    public void corrida(double distancia) {
        if (ligado) {
            double litragemNecessaria = distancia / consumo;
            if (litragemNecessaria > litragemDoTanque) {
                System.out.println("sem combustivel suficiente");
                velocidadeAtual = 0;
                litragemDoTanque = 0;
                double kmFaltando = distancia - (litragemDoTanque * consumo);
                System.out.println("falta: " + kmFaltando );
            } else {
                litragemDoTanque -= litragemNecessaria;
                System.out.println(  distancia + " km.");
            }
        } else {
            System.out.println("carro desligado");
        }
    }
}



