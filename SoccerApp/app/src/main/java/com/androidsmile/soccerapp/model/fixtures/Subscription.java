
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscription {

    @SerializedName("started_at")
    @Expose
    private StartedAt startedAt;
    @SerializedName("trial_ends_at")
    @Expose
    private Object trialEndsAt;
    @SerializedName("ends_at")
    @Expose
    private Object endsAt;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The startedAt
     */
    public StartedAt getStartedAt() {
        return startedAt;
    }

    /**
     * 
     * @param startedAt
     *     The started_at
     */
    public void setStartedAt(StartedAt startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * 
     * @return
     *     The trialEndsAt
     */
    public Object getTrialEndsAt() {
        return trialEndsAt;
    }

    /**
     * 
     * @param trialEndsAt
     *     The trial_ends_at
     */
    public void setTrialEndsAt(Object trialEndsAt) {
        this.trialEndsAt = trialEndsAt;
    }

    /**
     * 
     * @return
     *     The endsAt
     */
    public Object getEndsAt() {
        return endsAt;
    }

    /**
     * 
     * @param endsAt
     *     The ends_at
     */
    public void setEndsAt(Object endsAt) {
        this.endsAt = endsAt;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("started_at".equals(name)) {
            if (value instanceof StartedAt) {
                setStartedAt(((StartedAt) value));
            } else {
                throw new IllegalArgumentException(("property \"started_at\" is of type \"com.androidsmile.soccerapp.StartedAt\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("trial_ends_at".equals(name)) {
                if (value instanceof Object) {
                    setTrialEndsAt(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"trial_ends_at\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("ends_at".equals(name)) {
                    if (value instanceof Object) {
                        setEndsAt(((Object) value));
                    } else {
                        throw new IllegalArgumentException(("property \"ends_at\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("started_at".equals(name)) {
            return getStartedAt();
        } else {
            if ("trial_ends_at".equals(name)) {
                return getTrialEndsAt();
            } else {
                if ("ends_at".equals(name)) {
                    return getEndsAt();
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
        Object value = declaredPropertyOrNotFound(name, Subscription.NOT_FOUND_VALUE);
        if (Subscription.NOT_FOUND_VALUE!= value) {
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
