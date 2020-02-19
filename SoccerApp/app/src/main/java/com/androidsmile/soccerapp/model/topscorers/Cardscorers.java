
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Cardscorers {

    @SerializedName("data")
    @Expose
    private List<CardscorerDatum> data = new ArrayList<CardscorerDatum>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The data
     */
    public List<CardscorerDatum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<CardscorerDatum> data) {
        this.data = data;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("data".equals(name)) {
            if (value instanceof List) {
                setData(((List<CardscorerDatum>) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"java.util.List<model.CardscorerDatum>\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            return false;
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("data".equals(name)) {
            return getData();
        } else {
            return notFoundValue;
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Cardscorers.NOT_FOUND_VALUE);
        if (Cardscorers.NOT_FOUND_VALUE!= value) {
            return ((T) value);
        } else {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

    public void set(String name, Object value) {
        if (!declaredProperty(name, value)) {
            throw new IllegalArgumentException((("property \""+ name)+"\" is not defined"));
        }
    }

}
