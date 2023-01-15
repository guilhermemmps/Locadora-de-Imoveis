import java.util.ArrayList;
public class Acervo {

    private ArrayList<Alugavel> lista;


    public Acervo() {
        lista = new ArrayList<Alugavel>(200);
    }

    public boolean adicionaAlugavel(Alugavel alugavel) {
        return lista.add(alugavel);

    }

    public Alugavel pesquisaAlugavel(int codigo2) {
        for (int i = 0; i < lista.size(); i++) {
            Alugavel alugavel = lista.get(i);
            if (alugavel.getCodigo() == codigo2) return alugavel;
        }
        return null;
    }

    public ArrayList<Alugavel> pesquisaAlugavel(String nome) {
        ArrayList<Alugavel> lista2 = new ArrayList<Alugavel>();
        int ind = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista2.add(ind, lista.get(i));
                ind++;
            }

        }
        if (lista2.isEmpty()) return null;
        return lista2;
    }

    public String respectivosAlugueis(Locacoes locacoes) {
        if (lista.isEmpty() == true) return "Nenhum item alugável cadastrado no sistema.";

        String msg = "Lista dos imóveis cadastrados e seus respectivos alugueis:\n ";
        for (int i = 0; i < lista.size(); i++) {
            msg = msg + "\n" + lista.get(i).toString() +"\n"+ "Respectivos aluguéis, se houverem: "+"\n\n";
            for (int j = 0; j < locacoes.buscaTamanho(); j++) {
                Aluguel aluguel = locacoes.buscaReferencia(j);
                if (lista.get(i).getCodigo() == aluguel.getCodigo()){
                    msg = msg + aluguel.toString() + "\n";
                }
            }
        }
        return msg;
    }







    public String toString(){
        String msg = "Lista dos imóveis alugáveis: \n";
        if(lista.isEmpty()==true) return "Nenhum item alugavel cadastrado no sistema.";
        for(int i=0;i<lista.size();i++){
            msg = msg + lista.get(i).toString() +"\n";
        }
        return msg;
    }
}
