
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartedAt {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timezone_type")
    @Expose
    private Integer timezoneType;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The timezoneType
     */
    public Integer getTimezoneType() {
        return timezoneType;
    }

    /**
     * 
     * @param timezoneType
     *     The timezone_type
     */
    public void setTimezoneType(Integer timezoneType) {
        this.timezoneType = timezoneType;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("date".equals(name)) {
            if (value instanceof String) {
                setDate(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"date\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("timezone_type".equals(name)) {
                if (value instanceof Integer) {
                    setTimezoneType(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"timezone_type\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("timezone".equals(name)) {
                    if (value instanceof String) {
                        setTimezone(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"timezone\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("date".equals(name)) {
            return getDate();
        } else {
            if ("timezone_type".equals(name)) {
                return getTimezoneType();
            } else {
                if ("timezone".equals(name)) {
                    return getTimezone();
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
        Object value = declaredPropertyOrNotFound(name, StartedAt.NOT_FOUND_VALUE);
        if (StartedAt.NOT_FOUND_VALUE!= value) {
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
