import java.util.Arrays;

public abstract class Cliente implements Operacoes {
    protected String nome;
    protected int idade;
    protected String conta;
    protected String agencia;
    protected double saldo;
    protected Operacao[] historico = new Operacao[30];
    protected int numOperacoes = 0;

    public Cliente(String nome, int idade, String conta, String agencia, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public void depositar(String data, String hora, double valor){
        if (numOperacoes == historico.length) {
            historico = Arrays.copyOfRange(historico, 1, numOperacoes);
            numOperacoes--;
        }

        historico[numOperacoes] = new Operacao("deposito", valor, data, hora);
        numOperacoes++;
        saldo += valor;
    }

    @Override
    public void sacar(String data, String hora, double valor) throws Exception {
        if (saldo < valor) {
            throw new Exception("saldo insuficiente");
        }

        if (numOperacoes == historico.length) {
            historico = Arrays.copyOfRange(historico, 1, numOperacoes);
            numOperacoes--;
        }

        historico[numOperacoes] = new Operacao("saque", valor, data, hora);
        numOperacoes++;
        saldo -= valor;
    }

    @Override
    public void extrato() {
        int inicio = Math.max(0, numOperacoes - 10);
        for (int i = inicio; i < numOperacoes; i++) {
            System.out.println(historico[i]);
        }
    }
}

