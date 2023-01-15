
import java.util.ArrayList;
import java.util.Scanner;
public class ACMERental {

    private Acervo acervo;
    private Locacoes locacoes;

    Scanner input = new Scanner(System.in);

    public ACMERental(){
        acervo = new Acervo();
        locacoes = new Locacoes();
    }



    public void executa(){
        int opcao=1;
        do{
            menu();
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){

                case 0: System.out.println("Fim do programa.");
                break;

                case 1: System.out.println(acervo.respectivosAlugueis(locacoes));
                break;

                case 2:
                    Alugavel alugavel;
                    System.out.println("Informe o código do item alugável que deseja buscar: ");
                    int codigo = input.nextInt();
                    if(acervo.pesquisaAlugavel(codigo)==null){
                        System.out.println("Item não econtrado.");
                        break;
                    }
                    alugavel = acervo.pesquisaAlugavel(codigo);
                    System.out.println(alugavel.toString());
                    System.out.println(locacoes.respectivoAlugueis(alugavel));
                    break;

                    case 3: System.out.println("Informe o nome do imóvel que desejas buscar: ");
                    String nome = input.nextLine();
                    if(acervo.pesquisaAlugavel(nome)==null){
                     System.out.println("Nenhum item alugável encontrado com este nome.");
                     break;
                    }
                        ArrayList<Alugavel> lista = acervo.pesquisaAlugavel(nome);
                        System.out.print("\n");
                        for(int i=0;i< lista.size();i++){
                            System.out.println(lista.get(i).toString());
                            System.out.println(locacoes.respectivoAlugueis(lista.get(i)));
                        }
                        break;

                        case 4: System.out.println("Informe o CPF do cliente que desejas buscar os alugueis: ");
                        String cpf = input.nextLine();
                        ArrayList<Aluguel> lista2 = locacoes.pesquisaAluguel(cpf);
                        if(lista2 == null) {
                            System.out.println("Nenhum aluguel encontrado com este CPF. ");
                            break;
                        }
                            System.out.println("Segue abaixo todos os dados dos alugueis do cliente com o cpf indicado e todos os respectivos itens alugados.\n");
                        for(int i =0;i< lista2.size();i++){
                            int codigo3 = lista2.get(i).getCodigo();
                           Alugavel alugavel4 = acervo.pesquisaAlugavel(codigo3);

                            if(alugavel4!=null){
                                System.out.println(alugavel4.toString());
                                System.out.println("Respectivos alugueis do imovel acima com o cpf: "+ lista2.get(i).getCpf());
                                System.out.print("\n");
                                System.out.println(lista2.get(i).toString());
                                System.out.print("\n");
                            }
                        }
                        break;

                case 5: System.out.println("Informe o codigo do imovel que deseja alugar: ");
                    int codi = input.nextInt();
                  Alugavel alugavel9 = acervo.pesquisaAlugavel(codi);
                  if(alugavel9==null) {
                      System.out.println("Imóvel não encontrado");
                       break;
                  }
                    System.out.println("Imóvel encontrado");
                    System.out.println(alugavel9.toString());
                    input.nextLine();

                    System.out.println("Informe a data do aluguel no padrão dd/mm/aa ");
                    String data = input.nextLine();
                    System.out.println("Informe o período de estadia: ");
                    int periodo = input.nextInt();
                    input.nextLine();
                    System.out.println("Informe o seu cpf: ");
                    String cpf4 = input.nextLine();

                    System.out.println("Informe o seu nome: ");
                    String nome5 = input.nextLine();
                    Aluguel aluguel9 = new Aluguel(data,periodo,cpf4,nome5);

                    alugavel9.adicionaAluguel(aluguel9);
                    locacoes.adicionaAluguel(aluguel9);
                    System.out.println("Aluguel adicionado com sucesso.");
                    break;








            }
        }while(opcao!=0);
    }

    public void menu(){
        System.out.println("-----Menu-----");
        System.out.println("0- Para encerrar o programa.");
        System.out.println("1- Mostra todos os dados cadastrados: ");
        System.out.println("2- Pesquisa item alugável pelo código: ");
        System.out.println("3- Pesquisa itens alugáveis pelo nome do imóvel: ");
        System.out.println("4- Pesquisar alugueis de um cliente por cpf: ");
        System.out.println("5- Cadastrar alugueis: ");

    }



public void preCadastra(){
        //Alugaveis

    Alugavel alugavel1,alugavel2,alugavel3,alugavel4;
    alugavel1 = new Alugavel("Apartamento da praia",400,"Ipanema",3,1);
    acervo.adicionaAlugavel(alugavel1);
    alugavel2 = new Alugavel("Casa na beira da praia",700,"Copacabana",2,2);
    acervo.adicionaAlugavel(alugavel2);
    alugavel3 = new Alugavel("Casa de condomínio",800,"Alphaville",4,3);
    acervo.adicionaAlugavel(alugavel3);
    alugavel4 = new Alugavel("Apartamento de medio padrao",450,"Itaim Bibi",3,4);
    acervo.adicionaAlugavel(alugavel4);

    //alugueis

    Aluguel aluguel1, aluguel2,aluguel3,aluguel4,aluguel5;
    aluguel1 = new Aluguel("10/10/2020",5,"33045034532","Carlos Almeida");
    alugavel1.adicionaAluguel(aluguel1);
    locacoes.adicionaAluguel(aluguel1);

    aluguel2 = new Aluguel("09/08/2019",5,"44269494354","Antônio Cardoso");
    alugavel1.adicionaAluguel(aluguel2);
    locacoes.adicionaAluguel(aluguel2);

    aluguel3 = new Aluguel("04/03/2022",4,"54354354343","Marcelo");
    alugavel1.adicionaAluguel(aluguel3);
    locacoes.adicionaAluguel(aluguel3);

    aluguel4 = new Aluguel("05/06/2015",6,"44269494354","Antônio Cardoso");
    alugavel2.adicionaAluguel(aluguel4);
    locacoes.adicionaAluguel(aluguel4);

    aluguel5 = new Aluguel("23/04/2017",10,"49854343454","Marcio");
    alugavel3.adicionaAluguel(aluguel5);
    locacoes.adicionaAluguel(aluguel5);

  }
}
