package com.gubee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gubee.repository.ProdutoRepository;
import com.gubee.repository.TecnologiaRepository;

@SpringBootApplication
public class SpringBootAppGubeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppGubeeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner insertSuperUser(ProdutoRepository produtoRepository, TecnologiaRepository tecnologiaRepository) {
		return args -> {

				/*Produto prod1 = new Produto();
				prod1.setNome("Produto 1");
				Produto prod2 = new Produto();
				prod2.setNome("Produto 2");
				Produto prod3 = new Produto();
				prod3.setNome("Produto 3");
				Produto prod4 = new Produto();
				prod4.setNome("Produto 4");
				
				Tecnologia tec1 = new Tecnologia();
				tec1.setNome("Java");
				Tecnologia tec2 = new Tecnologia();
				tec2.setNome("MySql");
				Tecnologia tec3 = new Tecnologia();
				tec3.setNome("SQL Server");
				Tecnologia tec4 = new Tecnologia();
				tec4.setNome("React");
				Tecnologia tec5 = new Tecnologia();
				tec5.setNome("Lua");
				Tecnologia tec6 = new Tecnologia();
				tec6.setNome("Postgress");
				Tecnologia tec7 = new Tecnologia();
				tec7.setNome("Angular");
				
				tecnologiaRepository.save(tec1);
				tecnologiaRepository.save(tec2);
				tecnologiaRepository.save(tec3);
				tecnologiaRepository.save(tec4);
				tecnologiaRepository.save(tec5);
				tecnologiaRepository.save(tec6);
				tecnologiaRepository.save(tec7);
				
				List<Tecnologia> tecs1 = new ArrayList<>();
				List<Tecnologia> tecs2 = new ArrayList<>();
				List<Tecnologia> tecs3 = new ArrayList<>();
				List<Tecnologia> tecs4 = new ArrayList<>();
				
				tecs1.add(tec1);
				tecs1.add(tec2);
				tecs1.add(tec4);
				
				tecs2.add(tec5);
				tecs2.add(tec6);
				
				tecs3.add(tec1);
				tecs3.add(tec3);
				tecs3.add(tec7);
				
				tecs4.add(tec1);
				tecs4.add(tec2);
				tecs4.add(tec7);
				
				
				prod1.setTecnologias(tecs1);
				prod2.setTecnologias(tecs2);
				prod3.setTecnologias(tecs3);
				prod4.setTecnologias(tecs4);
				
				produtoRepository.save(prod1); 
				produtoRepository.save(prod2); 
				produtoRepository.save(prod3); 
				produtoRepository.save(prod4); */
			
		};
	}

}
