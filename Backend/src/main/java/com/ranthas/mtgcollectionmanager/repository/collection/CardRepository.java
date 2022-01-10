package com.ranthas.mtgcollectionmanager.repository.collection;

import com.ranthas.mtgcollectionmanager.entity.Card;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CardRepository extends MongoRepository<Card, ObjectId> {

    @Query("{ 'data.id': ?0 }")
    Card findByScryfallId(String scryfallId);

    @Query("{ 'set.id': ?0 }")
    List<Card> findAllBySetId(String setId);

    @Query("{ 'set.id': ?0, 'nonFoilQuantity': { $gt: 0 } }")
    List<Card> findAllNonFoilOwnedBySetId(String setId);

    @Query("{ 'set.id': ?0, 'foilQuantity': { $gt: 0 } }")
    List<Card> findAllFoilOwnedBySetId(String setId);
}
