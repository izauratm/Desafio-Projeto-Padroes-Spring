package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
//para usar interface SWAGGER API
//http://127.0.0.1:8080/swagger-ui/index.html#/cliente-rest-controller/inserir
//pegar dados para preenchimento
//https://viacep.com.br/

