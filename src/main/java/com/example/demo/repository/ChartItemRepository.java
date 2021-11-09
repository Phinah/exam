package com.example.demo.repository;

import com.example.demo.model.ChartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChartItemRepository extends JpaRepository<ChartItem, Integer> {
}
