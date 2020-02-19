
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("starting_at")
    @Expose
    private StartingAt startingAt;
    @SerializedName("minute")
    @Expose
    private Object minute;
    @SerializedName("extra_minute")
    @Expose
    private Object extraMinute;
    @SerializedName("injury_time")
    @Expose
    private Object injuryTime;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The startingAt
     */
    public StartingAt getStartingAt() {
        return startingAt;
    }

    /**
     * 
     * @param startingAt
     *     The starting_at
     */
    public void setStartingAt(StartingAt startingAt) {
        this.startingAt = startingAt;
    }

    /**
     * 
     * @return
     *     The minute
     */
    public Object getMinute() {
        return minute;
    }

    /**
     * 
     * @param minute
     *     The minute
     */
    public void setMinute(Object minute) {
        this.minute = minute;
    }

    /**
     * 
     * @return
     *     The extraMinute
     */
    public Object getExtraMinute() {
        return extraMinute;
    }

    /**
     * 
     * @param extraMinute
     *     The extra_minute
     */
    public void setExtraMinute(Object extraMinute) {
        this.extraMinute = extraMinute;
    }

    /**
     * 
     * @return
     *     The injuryTime
     */
    public Object getInjuryTime() {
        return injuryTime;
    }

    /**
     * 
     * @param injuryTime
     *     The injury_time
     */
    public void setInjuryTime(Object injuryTime) {
        this.injuryTime = injuryTime;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("status".equals(name)) {
            if (value instanceof String) {
                setStatus(((String) value));
            } else {
                throw new IllegalArgumentException(("property \"status\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("starting_at".equals(name)) {
                if (value instanceof StartingAt) {
                    setStartingAt(((StartingAt) value));
                } else {
                    throw new IllegalArgumentException(("property \"starting_at\" is of type \"com.androidsmile.soccerapp.StartingAt\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("minute".equals(name)) {
                    if (value instanceof Object) {
                        setMinute(((Object) value));
                    } else {
                        throw new IllegalArgumentException(("property \"minute\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("extra_minute".equals(name)) {
                        if (value instanceof Object) {
                            setExtraMinute(((Object) value));
                        } else {
                            throw new IllegalArgumentException(("property \"extra_minute\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("injury_time".equals(name)) {
                            if (value instanceof Object) {
                                setInjuryTime(((Object) value));
                            } else {
                                throw new IllegalArgumentException(("property \"injury_time\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
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
        if ("status".equals(name)) {
            return getStatus();
        } else {
            if ("starting_at".equals(name)) {
                return getStartingAt();
            } else {
                if ("minute".equals(name)) {
                    return getMinute();
                } else {
                    if ("extra_minute".equals(name)) {
                        return getExtraMinute();
                    } else {
                        if ("injury_time".equals(name)) {
                            return getInjuryTime();
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
        Object value = declaredPropertyOrNotFound(name, Time.NOT_FOUND_VALUE);
        if (Time.NOT_FOUND_VALUE!= value) {
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
