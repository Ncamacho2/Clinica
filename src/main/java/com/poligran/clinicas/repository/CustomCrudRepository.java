package com.poligran.clinicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomCrudRepository<T>
        extends JpaRepository<T, Integer>, JpaSpecificationExecutor<T> {
}