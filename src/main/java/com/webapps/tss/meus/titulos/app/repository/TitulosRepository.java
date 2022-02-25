package com.webapps.tss.meus.titulos.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapps.tss.meus.titulos.app.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {

}
