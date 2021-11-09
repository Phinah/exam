package com.example.demo.controller;

import com.example.demo.model.Chart;
import com.example.demo.model.ChartItem;
import com.example.demo.service.ChartItemService;
import com.example.demo.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class ChartController {
    @Autowired

    private ChartService chartService;
    @GetMapping("/all-chartItems")
    public List<Chart> getAll(){
        return chartService.getAll();
    }
}
