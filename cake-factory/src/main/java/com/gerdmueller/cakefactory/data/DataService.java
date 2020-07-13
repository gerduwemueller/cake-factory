package com.gerdmueller.cakefactory.data;

import java.util.List;
import java.util.Optional;

import com.gerdmueller.cakefactory.entities.HibernateEntity;

public interface DataService {

	Optional<? extends HibernateEntity> getById(Long id);
	public List<? extends HibernateEntity> getAll();
	HibernateEntity save(HibernateEntity entity);
	void deleteById(Long id);

}
