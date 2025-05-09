package dio.desafio.bancoDigital;

public class TesteDesafioBanco {

    public static void main(String[] args) {
        Cliente luiz = new Cliente("Luiz Henrique");

        Conta cc = new ContaCorrente(luiz);
        Conta cp = new ContaPoupanca(luiz);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
