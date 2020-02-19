
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Formations {

    @SerializedName("localteam_formation")
    @Expose
    private Object localteamFormation;
    @SerializedName("visitorteam_formation")
    @Expose
    private Object visitorteamFormation;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The localteamFormation
     */
    public Object getLocalteamFormation() {
        return localteamFormation;
    }

    /**
     * 
     * @param localteamFormation
     *     The localteam_formation
     */
    public void setLocalteamFormation(Object localteamFormation) {
        this.localteamFormation = localteamFormation;
    }

    /**
     * 
     * @return
     *     The visitorteamFormation
     */
    public Object getVisitorteamFormation() {
        return visitorteamFormation;
    }

    /**
     * 
     * @param visitorteamFormation
     *     The visitorteam_formation
     */
    public void setVisitorteamFormation(Object visitorteamFormation) {
        this.visitorteamFormation = visitorteamFormation;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("localteam_formation".equals(name)) {
            if (value instanceof Object) {
                setLocalteamFormation(((Object) value));
            } else {
                throw new IllegalArgumentException(("property \"localteam_formation\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("visitorteam_formation".equals(name)) {
                if (value instanceof Object) {
                    setVisitorteamFormation(((Object) value));
                } else {
                    throw new IllegalArgumentException(("property \"visitorteam_formation\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                return false;
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("localteam_formation".equals(name)) {
            return getLocalteamFormation();
        } else {
            if ("visitorteam_formation".equals(name)) {
                return getVisitorteamFormation();
            } else {
                return notFoundValue;
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Formations.NOT_FOUND_VALUE);
        if (Formations.NOT_FOUND_VALUE!= value) {
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
