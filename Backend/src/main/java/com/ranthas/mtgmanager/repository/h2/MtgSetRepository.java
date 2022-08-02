package com.ranthas.mtgmanager.repository.h2;

import com.ranthas.mtgmanager.entity.MtgSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MtgSetRepository extends JpaRepository<MtgSet, Long> {

    @Query("from MtgSet where code = ?1")
    Optional<MtgSet> findByCode(String code);
}
