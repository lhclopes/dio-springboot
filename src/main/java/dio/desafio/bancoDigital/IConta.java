package dio.desafio.bancoDigital;

public interface IConta {

    void sacar(Double valor) ;

    void depositar(Double valor) ;

    void transferir(Double valor, Conta destino);

    void imprimirExtrato();

}
