package com.app.bean;

public class Engine {
    private int modelyear;

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelyear=" + modelyear +
                '}';
    }
}
