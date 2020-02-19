
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixturesResult {

    @SerializedName("data")
    @Expose
    private FixturesResultData data;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The data
     */
    public FixturesResultData getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(FixturesResultData data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("data".equals(name)) {
            if (value instanceof FixturesResultData) {
                setData(((FixturesResultData) value));
            } else {
                throw new IllegalArgumentException(("property \"data\" is of type \"com.androidsmile.soccerapp.FixturesResultData\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("meta".equals(name)) {
                if (value instanceof Meta) {
                    setMeta(((Meta) value));
                } else {
                    throw new IllegalArgumentException(("property \"meta\" is of type \"com.androidsmile.soccerapp.Meta\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("data".equals(name)) {
            return getData();
        } else {
            if ("meta".equals(name)) {
                return getMeta();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, FixturesResult.NOT_FOUND_VALUE);
        if (FixturesResult.NOT_FOUND_VALUE!= value) {
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
