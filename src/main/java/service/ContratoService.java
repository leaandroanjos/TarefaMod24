package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao iContratoDao;

    public ContratoService(IContratoDao iContratoDao){
        this.iContratoDao = iContratoDao;
    }

    @Override
    public String salvar(){
        iContratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        iContratoDao.excluir();
        return "Excluido Com Sucesso";
    }

    @Override
    public String buscar() {
        iContratoDao.buscar();
        return "Busca concluida!";
    }

    @Override
    public String atualizar() {
        iContratoDao.atualizar();
        return "Atualizado!";
    }
}
