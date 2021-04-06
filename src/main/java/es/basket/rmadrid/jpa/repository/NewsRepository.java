package es.basket.rmadrid.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.basket.rmadrid.jpa.entity.News;

public interface NewsRepository extends JpaRepository<News, Long> {

	@Query(value="SELECT * FROM news ORDER BY id DESC LIMIT ?1", nativeQuery = true)
	List<News> findLastNews(int count);
}
