
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalTeam {

    @SerializedName("data")
    @Expose
    private LocalTeamData data;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The data
     */
    public LocalTeamData getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(LocalTeamData data) {
        this.data = data;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("data".equals(name)) {
            if (value instanceof LocalTeamData) {
                setData(((LocalTeamData) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"com.androidsmile.soccerapp.LocalTeamData\", but got "+ value.getClass().toString()));
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
        Object value = declaredPropertyOrNotFound(name, LocalTeam.NOT_FOUND_VALUE);
        if (LocalTeam.NOT_FOUND_VALUE!= value) {
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
