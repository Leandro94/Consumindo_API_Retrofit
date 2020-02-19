
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisitorTeam {

    @SerializedName("data")
    @Expose
    private VisitorTeamData data;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The data
     */
    public VisitorTeamData getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(VisitorTeamData data) {
        this.data = data;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("data".equals(name)) {
            if (value instanceof VisitorTeamData) {
                setData(((VisitorTeamData) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"com.androidsmile.soccerapp.VisitorTeamData\", but got "+ value.getClass().toString()));
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
        Object value = declaredPropertyOrNotFound(name, VisitorTeam.NOT_FOUND_VALUE);
        if (VisitorTeam.NOT_FOUND_VALUE!= value) {
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
