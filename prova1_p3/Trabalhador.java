public class Trabalhador {
    private String nome;
    private int idade;
    private double valor_da_hora;
    private int horas_trabalhadas;
    private boolean ferias;

    //construtor
    public Trabalhador() {
        this.nome = nome;
        this.idade = idade;
        this.valor_da_hora = valor_da_hora;
        this.horas_trabalhadas = 0;
        this.ferias = false;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getValor_da_hora() {
        return valor_da_hora;
    }
    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }
    public boolean isFerias() {
        return ferias;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setValor_da_hora(double valor_da_hora) {
        this.valor_da_hora = valor_da_hora;
    }
    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public void trabalhar(int horas) {
        if(!ferias){
            horas_trabalhadas = horas_trabalhadas + horas;
        }else{
            System.out.println("ele está de ferias");
        }
    }
    public void ferias(){
        ferias = !ferias;
    }

    public double calcularSalario() {
        return valor_da_hora * horas_trabalhadas; 
    }
    
}
