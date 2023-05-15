package com.ensakh.sitegestion ;
import com.ensakh.sitegestion.entity.Module;
import com.ensakh.sitegestion.repository.ModuleRepository;
import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "controller"+"service")
public class GestionApplication implements CommandLineRunner{

	public static void  main(String[] args) {
		SpringApplication.run(GestionApplication.class, args);
	}

	@Autowired
	private ModuleRepository moduleRepository ;
	@Autowired
	private ProfesseurRepository professeurRepository ;
	@Override
	public void run(String... args) throws Exception {
//		Module mod = new Module("JEE" , "Gi");
//		Module M = moduleRepository.save(mod);

//		Professeur prof = new Professeur(1245 ,"Abderrahim" , "El yassini" , "Gi");
//		Professeur P = professeurRepository.save(prof);
	}
}
