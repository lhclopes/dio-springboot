package dio.desafio.bancoDigital;

public class ContaCorrente extends Conta {

    public static Integer SEQUENCIAL = 1000;

    public ContaCorrente(Cliente cliente) {
        super.cliente = cliente;
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.saldo = 0.0D;        
    }

    public void imprimirExtrato() {
        System.out.print("Extrato da Conta Corrente > ");
        super.imprimirInfoComum();
    }

}
