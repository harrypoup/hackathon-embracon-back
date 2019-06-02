package com.embracon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embracon.model.Parcela;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, String> { }
