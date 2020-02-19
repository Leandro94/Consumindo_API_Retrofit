
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coaches {

    @SerializedName("localteam_coach_id")
    @Expose
    private Object localteamCoachId;
    @SerializedName("visitorteam_coach_id")
    @Expose
    private Object visitorteamCoachId;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The localteamCoachId
     */
    public Object getLocalteamCoachId() {
        return localteamCoachId;
    }

    /**
     * 
     * @param localteamCoachId
     *     The localteam_coach_id
     */
    public void setLocalteamCoachId(Object localteamCoachId) {
        this.localteamCoachId = localteamCoachId;
    }

    /**
     * 
     * @return
     *     The visitorteamCoachId
     */
    public Object getVisitorteamCoachId() {
        return visitorteamCoachId;
    }

    /**
     * 
     * @param visitorteamCoachId
     *     The visitorteam_coach_id
     */
    public void setVisitorteamCoachId(Object visitorteamCoachId) {
        this.visitorteamCoachId = visitorteamCoachId;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("localteam_coach_id".equals(name)) {
            if (value instanceof Object) {
                setLocalteamCoachId(((Object) value));
            } else {
                throw new IllegalArgumentException(("property \"localteam_coach_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("visitorteam_coach_id".equals(name)) {
                if (value instanceof Object) {
                    setVisitorteamCoachId(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"visitorteam_coach_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("localteam_coach_id".equals(name)) {
            return getLocalteamCoachId();
        } else {
            if ("visitorteam_coach_id".equals(name)) {
                return getVisitorteamCoachId();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Coaches.NOT_FOUND_VALUE);
        if (Coaches.NOT_FOUND_VALUE!= value) {
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
