package com.leandro.retrofitexamplesecao3;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "breakfast_menu",strict = false)
public class BreakfastMenu {
    @ElementList(name = "food",inline=true)
    private List<Food>foodList;

    public List<Food>getFoodList(){return foodList;}

    public void setFoodList(List<Food> foodList){this.foodList=foodList;}
}
