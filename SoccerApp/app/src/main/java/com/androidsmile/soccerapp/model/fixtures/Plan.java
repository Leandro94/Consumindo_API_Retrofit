
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plan {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("request_limit")
    @Expose
    private String requestLimit;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The requestLimit
     */
    public String getRequestLimit() {
        return requestLimit;
    }

    /**
     * 
     * @param requestLimit
     *     The request_limit
     */
    public void setRequestLimit(String requestLimit) {
        this.requestLimit = requestLimit;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("name".equals(name)) {
            if (value instanceof String) {
                setName(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("price".equals(name)) {
                if (value instanceof String) {
                    setPrice(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"price\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("request_limit".equals(name)) {
                    if (value instanceof String) {
                        setRequestLimit(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"request_limit\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("name".equals(name)) {
            return getName();
        } else {
            if ("price".equals(name)) {
                return getPrice();
            } else {
                if ("request_limit".equals(name)) {
                    return getRequestLimit();
                } else {
                    return notFoundValue;
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Plan.NOT_FOUND_VALUE);
        if (Plan.NOT_FOUND_VALUE!= value) {
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
