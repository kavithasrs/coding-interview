package com.practice.codinginterview.collections;

import java.util.*;
import java.util.stream.Collectors;

public class SortingArrayList  {
    public static void main(String[] args) {

        List<Fund> funds = Arrays.asList(new Fund(1, 545.435, "apple"),
                new Fund(4, 123d, "Mango"),
                new Fund(3, 332d, "grapes"),
                new Fund(2, 532d, "orange")
                );
        System.out.println(funds);
        Collections.sort(funds, new FundComparator());
        Collections.sort(funds, (o1,o2) -> o1.id -o2.id);
        Collections.sort(funds, Comparator.comparingDouble(o -> o.netAsset));
        System.out.println(funds);

        System.out.println(funds);

        funds.stream()
                .map(Fund::getId)
                .forEach(System.out::println);
    }
}

class FundComparator implements Comparator<Fund>{
    @Override
    public int compare(Fund o1, Fund o2) {
        return o1.id - o2.id;
    }
}


class Fund {
    int id;
    Double netAsset;
    String desc;

    public Fund(int id, Double netAsset, String desc) {
        this.id = id;
        this.netAsset = netAsset;
        this.desc = desc;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getNetAsset() {
        return netAsset;
    }

    public void setNetAsset(Double netAsset) {
        this.netAsset = netAsset;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Fund{" +
                "id=" + id +
                ", netAsset=" + netAsset +
                ", desc='" + desc + '\'' +
                '}';
    }
}

