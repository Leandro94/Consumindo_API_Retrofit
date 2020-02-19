
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixtureDatum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("round_id")
    @Expose
    private Integer roundId;
    @SerializedName("aggregate_id")
    @Expose
    private Object aggregateId;
    @SerializedName("venue_id")
    @Expose
    private Integer venueId;
    @SerializedName("referee_id")
    @Expose
    private Object refereeId;
    @SerializedName("localteam_id")
    @Expose
    private Integer localteamId;
    @SerializedName("visitorteam_id")
    @Expose
    private Integer visitorteamId;
    @SerializedName("weather_report")
    @Expose
    private Object weatherReport;
    @SerializedName("commentaries")
    @Expose
    private Boolean commentaries;
    @SerializedName("attendance")
    @Expose
    private Object attendance;
    @SerializedName("winning_odds_calculated")
    @Expose
    private Boolean winningOddsCalculated;
    @SerializedName("formations")
    @Expose
    private Formations formations;
    @SerializedName("scores")
    @Expose
    private Scores scores;
    @SerializedName("time")
    @Expose
    private Time time;
    @SerializedName("coaches")
    @Expose
    private Coaches coaches;
    @SerializedName("standings")
    @Expose
    private Standings standings;
    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("localTeam")
    @Expose
    private LocalTeam localTeam;
    @SerializedName("visitorTeam")
    @Expose
    private VisitorTeam visitorTeam;
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
     *     The roundId
     */
    public Integer getRoundId() {
        return roundId;
    }

    /**
     * 
     * @param roundId
     *     The round_id
     */
    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    /**
     * 
     * @return
     *     The aggregateId
     */
    public Object getAggregateId() {
        return aggregateId;
    }

    /**
     * 
     * @param aggregateId
     *     The aggregate_id
     */
    public void setAggregateId(Object aggregateId) {
        this.aggregateId = aggregateId;
    }

    /**
     * 
     * @return
     *     The venueId
     */
    public Integer getVenueId() {
        return venueId;
    }

    /**
     * 
     * @param venueId
     *     The venue_id
     */
    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    /**
     * 
     * @return
     *     The refereeId
     */
    public Object getRefereeId() {
        return refereeId;
    }

    /**
     * 
     * @param refereeId
     *     The referee_id
     */
    public void setRefereeId(Object refereeId) {
        this.refereeId = refereeId;
    }

    /**
     * 
     * @return
     *     The localteamId
     */
    public Integer getLocalteamId() {
        return localteamId;
    }

    /**
     * 
     * @param localteamId
     *     The localteam_id
     */
    public void setLocalteamId(Integer localteamId) {
        this.localteamId = localteamId;
    }

    /**
     * 
     * @return
     *     The visitorteamId
     */
    public Integer getVisitorteamId() {
        return visitorteamId;
    }

    /**
     * 
     * @param visitorteamId
     *     The visitorteam_id
     */
    public void setVisitorteamId(Integer visitorteamId) {
        this.visitorteamId = visitorteamId;
    }

    /**
     * 
     * @return
     *     The weatherReport
     */
    public Object getWeatherReport() {
        return weatherReport;
    }

    /**
     * 
     * @param weatherReport
     *     The weather_report
     */
    public void setWeatherReport(Object weatherReport) {
        this.weatherReport = weatherReport;
    }

    /**
     * 
     * @return
     *     The commentaries
     */
    public Boolean getCommentaries() {
        return commentaries;
    }

    /**
     * 
     * @param commentaries
     *     The commentaries
     */
    public void setCommentaries(Boolean commentaries) {
        this.commentaries = commentaries;
    }

    /**
     * 
     * @return
     *     The attendance
     */
    public Object getAttendance() {
        return attendance;
    }

    /**
     * 
     * @param attendance
     *     The attendance
     */
    public void setAttendance(Object attendance) {
        this.attendance = attendance;
    }

    /**
     * 
     * @return
     *     The winningOddsCalculated
     */
    public Boolean getWinningOddsCalculated() {
        return winningOddsCalculated;
    }

    /**
     * 
     * @param winningOddsCalculated
     *     The winning_odds_calculated
     */
    public void setWinningOddsCalculated(Boolean winningOddsCalculated) {
        this.winningOddsCalculated = winningOddsCalculated;
    }

    /**
     * 
     * @return
     *     The formations
     */
    public Formations getFormations() {
        return formations;
    }

    /**
     * 
     * @param formations
     *     The formations
     */
    public void setFormations(Formations formations) {
        this.formations = formations;
    }

    /**
     * 
     * @return
     *     The scores
     */
    public Scores getScores() {
        return scores;
    }

    /**
     * 
     * @param scores
     *     The scores
     */
    public void setScores(Scores scores) {
        this.scores = scores;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Time getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The coaches
     */
    public Coaches getCoaches() {
        return coaches;
    }

    /**
     * 
     * @param coaches
     *     The coaches
     */
    public void setCoaches(Coaches coaches) {
        this.coaches = coaches;
    }

    /**
     * 
     * @return
     *     The standings
     */
    public Standings getStandings() {
        return standings;
    }

    /**
     * 
     * @param standings
     *     The standings
     */
    public void setStandings(Standings standings) {
        this.standings = standings;
    }

    /**
     * 
     * @return
     *     The deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted
     *     The deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 
     * @return
     *     The localTeam
     */
    public LocalTeam getLocalTeam() {
        return localTeam;
    }

    /**
     * 
     * @param localTeam
     *     The localTeam
     */
    public void setLocalTeam(LocalTeam localTeam) {
        this.localTeam = localTeam;
    }

    /**
     * 
     * @return
     *     The visitorTeam
     */
    public VisitorTeam getVisitorTeam() {
        return visitorTeam;
    }

    /**
     * 
     * @param visitorTeam
     *     The visitorTeam
     */
    public void setVisitorTeam(VisitorTeam visitorTeam) {
        this.visitorTeam = visitorTeam;
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
                        if ("round_id".equals(name)) {
                            if (value instanceof Integer) {
                                setRoundId(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"round_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("aggregate_id".equals(name)) {
                                if (value instanceof Object) {
                                    setAggregateId(((Object) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"aggregate_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("venue_id".equals(name)) {
                                    if (value instanceof Integer) {
                                        setVenueId(((Integer) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"venue_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("referee_id".equals(name)) {
                                        if (value instanceof Object) {
                                            setRefereeId(((Object) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"referee_id\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("localteam_id".equals(name)) {
                                            if (value instanceof Integer) {
                                                setLocalteamId(((Integer) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"localteam_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("visitorteam_id".equals(name)) {
                                                if (value instanceof Integer) {
                                                    setVisitorteamId(((Integer) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"visitorteam_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("weather_report".equals(name)) {
                                                    if (value instanceof Object) {
                                                        setWeatherReport(((Object) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"weather_report\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("commentaries".equals(name)) {
                                                        if (value instanceof Boolean) {
                                                            setCommentaries(((Boolean) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"commentaries\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("attendance".equals(name)) {
                                                            if (value instanceof Object) {
                                                                setAttendance(((Object) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"attendance\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("winning_odds_calculated".equals(name)) {
                                                                if (value instanceof Boolean) {
                                                                    setWinningOddsCalculated(((Boolean) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"winning_odds_calculated\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("formations".equals(name)) {
                                                                    if (value instanceof Formations) {
                                                                        setFormations(((Formations) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"formations\" is of type \"com.androidsmile.soccerapp.Formations\", but got "+ value.getClass().toString()));
                                                                    }
                                                                    return true;
                                                                } else {
                                                                    if ("scores".equals(name)) {
                                                                        if (value instanceof Scores) {
                                                                            setScores(((Scores) value));
                                                                        } else {
                                                                            throw new IllegalArgumentException(("property \"scores\" is of type \"com.androidsmile.soccerapp.Scores\", but got "+ value.getClass().toString()));
                                                                        }
                                                                        return true;
                                                                    } else {
                                                                        if ("time".equals(name)) {
                                                                            if (value instanceof Time) {
                                                                                setTime(((Time) value));
                                                                            } else {
                                                                                throw new IllegalArgumentException(("property \"time\" is of type \"com.androidsmile.soccerapp.Time\", but got "+ value.getClass().toString()));
                                                                            }
                                                                            return true;
                                                                        } else {
                                                                            if ("coaches".equals(name)) {
                                                                                if (value instanceof Coaches) {
                                                                                    setCoaches(((Coaches) value));
                                                                                } else {
                                                                                    throw new IllegalArgumentException(("property \"coaches\" is of type \"com.androidsmile.soccerapp.Coaches\", but got "+ value.getClass().toString()));
                                                                                }
                                                                                return true;
                                                                            } else {
                                                                                if ("standings".equals(name)) {
                                                                                    if (value instanceof Standings) {
                                                                                        setStandings(((Standings) value));
                                                                                    } else {
                                                                                        throw new IllegalArgumentException(("property \"standings\" is of type \"com.androidsmile.soccerapp.Standings\", but got "+ value.getClass().toString()));
                                                                                    }
                                                                                    return true;
                                                                                } else {
                                                                                    if ("deleted".equals(name)) {
                                                                                        if (value instanceof Boolean) {
                                                                                            setDeleted(((Boolean) value));
                                                                                        } else {
                                                                                            throw new IllegalArgumentException(("property \"deleted\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                                                                                        }
                                                                                        return true;
                                                                                    } else {
                                                                                        if ("localTeam".equals(name)) {
                                                                                            if (value instanceof LocalTeam) {
                                                                                                setLocalTeam(((LocalTeam) value));
                                                                                            } else {
                                                                                                throw new IllegalArgumentException(("property \"localTeam\" is of type \"com.androidsmile.soccerapp.LocalTeam\", but got "+ value.getClass().toString()));
                                                                                            }
                                                                                            return true;
                                                                                        } else {
                                                                                            if ("visitorTeam".equals(name)) {
                                                                                                if (value instanceof VisitorTeam) {
                                                                                                    setVisitorTeam(((VisitorTeam) value));
                                                                                                } else {
                                                                                                    throw new IllegalArgumentException(("property \"visitorTeam\" is of type \"com.androidsmile.soccerapp.VisitorTeam\", but got "+ value.getClass().toString()));
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
            }
        }
    }

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("id".equals(name)) {
            return getId();
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
                        if ("round_id".equals(name)) {
                            return getRoundId();
                        } else {
                            if ("aggregate_id".equals(name)) {
                                return getAggregateId();
                            } else {
                                if ("venue_id".equals(name)) {
                                    return getVenueId();
                                } else {
                                    if ("referee_id".equals(name)) {
                                        return getRefereeId();
                                    } else {
                                        if ("localteam_id".equals(name)) {
                                            return getLocalteamId();
                                        } else {
                                            if ("visitorteam_id".equals(name)) {
                                                return getVisitorteamId();
                                            } else {
                                                if ("weather_report".equals(name)) {
                                                    return getWeatherReport();
                                                } else {
                                                    if ("commentaries".equals(name)) {
                                                        return getCommentaries();
                                                    } else {
                                                        if ("attendance".equals(name)) {
                                                            return getAttendance();
                                                        } else {
                                                            if ("winning_odds_calculated".equals(name)) {
                                                                return getWinningOddsCalculated();
                                                            } else {
                                                                if ("formations".equals(name)) {
                                                                    return getFormations();
                                                                } else {
                                                                    if ("scores".equals(name)) {
                                                                        return getScores();
                                                                    } else {
                                                                        if ("time".equals(name)) {
                                                                            return getTime();
                                                                        } else {
                                                                            if ("coaches".equals(name)) {
                                                                                return getCoaches();
                                                                            } else {
                                                                                if ("standings".equals(name)) {
                                                                                    return getStandings();
                                                                                } else {
                                                                                    if ("deleted".equals(name)) {
                                                                                        return getDeleted();
                                                                                    } else {
                                                                                        if ("localTeam".equals(name)) {
                                                                                            return getLocalTeam();
                                                                                        } else {
                                                                                            if ("visitorTeam".equals(name)) {
                                                                                                return getVisitorTeam();
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
            }
        }
    }

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, FixtureDatum.NOT_FOUND_VALUE);
        if (FixtureDatum.NOT_FOUND_VALUE!= value) {
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
