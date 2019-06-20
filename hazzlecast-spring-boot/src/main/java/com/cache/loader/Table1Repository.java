package com.cache.loader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table1Repository extends JpaRepository<Table1Entity, Long> {

}
