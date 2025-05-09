package dio.desafio.bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private int numero;
    private String nome;
    private List<ContaCorrente> contaCorrenteList;
    private List<ContaPoupanca> contaPoupancaList;

    public Banco(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        contaCorrenteList = new ArrayList<ContaCorrente>();
        contaPoupancaList = new ArrayList<ContaPoupanca>();
    }

    public void setContaCorrenteList(List<ContaCorrente> contaCorrenteList) {
        this.contaCorrenteList = contaCorrenteList;
    }

    public void setContaPoupancaList(List<ContaPoupanca> contaPoupancaList) {
        this.contaPoupancaList = contaPoupancaList;
    }

    public List<Cliente> getClientes() {
        List<Cliente> lista = new ArrayList<Cliente>();
        
        contaCorrenteList.stream().forEach(conta -> lista.add(conta.getCliente()));
        contaPoupancaList.stream().forEach(conta -> lista.add(conta.getCliente()));

        return lista;
    }

    public List<Conta> getContas() {
        List<Conta> lista = new ArrayList<Conta>();
        
        contaCorrenteList.stream().forEach(conta -> lista.add(conta));
        contaPoupancaList.stream().forEach(conta -> lista.add(conta));

        return lista;
    }

    public void abrirContaCorrente(ContaCorrente conta) {
        contaCorrenteList.add(conta);
    }

    public void abrirContaPoupanca(ContaPoupanca conta) {
        contaPoupancaList.add(conta);
    }

}
