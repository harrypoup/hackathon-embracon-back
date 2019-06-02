package com.embracon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.embracon.model.Consorcio;

@Repository
public interface ConsorcioRepository extends JpaRepository<Consorcio, String> { }
