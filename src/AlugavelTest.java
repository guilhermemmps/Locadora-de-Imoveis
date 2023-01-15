import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class AlugavelTest {

    private Alugavel alugavel;

    @BeforeEach
    public void inicializa(){
        alugavel = new Alugavel("Apartamento",200,"Petropolis",3,1);
    }
    @Test
    public void inicializa2(){
        alugavel = new Alugavel();
    }




    @Test
    public void testGetCodigo(){
       int cod = alugavel.getCodigo();
       assertEquals(1,cod);
    }
    @Test
public void testGetNome(){
       String nome =  alugavel.getNome();
       assertEquals("Apartamento",nome);
}
@Test
    public void testGetPrecoDiario(){
       double preco = alugavel.getPrecoDiario();
       assertEquals(200,preco);
}
@Test
public void testGetBairro(){
        String bairro = alugavel.getBairro();
        assertEquals("Petropolis",bairro);
}
@Test
public void testGetNumeroPessoas(){
     int num = alugavel.getNumeroPessoas();
     assertEquals(3,num);
}
@Test
    public void testSetCodigo(){
        alugavel.setCodigo(3);
        assertEquals(3,alugavel.getCodigo());
}
@Test
    public void testSetNome(){
        alugavel.setNome("Apartamento da praia");
        assertEquals("Apartamento da praia",alugavel.getNome());
}
@Test
    public void testsetPrecoDiario(){
        alugavel.setPrecoDiario(400);
        assertEquals(400,alugavel.getPrecoDiario());
}
@Test
    public void testsetBairo(){
        alugavel.setBairro("Vila Madalena");
        assertEquals("Vila Madalena",alugavel.getBairro());
}
@Test
    public void testSetNumeroPessoas(){
        alugavel.setNumeroPessoas(5);
        assertEquals(5,alugavel.getNumeroPessoas());
}
@Test
    public void testAdicionaAluguel(){
        Aluguel aluguel = new Aluguel("10/10/2020",5,"33045034532","Carlos Almeida");
       boolean result = alugavel.adicionaAluguel(aluguel);
        assertTrue(result);
}
@Test
    public void testToString(){
        assertEquals("Código do imóvel: "+alugavel.getCodigo()+ "\n" + "Nome: " + alugavel.getNome() +"\n" + "Preço diário: "+ alugavel.getPrecoDiario() +"\n" + "Bairro: "+alugavel.getBairro() +
                "\n" + "Número de pessoas adequado para o imóvel: " + alugavel.getNumeroPessoas() + "\n",alugavel.toString());
}


}
