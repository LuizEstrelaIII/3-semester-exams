public class Sala{
  private String nome;
  private boolean ocupada = false;
  private Aluno[] turma = new Aluno[10];
  private int dia = 0;

  //construtor
  
  public Sala(String nome){
    this.nome = nome;
  }

  //gets e sets

  public String getNome() {
  	return nome;
  }
  
  public void setNome(String nome) {
  	this.nome = nome;
  }
  
  public boolean isOcupada() {
  	return ocupada;
  }
  
  public void setOcupada(boolean ocupada) {
  	this.ocupada = ocupada;
  }
  
  public Aluno[] getTurma() {
  	return turma;
  }
  
  public void setTurma(Aluno[] turma) {
  	this.turma = turma;
  }
  
  public int getDia() {
  	return dia;
  }
  
  public void setDia(int dia) {
  	this.dia = dia;
  }

  //metodos
  public void alternar(){
    ocupada = !ocupada;
  }
  
}