public class Aviao extends Veiculo {
    private boolean voando;

    //construtor
    public Aviao(String marca, double tanque, double consumo, double velocidadeMaxima) {
        super(marca, tanque, consumo, velocidadeMaxima);
        this.voando = false;
    }

    //metodos
    public void voar() {
        if (velocidadeAtual >= 200) {
            voando = true;
            System.out.println("voando.");
        }
    }
    public void acelerar() {
        if (ligado) {
            if (voando) {
                velocidadeAtual += 20;
            } else {
                super.acelerar();
            }
        }
    }
    public void frear() {
        if (ligado) {
            if (voando) {
                velocidadeAtual -= 10;
                if (velocidadeAtual < 200) {
                    voando = false;
                    System.out.println("pousou");
                }
            } else {
                super.frear();
            }
        }
    }
    public void chavear() {
        if (ligado && velocidadeAtual > 0) {
            System.out.println("avião em movimento, não pode desligar");
        } else {
            super.chavear();
        }
    }
    public void corrida(double distancia) {
        if (ligado) {
            double litragemNecessaria = distancia / consumo;
            if (litragemNecessaria > litragemDoTanque) {
                System.out.println("sem combustivel suficiente");
                voando = false;
                velocidadeAtual = 0;
                litragemDoTanque = 0;
            } else {
                litragemDoTanque -= litragemNecessaria;
                System.out.println("distancia:" + distancia);
            }
        } else {
            System.out.println("desligado");
        }
    }
}
