public class Operacao {
    protected String tipoOperacao;
    protected double valor;
    protected String data;
    protected String hora;

    public Operacao(String tipoOperacao, double valor, String data, String hora) {
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }
    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return tipoOperacao + "valor: " + valor + "data: " + data + "hora: " + hora;
    }
}


