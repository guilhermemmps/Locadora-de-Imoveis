import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AluguelTest {

    private Aluguel aluguel;

    @BeforeEach
    public void inicializa(){
        aluguel = new Aluguel("10/10/2010",5,"44433355566","Lucas");
    }
    @Test
    public void testGetCodigo(){
        assertEquals(0,0);
    }
    @Test
    public void testSetCodigo(){
        aluguel.setCodigo(5);
        assertEquals(5,aluguel.getCodigo());
    }
    @Test
    public void testSetData(){
        aluguel.setData("15/12/2015");
        assertEquals("15/12/2015",aluguel.getData());
    }
    @Test
    public void testSetPeriodo(){
        aluguel.setPeriodo(10);
        assertEquals(10,aluguel.getPeriodo());
    }
    @Test
    public void testSetCpf(){
        aluguel.setCpf("33344455566");
        assertEquals("33344455566",aluguel.getCpf());
    }
    @Test
    public void testSetNome(){
        aluguel.setNome("Carlos");
        assertEquals("Carlos",aluguel.getNome());
    }
    @Test
    public void testGetData(){
        String data = aluguel.getData();
        assertEquals("10/10/2010",data);
    }
    @Test
    public void testGetPeriodo(){
        int per = aluguel.getPeriodo();
        assertEquals(5,per);
    }
    @Test
    public void testGetCpf(){
        String cpf = aluguel.getCpf();
        assertEquals("44433355566",cpf);
    }
    @Test
    public void testGetNome(){
        String nome = aluguel.getNome();
        assertEquals("Lucas",nome);
    }
    @Test
    public void testGetValorFinal(){
        double a = aluguel.getValorFinal();
        assertEquals(0,a);
    }
    @Test
    public void testSetValorFinal(){
        aluguel.setValorFinal(500);
        assertEquals(500,aluguel.getValorFinal());
    }
@Test
public void testCalculaValorFinal(){
        double valor = aluguel.calculaValorFinal();
        assertEquals(0,valor);
}
@Test
public void testCalculaValorFinal2(){
        aluguel.setPeriodo(10);
        double valor = aluguel.calculaValorFinal();
        assertEquals(0,valor);
}


@Test
public void testsetPrecoDoImovelAlugado(){
        aluguel.setPrecoDoImovelAlugado(500);
        assertEquals(500,aluguel.getPrecoDoImovelAlugado());
}
@Test
public void testGetPrecoDoImovelAlugado(){
        double valor = aluguel.getPrecoDoImovelAlugado();
        assertEquals(0,valor);
}


    @Test
    public void testToString(){
        assertEquals("Data: " + aluguel.getData() + "\n" + "Periodo: " + aluguel.getPeriodo() + "\n" + "cpf: "+ aluguel.getCpf() + "\n" + "Nome do inquilino: " + aluguel.getNome() +"\n"+ "Valor total do aluguel: "+aluguel.getValorFinal()+"\n",aluguel.toString());
    }

}
