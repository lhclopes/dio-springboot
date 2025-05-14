package dio.desafio.patterns.facade;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getCidade(cep);
        String estado = CepAPI.getEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
