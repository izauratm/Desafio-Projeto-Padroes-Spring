package one.digitalinnovation.gof.pattern.builder;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

public class ClienteBuilder {

    private Long id;
    private String nome;
    private Endereco endereco;

    public ClienteBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public ClienteBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder comEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Cliente build() {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        return cliente;
    }
}
