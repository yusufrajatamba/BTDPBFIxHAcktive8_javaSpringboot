package com.finalproject.yusuf.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.finalproject.yusuf.bus.model.Agency;
import com.finalproject.yusuf.bus.model.User;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Long> {

	Agency findByOwner(User owner);

	@Query(value = "SELECT DISTINCT * FROM agency WHERE owner_user_id = :owner", nativeQuery = true)
	Agency findByOwnerUser(Long owner);
}
