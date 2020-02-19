
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoalscorerDatum {

    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("player_id")
    @Expose
    private Integer playerId;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("goals")
    @Expose
    private Integer goals;
    @SerializedName("penalty_goals")
    @Expose
    private Integer penaltyGoals;
    @SerializedName("player")
    @Expose
    private Player player;
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
     *     The goals
     */
    public Integer getGoals() {
        return goals;
    }

    /**
     * 
     * @param goals
     *     The goals
     */
    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    /**
     * 
     * @return
     *     The penaltyGoals
     */
    public Integer getPenaltyGoals() {
        return penaltyGoals;
    }

    /**
     * 
     * @param penaltyGoals
     *     The penalty_goals
     */
    public void setPenaltyGoals(Integer penaltyGoals) {
        this.penaltyGoals = penaltyGoals;
    }

    /**
     * 
     * @return
     *     The player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 
     * @param player
     *     The player
     */
    public void setPlayer(Player player) {
        this.player = player;
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
                    if ("goals".equals(name)) {
                        if (value instanceof Integer) {
                            setGoals(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"goals\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("penalty_goals".equals(name)) {
                            if (value instanceof Integer) {
                                setPenaltyGoals(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"penalty_goals\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("player".equals(name)) {
                                if (value instanceof Player) {
                                    setPlayer(((Player) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"player\" is of type \"model.Player\", but got "+ value.getClass().toString()));
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
                    if ("goals".equals(name)) {
                        return getGoals();
                    } else {
                        if ("penalty_goals".equals(name)) {
                            return getPenaltyGoals();
                        } else {
                            if ("player".equals(name)) {
                                return getPlayer();
                            } else {
                                return notFoundValue;
                            }
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
        Object value = declaredPropertyOrNotFound(name, GoalscorerDatum.NOT_FOUND_VALUE);
        if (GoalscorerDatum.NOT_FOUND_VALUE!= value) {
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
