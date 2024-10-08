import dao.ContratoDao;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void testSalva() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSalva2(){
        IContratoDao dao2 = new ContratoDao();
        IContratoService service = new ContratoService(dao2);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluir(){
        IContratoDao dao2 = new ContratoDao();
        IContratoService service = new ContratoService(dao2);
        String result = service.excluir();
        Assert.assertEquals("Excluido Com Sucesso", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void atualizar(){
        IContratoDao dao2 = new ContratoDao();
        IContratoService service = new ContratoService(dao2);
        String result = service.atualizar();
        Assert.assertEquals("Atualizado!", result);
    }

    @Test
    public void buscarTeste(){
        IContratoDao dao2 = new ContratoDao();
        IContratoService service = new ContratoService(dao2);
        String result = service.buscar();
        Assert.assertEquals("Busca concluida!", result);
    }
}