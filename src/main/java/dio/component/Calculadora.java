package dio.component;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    
    public Integer somar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

}
