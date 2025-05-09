package dio.desafio.bancoDigital;

public class ContaPoupanca extends Conta {

    public static Integer SEQUENCIAL = 2000;

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super.banco = banco;
        super.cliente = cliente;
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.saldo = 0.0D;
    }

    public void imprimirExtrato() {
        System.out.print("Extrato da Conta Poupança > ");
        super.imprimirInfoComum();
    }

}
