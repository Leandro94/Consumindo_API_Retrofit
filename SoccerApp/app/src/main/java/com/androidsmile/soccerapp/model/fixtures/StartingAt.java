
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartingAt {

    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 
     * @param dateTime
     *     The date_time
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

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
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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
        if ("date_time".equals(name)) {
            if (value instanceof String) {
                setDateTime(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"date_time\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("date".equals(name)) {
                if (value instanceof String) {
                    setDate(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"date\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("time".equals(name)) {
                    if (value instanceof String) {
                        setTime(((String) value));
                    } else {
                        throw new IllegalArgumentException(("property \"time\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("timestamp".equals(name)) {
                        if (value instanceof Integer) {
                            setTimestamp(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"timestamp\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("date_time".equals(name)) {
            return getDateTime();
        } else {
            if ("date".equals(name)) {
                return getDate();
            } else {
                if ("time".equals(name)) {
                    return getTime();
                } else {
                    if ("timestamp".equals(name)) {
                        return getTimestamp();
                    } else {
                        if ("timezone".equals(name)) {
                            return getTimezone();
                        } else {
                            return notFoundValue;
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, StartingAt.NOT_FOUND_VALUE);
        if (StartingAt.NOT_FOUND_VALUE!= value) {
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
