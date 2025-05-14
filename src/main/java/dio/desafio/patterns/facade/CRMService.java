package dio.desafio.patterns.facade;

public class CRMService {

    private CRMService() {
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente Gravado: " + nome);
    }

}
