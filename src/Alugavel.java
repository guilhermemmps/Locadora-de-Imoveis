public class Alugavel {

    private int codigo;
    private String nome;
    private double precoDiario;
    private String bairro;
    private int numeroPessoas =2; // numero máximo de pessoas suportado pelo imóvel



    public Alugavel() {
        this.nome = "Apartamento";
        this.bairro = "Cidade Jardim";

    }

    public Alugavel(String nome, double precoDiario, String bairro, int numeroPessoas,int codigo) {
        this.nome = nome;
        this.precoDiario = precoDiario;
        this.bairro = bairro;
        this.numeroPessoas = numeroPessoas;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public String getBairro() {
        return bairro;
    }
    public int getNumeroPessoas() {
        return numeroPessoas;
    }
//Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if(nome!=""){
            this.nome = nome;
        }
    }

    public void setPrecoDiario(double precoDiario) {
        if(precoDiario>0) {
            this.precoDiario = precoDiario;
        }
    }

    public void setBairro(String bairro) {
        if(nome!="") {
            this.bairro = bairro;
        }
    }

    public void setNumeroPessoas(int numeroPessoas) {
        if(numeroPessoas>0) {
            this.numeroPessoas = numeroPessoas;
        }
    }
//
// apartamento.adicionaAluguel(aluguel);
   public boolean adicionaAluguel(Aluguel aluguel) {
           aluguel.setCodigo(codigo);
           aluguel.setPrecoDoImovelAlugado(precoDiario);
           return true;
       }











    public String toString(){
        return "Código do imóvel: "+codigo+ "\n" + "Nome: " + nome +"\n" + "Preço diário: "+ precoDiario +"\n" + "Bairro: "+bairro +
                "\n" + "Número de pessoas adequado para o imóvel: " + numeroPessoas + "\n";
    }

}
