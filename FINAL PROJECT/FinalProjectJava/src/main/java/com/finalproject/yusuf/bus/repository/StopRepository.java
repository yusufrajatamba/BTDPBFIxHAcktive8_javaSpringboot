package com.finalproject.yusuf.bus.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.finalproject.yusuf.bus.model.Stop;

public interface StopRepository extends JpaRepository<Stop, Long> {
	List<Stop> findByName (String name);
	List<Stop> findByCode (String code);
}