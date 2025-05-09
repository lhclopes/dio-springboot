package dio.desafio.bancoDigital;

import java.util.List;

public class Banco {

    private int numero;
    private String nome;
    private List<ContaCorrente> contaCorrenteList;
    private List<ContaPoupanca> contaPoupancaList;

    public Banco(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public void setContaCorrenteList(List<ContaCorrente> contaCorrenteList) {
        this.contaCorrenteList = contaCorrenteList;
    }

    public void setContaPoupancaList(List<ContaPoupanca> contaPoupancaList) {
        this.contaPoupancaList = contaPoupancaList;
    }

}
