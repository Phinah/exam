package com.example.demo.service;

import com.example.demo.model.Chart;
import com.example.demo.model.ChartItem;
import com.example.demo.repository.ChartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChartItemService {
    @Autowired
    private ChartItemRepository chartItemRepository;

    public List<ChartItem> getAllChartItems(){
        return chartItemRepository.findAll();
    }
    public ChartItem addChartItem(Integer id, String name, int price) {
        ChartItem chartItem = new ChartItem(id, name, price);
        return chartItemRepository.save(chartItem);
    }

    public void deleteChartItem(Integer id){
        chartItemRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Item not found with id "+id));
        chartItemRepository.deleteById(id);
    }


}
