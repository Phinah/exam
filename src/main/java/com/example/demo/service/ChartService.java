package com.example.demo.service;

import com.example.demo.model.Chart;
import com.example.demo.model.ChartItem;
import com.example.demo.repository.ChartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChartService {
    @Autowired

    private ChartRepository chartRepository;

    public Chart createChart(Integer id,ChartItem chartItem){
        Chart chart = new Chart(id,chartItem);
        return chartRepository.save(chart);
    }


    public List<Chart> getAll(){
        List<Chart> charts = chartRepository.findAll();

        for(Chart chart:charts){
            chart.setValue(chart.getChartItem().getPrice());
        }
        return charts;
    }
}
