package dio.desafio.patterns.facade;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI() {}

    public static CepAPI getInstancia() {
        return instancia;
    }

    public static String getCidade(String cep) {
        return "Cruzeiro";
    }

    public static String getEstado(String estado) {
        return "São Paulo";
    }

}
