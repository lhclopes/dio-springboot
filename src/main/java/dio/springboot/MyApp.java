package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import dio.component.Calculadora;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
	private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado:" + calculadora.somar(2, 7));
    }

}
