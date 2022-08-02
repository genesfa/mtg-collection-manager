package com.ranthas.mtgmanager.specification;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;

public interface SpecificationHelper<T> extends Specification<T> {

    default String predicateLikeUppercase(String value) {
        return value == null ? null : "%" + value.toUpperCase() + "%";
    }

    default Predicate predicateAlwaysTrue(CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
    }
}
