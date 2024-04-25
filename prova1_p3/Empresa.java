public class Empresa {
    private String nome;
    private String cnpj;
    private String endereco;
    private String ceo;
    private int numero_de_funcionarios;
    private Trabalhador []trabalhadores;

    // construtor
    public Empresa(String nome, String cnpj, String endereco, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ceo = ceo;
        this.numero_de_funcionarios = 0;
        this.trabalhadores[20] = new Trabalhador(); 
    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCeo() {
        return ceo;
    }

    public int getNumero_de_funcionarios() {
        return numero_de_funcionarios;
    }

    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public void setNumero_de_funcionarios(int numero_de_funcionarios) {
        this.numero_de_funcionarios = numero_de_funcionarios;
    }

    public void setTrabalhadores(Trabalhador[] trabalhadores) {
        this.trabalhadores = trabalhadores;
    }

    public void Contratar(Trabalhador trabalhador) {
        if(numero_de_funcionarios < 20){
            trabalhadores[numero_de_funcionarios] = trabalhador;
            numero_de_funcionarios++;
        }else{
            System.out.println("não há mais espaço para novos funcionários");
        }

        }
    public void trabalhar(Trabalhador trabalhar){
        for (int i = 0; i < numero_de_funcionarios; i++) {
            if (!trabalhadores[i].isFerias()) {
                trabalhadores[i].trabalhar(8);
            }
        }
    }
    public void pagamento() {
        String[] nomes = new String[20];
        double[] salarios = new double[20];
        double totalGasto = 0;

        for (int i = 0; i < numero_de_funcionarios; i++) {
            nomes[i] = trabalhadores[i].getNome();
            salarios[i] = trabalhadores[i].calcularSalario();
            totalGasto += salarios[i];
        }
    }
}

    
