
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardscorerDatum {

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("player_id")
    @Expose
    private Integer playerId;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("yellowcards")
    @Expose
    private Integer yellowcards;
    @SerializedName("redcards")
    @Expose
    private Integer redcards;
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
     *     The yellowcards
     */
    public Integer getYellowcards() {
        return yellowcards;
    }

    /**
     * 
     * @param yellowcards
     *     The yellowcards
     */
    public void setYellowcards(Integer yellowcards) {
        this.yellowcards = yellowcards;
    }

    /**
     * 
     * @return
     *     The redcards
     */
    public Integer getRedcards() {
        return redcards;
    }

    /**
     * 
     * @param redcards
     *     The redcards
     */
    public void setRedcards(Integer redcards) {
        this.redcards = redcards;
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
                    if ("yellowcards".equals(name)) {
                        if (value instanceof Integer) {
                            setYellowcards(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"yellowcards\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("redcards".equals(name)) {
                            if (value instanceof Integer) {
                                setRedcards(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"redcards\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
        if ("position".equals(name)) {
            return getPosition();
        } else {
            if ("player_id".equals(name)) {
                return getPlayerId();
            } else {
                if ("team_id".equals(name)) {
                    return getTeamId();
                } else {
                    if ("yellowcards".equals(name)) {
                        return getYellowcards();
                    } else {
                        if ("redcards".equals(name)) {
                            return getRedcards();
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
        Object value = declaredPropertyOrNotFound(name, CardscorerDatum.NOT_FOUND_VALUE);
        if (CardscorerDatum.NOT_FOUND_VALUE!= value) {
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
