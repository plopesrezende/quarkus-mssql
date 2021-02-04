package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface FruitRepository extends JpaRepository<Fruit, Long> {
	@Query(value = "SELECT top 100000 * FROM fruits", nativeQuery = true)
	List<Fruit> findTop100000();
}
