package es.basket.rmadrid.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.basket.rmadrid.jpa.entity.Tournaments;

@Repository
public interface TournamentsRepository extends JpaRepository<Tournaments, Long>{

}
