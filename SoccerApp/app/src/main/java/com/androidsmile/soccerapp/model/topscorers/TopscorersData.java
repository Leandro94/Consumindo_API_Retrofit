
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopscorersData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("is_current_season")
    @Expose
    private Boolean isCurrentSeason;
    @SerializedName("current_round_id")
    @Expose
    private Object currentRoundId;
    @SerializedName("current_stage_id")
    @Expose
    private Object currentStageId;
    @SerializedName("goalscorers")
    @Expose
    private Goalscorers goalscorers;
    @SerializedName("assistscorers")
    @Expose
    private Assistscorers assistscorers;
    @SerializedName("cardscorers")
    @Expose
    private Cardscorers cardscorers;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The leagueId
     */
    public Integer getLeagueId() {
        return leagueId;
    }

    /**
     * 
     * @param leagueId
     *     The league_id
     */
    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    /**
     * 
     * @return
     *     The isCurrentSeason
     */
    public Boolean getIsCurrentSeason() {
        return isCurrentSeason;
    }

    /**
     * 
     * @param isCurrentSeason
     *     The is_current_season
     */
    public void setIsCurrentSeason(Boolean isCurrentSeason) {
        this.isCurrentSeason = isCurrentSeason;
    }

    /**
     * 
     * @return
     *     The currentRoundId
     */
    public Object getCurrentRoundId() {
        return currentRoundId;
    }

    /**
     * 
     * @param currentRoundId
     *     The current_round_id
     */
    public void setCurrentRoundId(Object currentRoundId) {
        this.currentRoundId = currentRoundId;
    }

    /**
     * 
     * @return
     *     The currentStageId
     */
    public Object getCurrentStageId() {
        return currentStageId;
    }

    /**
     * 
     * @param currentStageId
     *     The current_stage_id
     */
    public void setCurrentStageId(Object currentStageId) {
        this.currentStageId = currentStageId;
    }

    /**
     * 
     * @return
     *     The goalscorers
     */
    public Goalscorers getGoalscorers() {
        return goalscorers;
    }

    /**
     * 
     * @param goalscorers
     *     The goalscorers
     */
    public void setGoalscorers(Goalscorers goalscorers) {
        this.goalscorers = goalscorers;
    }

    /**
     * 
     * @return
     *     The assistscorers
     */
    public Assistscorers getAssistscorers() {
        return assistscorers;
    }

    /**
     * 
     * @param assistscorers
     *     The assistscorers
     */
    public void setAssistscorers(Assistscorers assistscorers) {
        this.assistscorers = assistscorers;
    }

    /**
     * 
     * @return
     *     The cardscorers
     */
    public Cardscorers getCardscorers() {
        return cardscorers;
    }

    /**
     * 
     * @param cardscorers
     *     The cardscorers
     */
    public void setCardscorers(Cardscorers cardscorers) {
        this.cardscorers = cardscorers;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("id".equals(name)) {
            if (value instanceof Integer) {
                setId(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("name".equals(name)) {
                if (value instanceof String) {
                    setName(((String) value));
                } else {
                    throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("league_id".equals(name)) {
                    if (value instanceof Integer) {
                        setLeagueId(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"league_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("is_current_season".equals(name)) {
                        if (value instanceof Boolean) {
                            setIsCurrentSeason(((Boolean) value));
                        } else {
                            throw new IllegalArgumentException(("property \"is_current_season\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("current_round_id".equals(name)) {
                            if (value instanceof Object) {
                                setCurrentRoundId(((Object) value));
                            } else {
                                throw new IllegalArgumentException(("property \"current_round_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("current_stage_id".equals(name)) {
                                if (value instanceof Object) {
                                    setCurrentStageId(((Object) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"current_stage_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("goalscorers".equals(name)) {
                                    if (value instanceof Goalscorers) {
                                        setGoalscorers(((Goalscorers) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"goalscorers\" is of type \"model.Goalscorers\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("assistscorers".equals(name)) {
                                        if (value instanceof Assistscorers) {
                                            setAssistscorers(((Assistscorers) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"assistscorers\" is of type \"model.Assistscorers\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("cardscorers".equals(name)) {
                                            if (value instanceof Cardscorers) {
                                                setCardscorers(((Cardscorers) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"cardscorers\" is of type \"model.Cardscorers\", but got "+ value.getClass().toString()));
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
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
        } else {
            if ("name".equals(name)) {
                return getName();
            } else {
                if ("league_id".equals(name)) {
                    return getLeagueId();
                } else {
                    if ("is_current_season".equals(name)) {
                        return getIsCurrentSeason();
                    } else {
                        if ("current_round_id".equals(name)) {
                            return getCurrentRoundId();
                        } else {
                            if ("current_stage_id".equals(name)) {
                                return getCurrentStageId();
                            } else {
                                if ("goalscorers".equals(name)) {
                                    return getGoalscorers();
                                } else {
                                    if ("assistscorers".equals(name)) {
                                        return getAssistscorers();
                                    } else {
                                        if ("cardscorers".equals(name)) {
                                            return getCardscorers();
                                        } else {
                                            return notFoundValue;
                                        }
                                    }
                                }
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
        Object value = declaredPropertyOrNotFound(name, TopscorersData.NOT_FOUND_VALUE);
        if (TopscorersData.NOT_FOUND_VALUE!= value) {
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
