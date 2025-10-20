package one.digitalinnovation.gof.pattern.facade.subsistema1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String localidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Localidade: " + localidade);
        System.out.println("Estado: " + estado);
    }
}
