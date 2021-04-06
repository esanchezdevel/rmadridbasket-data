package es.basket.rmadrid.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.basket.rmadrid.jpa.entity.Games;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long>{

	@Query(value = "SELECT * FROM games ORDER BY date DESC LIMIT 1", nativeQuery=true)
	Games findLastGamePlayed();
	
	@Query(value = "SELECT * FROM games ORDER BY date DESC", nativeQuery=true)
	List<Games> findAllGamesPlayed();
}
