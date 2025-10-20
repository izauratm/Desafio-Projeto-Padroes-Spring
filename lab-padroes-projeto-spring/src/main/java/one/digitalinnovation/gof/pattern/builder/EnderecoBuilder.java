package one.digitalinnovation.gof.pattern.builder;

import one.digitalinnovation.gof.model.Endereco;

public class EnderecoBuilder {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public EnderecoBuilder comCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder comLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoBuilder comBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder comLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public EnderecoBuilder comUf(String uf) {
        this.uf = uf;
        return this;
    }

    public Endereco build() {
        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setLogradouro(logradouro);
        endereco.setBairro(bairro);
        endereco.setLocalidade(localidade);
        endereco.setUf(uf);
        return endereco;
    }
}
