package com.zazibr.LiterAlura.repositories;

import com.zazibr.LiterAlura.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    Boolean existsByNome(String nome);

    Author findByNome(String nome);

    @Query("SELECT a FROM Author a WHERE a.dataDeFalecimento >= :anoSelecionado AND :anoSelecionado >= a.dataDeNascimento")
    List<Author> buscarPorAnoDeFalecimento(int anoSelecionado);
}