package com.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.HealthClub;

public interface HealthClubRepository extends JpaRepository<HealthClub,Integer> {

	//@Query("select sum(p.price),hc.user.id from HealthClub hc JOIN hc.packages p GROUP BY hc.user.id")
	//public List<Integer[]> findTotal();

    // JpaRepository already provides a save method, so no need to explicitly declare addHealthClub
}