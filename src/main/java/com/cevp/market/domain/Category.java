package com.cevp.market.domain;

public class Category {
    
    private int idCategory;
    private String categoryDesc;
    private boolean active;


    public int getIdCategory() {
        return this.idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryDesc() {
        return this.categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
