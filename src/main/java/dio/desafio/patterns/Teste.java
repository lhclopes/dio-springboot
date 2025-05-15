package dio.desafio.patterns;

import dio.desafio.patterns.facade.Facade;
import dio.desafio.patterns.singleton.SingletonEager;
import dio.desafio.patterns.singleton.SingletonLazy;
import dio.desafio.patterns.singleton.SingletonLazyHolder;
import dio.desafio.patterns.strategy.Comportamento;
import dio.desafio.patterns.strategy.ComportamentoAgressivo;
import dio.desafio.patterns.strategy.ComportamentoDefensivo;
import dio.desafio.patterns.strategy.ComportamentoNormal;
import dio.desafio.patterns.strategy.Robo;

public class Teste {

    public static void main(String[] args) {
        //Padroes de Projeto

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder2);


        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Luiz", "12710-260");


        
    }

}
