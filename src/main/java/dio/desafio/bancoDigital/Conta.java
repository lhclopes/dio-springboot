package dio.desafio.bancoDigital;

public abstract class Conta implements IConta {

    protected static final String AGENCIA_PADRAO = "0001";

    protected String agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    // public Conta(String agencia, Integer numero, Double saldo, Cliente cliente) {
    //     this.agencia = agencia;
    //     this.numero = numero;
    //     this.saldo = saldo;
    //     this.cliente = cliente;
    // }

    @Override
    public void sacar(Double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(Double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.println("Agencia: " + agencia + "| Conta: " + numero + "| Titular: " + cliente.toString() + " | Saldo: " + saldo);
    }

}
