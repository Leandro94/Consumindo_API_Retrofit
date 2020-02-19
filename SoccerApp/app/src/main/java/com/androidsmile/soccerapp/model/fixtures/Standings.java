
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standings {

    @SerializedName("localteam_position")
    @Expose
    private Object localteamPosition;
    @SerializedName("visitorteam_position")
    @Expose
    private Object visitorteamPosition;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The localteamPosition
     */
    public Object getLocalteamPosition() {
        return localteamPosition;
    }

    /**
     * 
     * @param localteamPosition
     *     The localteam_position
     */
    public void setLocalteamPosition(Object localteamPosition) {
        this.localteamPosition = localteamPosition;
    }

    /**
     * 
     * @return
     *     The visitorteamPosition
     */
    public Object getVisitorteamPosition() {
        return visitorteamPosition;
    }

    /**
     * 
     * @param visitorteamPosition
     *     The visitorteam_position
     */
    public void setVisitorteamPosition(Object visitorteamPosition) {
        this.visitorteamPosition = visitorteamPosition;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("localteam_position".equals(name)) {
            if (value instanceof Object) {
                setLocalteamPosition(((Object) value));
            } else {
                throw new IllegalArgumentException(("property \"localteam_position\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("visitorteam_position".equals(name)) {
                if (value instanceof Object) {
                    setVisitorteamPosition(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"visitorteam_position\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("localteam_position".equals(name)) {
            return getLocalteamPosition();
        } else {
            if ("visitorteam_position".equals(name)) {
                return getVisitorteamPosition();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Standings.NOT_FOUND_VALUE);
        if (Standings.NOT_FOUND_VALUE!= value) {
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
