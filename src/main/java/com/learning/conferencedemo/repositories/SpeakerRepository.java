package com.learning.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.conferencedemo.models.Session;
import com.learning.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
