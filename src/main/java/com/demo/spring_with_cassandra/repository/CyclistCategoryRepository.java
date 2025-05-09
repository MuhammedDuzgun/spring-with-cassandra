package com.demo.spring_with_cassandra.repository;

import com.demo.spring_with_cassandra.entity.CyclistCategory;
import org.springframework.data.cassandra.repository.MapIdCassandraRepository;

public interface CyclistCategoryRepository extends MapIdCassandraRepository<CyclistCategory> {
}
