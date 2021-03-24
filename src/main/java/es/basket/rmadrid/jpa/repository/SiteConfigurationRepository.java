package es.basket.rmadrid.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.basket.rmadrid.jpa.entity.SiteConfiguration;

@Repository
public interface SiteConfigurationRepository extends JpaRepository<SiteConfiguration, Long> {

	@Query(value = "SELECT * FROM site_configuration WHERE name like ?1%", nativeQuery = true)
	List<SiteConfiguration> findByPrefix(String prefix);
}
