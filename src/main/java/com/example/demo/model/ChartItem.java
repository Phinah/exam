package com.example.demo.model;


import javax.persistence.*;

@Entity

public class ChartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToOne(mappedBy ="chartItem")
    @JoinColumn(name = "chart_id", referencedColumnName = "id")
    private Chart chart;

    public ChartItem(int id, String name, int price, Chart chart) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.chart = chart;
    }

    private String name;

    private int price;

    public ChartItem() {
        super();
    }

    public ChartItem(Integer id, String name, int price) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
