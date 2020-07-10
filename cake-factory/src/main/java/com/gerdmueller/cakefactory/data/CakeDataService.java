package com.gerdmueller.cakefactory.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gerdmueller.cakefactory.entities.Cake;
import com.gerdmueller.cakefactory.entities.HibernateEntity;

@Service
public class CakeDataService implements DataService {

	@Override
	public Optional<Cake> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> getAll() {
		
		return Arrays.asList(
				new Cake("Käsekuchen",2.15,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
				,new Cake("Apfelkuchen",2.25,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
				,new Cake("Belgischer Schokokuchen",2.05,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
				,new Cake("Schwarzwälder Kirsch",2.50,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
				,new Cake("Frankfurter Kranz",2.35,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
				,new Cake("Donauwelle",1.95,"Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!")
		);
		
	}

	@Override
	public Cake save(HibernateEntity i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

}
