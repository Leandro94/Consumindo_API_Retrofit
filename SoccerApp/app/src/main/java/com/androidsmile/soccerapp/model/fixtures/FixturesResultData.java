
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixturesResultData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private Integer name;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;
    @SerializedName("fixtures")
    @Expose
    private Fixtures fixtures;
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
    public Integer getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(Integer name) {
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
     *     The seasonId
     */
    public Integer getSeasonId() {
        return seasonId;
    }

    /**
     * 
     * @param seasonId
     *     The season_id
     */
    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    /**
     * 
     * @return
     *     The stageId
     */
    public Integer getStageId() {
        return stageId;
    }

    /**
     * 
     * @param stageId
     *     The stage_id
     */
    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    /**
     * 
     * @return
     *     The start
     */
    public String getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * 
     * @return
     *     The end
     */
    public String getEnd() {
        return end;
    }

    /**
     * 
     * @param end
     *     The end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * 
     * @return
     *     The fixtures
     */
    public Fixtures getFixtures() {
        return fixtures;
    }

    /**
     * 
     * @param fixtures
     *     The fixtures
     */
    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
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
                if (value instanceof Integer) {
                    setName(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"name\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
                    if ("season_id".equals(name)) {
                        if (value instanceof Integer) {
                            setSeasonId(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"season_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("stage_id".equals(name)) {
                            if (value instanceof Integer) {
                                setStageId(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"stage_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("start".equals(name)) {
                                if (value instanceof String) {
                                    setStart(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"start\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("end".equals(name)) {
                                    if (value instanceof String) {
                                        setEnd(((String) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"end\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("fixtures".equals(name)) {
                                        if (value instanceof Fixtures) {
                                            setFixtures(((Fixtures) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"fixtures\" is of type \"com.androidsmile.soccerapp.Fixtures\", but got "+ value.getClass().toString()));
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
                    if ("season_id".equals(name)) {
                        return getSeasonId();
                    } else {
                        if ("stage_id".equals(name)) {
                            return getStageId();
                        } else {
                            if ("start".equals(name)) {
                                return getStart();
                            } else {
                                if ("end".equals(name)) {
                                    return getEnd();
                                } else {
                                    if ("fixtures".equals(name)) {
                                        return getFixtures();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, FixturesResultData.NOT_FOUND_VALUE);
        if (FixturesResultData.NOT_FOUND_VALUE!= value) {
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
