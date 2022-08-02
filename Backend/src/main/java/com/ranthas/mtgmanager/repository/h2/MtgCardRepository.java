package com.ranthas.mtgmanager.repository.h2;

import com.ranthas.mtgmanager.entity.MtgCard;
import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtgCardRepository extends JpaRepository<MtgCard, Long> {

    @Query("from MtgCard where mtgSet = ?1 order by collectorNumber")
    List<MtgCard> findAllCardsBySet(MtgSet mtgSet);
}
