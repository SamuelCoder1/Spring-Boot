package com.riwi.Cine.repositories;

import com.riwi.Cine.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
