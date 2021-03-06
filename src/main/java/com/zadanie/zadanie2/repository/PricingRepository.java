package com.zadanie.zadanie2.repository;

import com.zadanie.zadanie2.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricingRepository extends JpaRepository<Pricing,Long>{
    public List<Pricing> findById(Long id);
}
