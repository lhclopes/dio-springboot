package dio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.app.ConversorJson;
import dio.app.Remetente;
import dio.model.User;
import dio.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private Remetente remetente;

    @Value("${company}")
    private String company;
    @Value("${software}")
    private String software;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------------------------");
        System.out.println("- Inicializando: " + software + "(" + company + ")");
        System.out.println("-------------------------------------");

        System.out.println("");
        System.out.println("");
        System.out.println("Properties Remetente");
        System.out.println("Properties > Nome: " + remetente.getNome());  
        System.out.println("Properties > Email: " + remetente.getEmail());
        System.out.println("Properties > Telefones: ");
        remetente.getTelefones().stream().forEach(n -> System.out.println("Número: " + n));

        System.out.println("Properties > Telefones Vale do Paraiba: ");
        remetente.getTelefones().stream()
            .filter(n -> n.startsWith("(12)"))
            .forEach(n -> System.out.println("Número: " + n));

        System.out.println("");
        System.out.println("Repository");
        System.out.println("Inserindo Usuario 1");
        repository.save(new User("Luiz Henrique", "luiz.henrique", "SENHA"));
        System.out.println("Inserindo Usuario 2");
        repository.save(new User("Camila", "camila.gaspar", "SENHA"));

        System.out.println("");
        System.out.println("Listando Usuarios");
        repository.findAll().stream().forEach(n -> System.out.println(n.getName()));
    }

}
