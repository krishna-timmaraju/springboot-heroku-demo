package com.learning.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
