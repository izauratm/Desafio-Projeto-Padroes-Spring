package one.digitalinnovation.gof.pattern.facade;

import one.digitalinnovation.gof.pattern.facade.subsistema1.CrmService;
import one.digitalinnovation.gof.pattern.facade.subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String localidade = CepApi.getInstancia().recuperarLocalidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, localidade, estado);
    }
}
