package com.pubs.pubs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pubs.pubs.models.Pubs;

@Repository
public interface PubsDao extends JpaRepository<Pubs, Long> {

}
