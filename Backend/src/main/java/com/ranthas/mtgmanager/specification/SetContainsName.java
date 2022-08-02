package com.ranthas.mtgmanager.specification;

import com.ranthas.mtgmanager.entity.MtgSet;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SetContainsName implements SpecificationHelper<MtgSet> {

    private final String name;

    public SetContainsName(String name) {
        if (name == null) {
            this.name = null;
        } else {
            this.name = predicateLikeUppercase(name);
        }
    }

    @Override
    public Predicate toPredicate(Root<MtgSet> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if (name == null) {
            return predicateAlwaysTrue(criteriaBuilder);
        }
        return criteriaBuilder.like(criteriaBuilder.upper(root.get("name")), name);
    }
}
