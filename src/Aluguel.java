public class Aluguel {

    private String data;
    private int periodo;
    private String cpf;
    private String nome; // nome do inquilino
    private double valorFinal;
    private int codigo;

    private double precoDoImovelAlugado;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo2){
        codigo = codigo2;
    }


    public Aluguel(String data, int periodo, String cpf, String nome) {
        this.data = data;
        this.periodo = periodo;
        this.cpf = cpf;
        this.nome = nome;
    }
//Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//Getters
    public String getData() {
        return data;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getValorFinal(){
        return valorFinal;
    }
    public void setValorFinal(double valor){
        valorFinal = valor;
    }
    public double calculaValorFinal(){
        double valor;
        if(periodo>7){
            valor = periodo * precoDoImovelAlugado;
            valor = (valor/100)*90;
            valorFinal = valor;
            return valorFinal;
        }
       valor = periodo * precoDoImovelAlugado;
      valorFinal= valor;
      return valorFinal;
   }
   public void setPrecoDoImovelAlugado(double valor){
        precoDoImovelAlugado = valor;
}
public double getPrecoDoImovelAlugado(){
        return precoDoImovelAlugado;
}
    public String toString(){
        return  "Data: " + data + "\n" + "Periodo: " + periodo + "\n" + "cpf: "+ cpf + "\n" + "Nome do inquilino: " + nome +"\n"+ "Valor total do aluguel: "+ calculaValorFinal()+"\n";
    }
}
