public class Professor{
  private String nome;
  private int idade;
  private int matricula;
  private Sala sala;


  //construtor
  public Professor(String nome, int idade, int matricula, Sala sala){
    this.nome = nome;
    this.idade = idade;
    this.matricula = matricula;
    this.sala = sala;
  }

  //gets e sets
  public String getNome() {
  	return nome;
  }
  
  public void setNome(String nome) {
  	this.nome = nome;
  }
  
  public int getIdade() {
  	return idade;
  }
  
  public void setIdade(int idade) {
  	this.idade = idade;
  }
  
  public int getMatricula() {
  	return matricula;
  }
  
  public void setMatricula(int matricula) {
  	this.matricula = matricula;
  }
  
  public Sala getSala() {
  	return sala;
  }
  
  public void setSala(Sala sala) {
  	this.sala = sala;
  }

  //metodos
  public void comecarAula(){
    if(sala.isOcupada()){
      System.out.println("Sala ocupada, a aula não pode começar.");
    }else{
      System.out.println("Aula começada com sucesso pelo professor: " + nome + " matricula " + matricula);
      sala.alternar();
    }
      
  }

  public void chamada(boolean[] presencas){
    boolean[] auxiliarchamada;

    for(int i = 0; i < 10; i++){
      auxiliarchamada = sala.getTurma()[i].getPresenca();
      auxiliarchamada[sala.getDia()] = presencas[i];
      sala.getTurma()[i].setPresenca(auxiliarchamada);
    }
  }

  public void terminarAula(){
    if(!sala.isOcupada()){
      System.out.println("Erro: não existe aula iniciada.");
    }else{
      sala.setDia(sala.getDia() + 1);
      sala.alternar();
    }
  }
    
}