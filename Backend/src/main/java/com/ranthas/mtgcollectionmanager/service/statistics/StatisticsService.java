package com.ranthas.mtgcollectionmanager.service.statistics;

public interface StatisticsService {

    long calculateNonFoilOwnedCardsBySet(String setId);

    long calculateFoilOwnedCardsBySet(String setId);
}
