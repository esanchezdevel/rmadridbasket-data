package es.basket.rmadrid.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.basket.rmadrid.jpa.entity.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

}
