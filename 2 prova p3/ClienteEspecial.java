import java.util.Arrays;

public class ClienteEspecial extends Cliente {
    private Investimento investimento;

    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo) {
        super(nome, idade, conta, agencia, saldo);
    }


    @Override
    public void extrato() {
        for (int i = 0; i < numOperacoes; i++) {
            System.out.println(historico[i]);
        }
        calcularMediaDeposito();
        calcularMediaSaque();
    }

    public void investimento(String data, String hora, double valorInvestido, double percentual) throws Exception {
        if (saldo < valorInvestido) {
            throw new Exception("saldo insuficiente");
        }

        investimento = new Investimento(valorInvestido, data, hora);
        historico[numOperacoes] = investimento;
        numOperacoes++;
        saldo -= valorInvestido;
    }
    @Override
    public void depositar(String data, String hora, double valor) {
        if (numOperacoes == historico.length) {
            historico = Arrays.copyOfRange(historico, 1, numOperacoes);
            numOperacoes--;
        }

        historico[numOperacoes] = new Operacao("deposito", valor, data, hora);
        numOperacoes++;
        saldo += valor;
    }

    @Override
    public void resgate(String data, String hora) {
        if (investimento != null && dataDeResgatePermitida(data, investimento.getData())) {
            double valorResgatado = investimento.getValor();
            saldo += valorResgatado;
            historico[numOperacoes] = new Operacao("resgate", valorResgatado, data, hora);
            numOperacoes++;
            investimento = null; 
        } else {
            System.out.println("não permitido");
        }
    }

    private boolean dataDeResgatePermitida(String dataResgate, String dataInvestimento) {
        return true; 
    }

    private void calcularMediaDeposito() {
        double totalDepositos = 0;
        int contadorDepositos = 0;

        for (Operacao operacao : historico) {
            if (operacao instanceof Deposito) {
                totalDepositos += operacao.getValor();
                contadorDepositos++;
            }
        }

        if (contadorDepositos > 0) {
            double mediaDeposito = totalDepositos / contadorDepositos;
            System.out.println("media de depositos: " + mediaDeposito);
        } else {
            System.out.println("nenhum deposito realizado");
        }
    }

    private void calcularMediaSaque() {
        double totalSaques = 0;
        int contadorSaques = 0;

        for (Operacao operacao : historico) {
            if (operacao instanceof Saque) {
                totalSaques += operacao.getValor();
                contadorSaques++;
            }
        }

        if (contadorSaques > 0) {
            double mediaSaque = totalSaques / contadorSaques;
            System.out.println("Média de Saques: " + mediaSaque);
        } else {
            System.out.println("Nenhum saque realizado.");
        }
    }
}






