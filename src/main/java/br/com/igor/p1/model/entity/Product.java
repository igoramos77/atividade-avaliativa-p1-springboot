package br.com.igor.p1.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Product {
    private Integer id;
    private String description;
    private Float unity_value;
    private Integer inventory_quantity;
    private Timestamp created_at;
    private Timestamp update_at;
    private List<Category> categoryList;
    private List<Image> imageList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnity_value() {
        return unity_value;
    }

    public void setUnity_value(Float unity_value) {
        this.unity_value = unity_value;
    }

    public Integer getInventory_quantity() {
        return inventory_quantity;
    }

    public void setInventory_quantity(Integer inventory_quantity) {
        this.inventory_quantity = inventory_quantity;
    }

    public Timestamp getCreated_at() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdate_at() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}