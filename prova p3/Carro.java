public class Carro extends Veiculo {
    private String placa;
    private double gasolinaEspecial;

    //construtor
    public Carro(String marca, double tanque, double consumo, double velocidadeMaxima, String placa) {
        super(marca, tanque, consumo, velocidadeMaxima);
        this.placa = placa;
        this.gasolinaEspecial = 0;
    }

    //gets e sets
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void acelerar() {
        if (ligado && velocidadeAtual < velocidadeMaxima) {
            velocidadeAtual += 10; 
        }
    }

    
    public void frear() {
        if (ligado && velocidadeAtual > 0) {
            velocidadeAtual -= 5; 
        }
    }

    public void chavear() {
        if (ligado && velocidadeAtual > 0) {
            while (velocidadeAtual > 0) {
                frear();
            }
        }
        super.chavear();
    }

    public void corrida(double distancia, double gasolinaEspecial) {
        if (ligado) {
            double consumoTotal = (this.gasolinaEspecial > gasolinaEspecial) ? gasolinaEspecial * 0.5 + (distancia - gasolinaEspecial) / consumo : distancia / consumo;
            
            if (litragemDoTanque + this.gasolinaEspecial < consumoTotal) {
                System.out.println("sem combustivel suficiente");
                velocidadeAtual = 0;
                litragemDoTanque = 0;
                this.gasolinaEspecial = 0;
                double kmFaltando = distancia - (litragemDoTanque * consumo + this.gasolinaEspecial * 0.5);
                System.out.println("faltam: " + kmFaltando);
            } else {
                if (this.gasolinaEspecial >= gasolinaEspecial) {
                    this.gasolinaEspecial -= gasolinaEspecial;
                } else {
                    consumoTotal -= this.gasolinaEspecial * 0.5;
                    this.gasolinaEspecial = 0;
                    litragemDoTanque -= consumoTotal;
                }
                System.out.println("corrida de: " + distancia);
            }
        } else {
            System.out.println("veiculo desligado");
        }
    }
}
