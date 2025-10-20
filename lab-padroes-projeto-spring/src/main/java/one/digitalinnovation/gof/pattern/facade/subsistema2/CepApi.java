package one.digitalinnovation.gof.pattern.facade.subsistema2;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarLocalidade(String cep) {
        return "Porto Alegre"; // Simulação
    }

    public String recuperarEstado(String cep) {
        return "RS"; // Simulação
    }
}
