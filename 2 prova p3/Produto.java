public class Produto extends Operacao {
    public Produto(double valor, String data, String hora) {
        super("produto", valor, data, hora);
    }

    public double rendimento() {
        double rendimento = valor * 0.03;
        valor += rendimento;
        return rendimento;
    }
}
