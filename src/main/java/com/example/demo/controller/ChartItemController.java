package com.example.demo.controller;

import com.example.demo.model.ChartItem;
import com.example.demo.service.ChartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChartItemController {

    @Autowired
    private ChartItemService chartItemService;


    @PostMapping(value = "/save")
    public ChartItem saveChartItem(@RequestBody ChartItem chartItem){
        return chartItemService.addChartItem(chartItem.getId(),chartItem.getName(),chartItem.getPrice());
    }
}
