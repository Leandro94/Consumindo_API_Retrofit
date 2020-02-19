
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Assistscorers {

    @SerializedName("data")
    @Expose
    private List<AssistscorerDatum> data = new ArrayList<AssistscorerDatum>();
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The data
     */
    public List<AssistscorerDatum> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<AssistscorerDatum> data) {
        this.data = data;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("data".equals(name)) {
            if (value instanceof List) {
                setData(((List<AssistscorerDatum>) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"java.util.List<model.AssistscorerDatum>\", but got "+ value.getClass().toString()));
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
        Object value = declaredPropertyOrNotFound(name, Assistscorers.NOT_FOUND_VALUE);
        if (Assistscorers.NOT_FOUND_VALUE!= value) {
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
