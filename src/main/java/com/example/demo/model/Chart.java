package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Chart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @JoinColumn(name = "chartItem_id", referencedColumnName = "id")
    @OneToOne(mappedBy = "chart", orphanRemoval = true)
    private ChartItem chartItem;
    public Chart(int id, ChartItem chartItem) {
        this.id = id;
        this.chartItem = chartItem;
    }
    @Transient
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ChartItem getChartItem() {
        return chartItem;
    }

    public void setChartItem(ChartItem chartItem) {
        this.chartItem = chartItem;
    }
}
