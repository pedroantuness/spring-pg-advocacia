package br.com.fiap.springpgadvocacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringPgAdvocaciaApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringPgAdvocaciaApplication.class, args );
    }

    @GetMapping(value = "/")
    public String index(){
        String hello = """
                
                Bem vindo a nossa Advocacia!!
                
                """;
        return hello;
    }

}
