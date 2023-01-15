import java.util.ArrayList;

public class Locacoes {

    private ArrayList<Aluguel> lista;
    private int tamanho;

    public Locacoes(){
        lista = new ArrayList<Aluguel>(200);
    }

public void adicionaAluguel(Aluguel aluguel){
        lista.add(aluguel);
        tamanho++;
}
public ArrayList<Aluguel> pesquisaAluguel(String cpf){
        ArrayList<Aluguel> lista2 = new ArrayList<Aluguel>();
        int ind =0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCpf().equals(cpf)){
                lista2.add(ind,lista.get(i));
                ind++;
            }
        }
         if(lista2.isEmpty()==true) return null;
         return lista2;
}

public String respectivoAlugueis(Alugavel alugavel){
        String msg = "Segue abaixo os respectivos aluguéis do ímóvel "+ alugavel.getNome()+" ,se houverem." + "\n\n";
        for(int i=0;i< lista.size();i++){
            if(alugavel.getCodigo()== lista.get(i).getCodigo()){
                msg = msg + lista.get(i).toString() + "\n";
            }
        }
       return msg;
}







public int buscaTamanho(){
        return tamanho;
}
public Aluguel buscaReferencia(int j){
        return lista.get(j);
}
}
