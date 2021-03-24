package es.basket.rmadrid.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.basket.rmadrid.jpa.entity.PlayerStats;

public interface PlayerStatsRepository extends JpaRepository<PlayerStats, Long> {

}
