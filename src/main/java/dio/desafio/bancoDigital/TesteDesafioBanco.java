package dio.desafio.bancoDigital;

public class TesteDesafioBanco {

    public static void main(String[] args) {
        Banco sicredi = new Banco(748, "Sicredi");
        
        Cliente luiz = new Cliente("Luiz Henrique");
        Conta cc1 = new ContaCorrente(sicredi, luiz);
        Conta cp1 = new ContaPoupanca(sicredi, luiz);

        Cliente camila = new Cliente("Camila");
        Conta cc2 = new ContaCorrente(sicredi, camila);

        sicredi.abrirContaCorrente((ContaCorrente) cc1);
        sicredi.abrirContaCorrente((ContaCorrente) cc2);
        sicredi.abrirContaPoupanca((ContaPoupanca) cp1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        cc2.imprimirExtrato();

        //Imprindo Conta
        sicredi.getContas().stream().forEach(conta -> System.out.println(conta.getCliente().toString()));
       
        //Imprimindo Clientes
        sicredi.getClientes().stream().forEach(cliente -> System.out.println(cliente.toString()));
    }

}
