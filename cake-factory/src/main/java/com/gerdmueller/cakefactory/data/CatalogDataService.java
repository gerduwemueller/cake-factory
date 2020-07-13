package com.gerdmueller.cakefactory.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerdmueller.cakefactory.entities.Catalog;
import com.gerdmueller.cakefactory.entities.HibernateEntity;
import com.gerdmueller.cakefactory.repository.CatalogRepository;

@Service
public class CatalogDataService implements DataService {
	
	@Autowired
	CatalogRepository cakeRepository;

	@Override
	public Optional<Catalog> getById(Long id) {
		
		return cakeRepository.findById(id);
	}

	@Override
	public List<Catalog> getAll() {
		
		return cakeRepository.findAll();
		
	}

	@Override
	public Catalog save(HibernateEntity i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		cakeRepository.deleteById(id);
	}

}
