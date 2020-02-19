
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("subscription")
    @Expose
    private Subscription subscription;
    @SerializedName("plan")
    @Expose
    private Plan plan;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The subscription
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * 
     * @param subscription
     *     The subscription
     */
    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    /**
     * 
     * @return
     *     The plan
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * 
     * @param plan
     *     The plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * 
     * @return
     *     The sport
     */
    public Sport getSport() {
        return sport;
    }

    /**
     * 
     * @param sport
     *     The sport
     */
    public void setSport(Sport sport) {
        this.sport = sport;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("subscription".equals(name)) {
            if (value instanceof Subscription) {
                setSubscription(((Subscription) value));
            } else {
                throw new IllegalArgumentException(("property \"subscription\" is of type \"com.androidsmile.soccerapp.Subscription\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("plan".equals(name)) {
                if (value instanceof Plan) {
                    setPlan(((Plan) value));
                } else {
                    throw new IllegalArgumentException(("property \"plan\" is of type \"com.androidsmile.soccerapp.Plan\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("sport".equals(name)) {
                    if (value instanceof Sport) {
                        setSport(((Sport) value));
                    } else {
                        throw new IllegalArgumentException(("property \"sport\" is of type \"com.androidsmile.soccerapp.Sport\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("subscription".equals(name)) {
            return getSubscription();
        } else {
            if ("plan".equals(name)) {
                return getPlan();
            } else {
                if ("sport".equals(name)) {
                    return getSport();
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
        Object value = declaredPropertyOrNotFound(name, Meta.NOT_FOUND_VALUE);
        if (Meta.NOT_FOUND_VALUE!= value) {
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
