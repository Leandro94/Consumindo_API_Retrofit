
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssistscorerDatum {

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("player_id")
    @Expose
    private Integer playerId;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The playerId
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * 
     * @param playerId
     *     The player_id
     */
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * 
     * @return
     *     The teamId
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * 
     * @param teamId
     *     The team_id
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * 
     * @return
     *     The assists
     */
    public Integer getAssists() {
        return assists;
    }

    /**
     * 
     * @param assists
     *     The assists
     */
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("position".equals(name)) {
            if (value instanceof Integer) {
                setPosition(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"position\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("player_id".equals(name)) {
                if (value instanceof Integer) {
                    setPlayerId(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"player_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("team_id".equals(name)) {
                    if (value instanceof Integer) {
                        setTeamId(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"team_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("assists".equals(name)) {
                        if (value instanceof Integer) {
                            setAssists(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"assists\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("position".equals(name)) {
            return getPosition();
        } else {
            if ("player_id".equals(name)) {
                return getPlayerId();
            } else {
                if ("team_id".equals(name)) {
                    return getTeamId();
                } else {
                    if ("assists".equals(name)) {
                        return getAssists();
                    } else {
                        return notFoundValue;
                    }
                }
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, AssistscorerDatum.NOT_FOUND_VALUE);
        if (AssistscorerDatum.NOT_FOUND_VALUE!= value) {
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
