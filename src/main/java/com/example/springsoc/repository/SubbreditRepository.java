package com.example.springsoc.repository;

import com.example.springsoc.entity.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubbreditRepository extends JpaRepository<Subreddit, Long> {
}
