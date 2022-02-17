package com.example.springsoc.repository;

import com.example.springsoc.entity.Subsocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubsocialRepository extends JpaRepository<Subsocial, Long> {
}
