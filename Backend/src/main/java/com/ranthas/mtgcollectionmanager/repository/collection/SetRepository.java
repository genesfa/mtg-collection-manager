package com.ranthas.mtgcollectionmanager.repository.collection;

import com.ranthas.mtgcollectionmanager.entity.Set;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface SetRepository extends MongoRepository<Set, ObjectId> {

    @Query("{ 'data.code': ?0 }")
    Optional<Set> findByCode(String code);
}
