package dio.desafio.patterns.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente");
    }

}
