package com.example.demo.service;

import com.example.demo.model.Chart;
import com.example.demo.model.ChartItem;
import com.example.demo.repository.ChartItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChartItemServiceTest {
    @Mock
    ChartItemRepository chartItemRepository;

    @InjectMocks
    ChartItemService chartItemService;


    @Test
    public void addChartItem() {
        when(chartItemRepository.save(ArgumentMatchers.any(ChartItem.class))).thenReturn(
                new ChartItem(1, "Juice", 100));
        assertEquals("Juice", chartItemService.addChartItem(2, "Bread", 200).getName());

    }
    @Test
    public void deleteStudent(){
        ChartItem ci = new ChartItem(1,"Juice",100);
        when(chartItemRepository.findById(ci.getId())).thenReturn(Optional.of(ci));

        chartItemService.deleteChartItem(ci.getId());

        verify(chartItemRepository).deleteById(ci.getId());

    }
    @Test
    public void returnAllItems(){
        when(chartItemRepository.findAll()).thenReturn(Arrays.asList(
                new ChartItem(1,"Juice",100),
                new ChartItem(2,"Bread",200),
                new ChartItem(3,"Chocolate",2000)));
        assertEquals("Other",chartItemService.getAllChartItems().get(2).getName());
    }

}
