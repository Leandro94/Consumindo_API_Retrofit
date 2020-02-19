
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scores {

    @SerializedName("localteam_score")
    @Expose
    private Integer localteamScore;
    @SerializedName("visitorteam_score")
    @Expose
    private Integer visitorteamScore;
    @SerializedName("localteam_pen_score")
    @Expose
    private Integer localteamPenScore;
    @SerializedName("visitorteam_pen_score")
    @Expose
    private Integer visitorteamPenScore;
    @SerializedName("ht_score")
    @Expose
    private String htScore;
    @SerializedName("ft_score")
    @Expose
    private Object ftScore;
    @SerializedName("et_score")
    @Expose
    private Object etScore;
    protected final static Object NOT_FOUND_VALUE = new Object();

    /**
     * 
     * @return
     *     The localteamScore
     */
    public Integer getLocalteamScore() {
        return localteamScore;
    }

    /**
     * 
     * @param localteamScore
     *     The localteam_score
     */
    public void setLocalteamScore(Integer localteamScore) {
        this.localteamScore = localteamScore;
    }

    /**
     * 
     * @return
     *     The visitorteamScore
     */
    public Integer getVisitorteamScore() {
        return visitorteamScore;
    }

    /**
     * 
     * @param visitorteamScore
     *     The visitorteam_score
     */
    public void setVisitorteamScore(Integer visitorteamScore) {
        this.visitorteamScore = visitorteamScore;
    }

    /**
     * 
     * @return
     *     The localteamPenScore
     */
    public Integer getLocalteamPenScore() {
        return localteamPenScore;
    }

    /**
     * 
     * @param localteamPenScore
     *     The localteam_pen_score
     */
    public void setLocalteamPenScore(Integer localteamPenScore) {
        this.localteamPenScore = localteamPenScore;
    }

    /**
     * 
     * @return
     *     The visitorteamPenScore
     */
    public Integer getVisitorteamPenScore() {
        return visitorteamPenScore;
    }

    /**
     * 
     * @param visitorteamPenScore
     *     The visitorteam_pen_score
     */
    public void setVisitorteamPenScore(Integer visitorteamPenScore) {
        this.visitorteamPenScore = visitorteamPenScore;
    }

    /**
     * 
     * @return
     *     The htScore
     */
    public String getHtScore() {
        return htScore;
    }

    /**
     * 
     * @param htScore
     *     The ht_score
     */
    public void setHtScore(String htScore) {
        this.htScore = htScore;
    }

    /**
     * 
     * @return
     *     The ftScore
     */
    public Object getFtScore() {
        return ftScore;
    }

    /**
     * 
     * @param ftScore
     *     The ft_score
     */
    public void setFtScore(Object ftScore) {
        this.ftScore = ftScore;
    }

    /**
     * 
     * @return
     *     The etScore
     */
    public Object getEtScore() {
        return etScore;
    }

    /**
     * 
     * @param etScore
     *     The et_score
     */
    public void setEtScore(Object etScore) {
        this.etScore = etScore;
    }

    protected boolean declaredProperty(String name, Object value) {
        if ("localteam_score".equals(name)) {
            if (value instanceof Integer) {
                setLocalteamScore(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"localteam_score\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("visitorteam_score".equals(name)) {
                if (value instanceof Integer) {
                    setVisitorteamScore(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"visitorteam_score\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                }
                return true;
            } else {
                if ("localteam_pen_score".equals(name)) {
                    if (value instanceof Integer) {
                        setLocalteamPenScore(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"localteam_pen_score\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("visitorteam_pen_score".equals(name)) {
                        if (value instanceof Integer) {
                            setVisitorteamPenScore(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"visitorteam_pen_score\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("ht_score".equals(name)) {
                            if (value instanceof String) {
                                setHtScore(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"ht_score\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("ft_score".equals(name)) {
                                if (value instanceof Object) {
                                    setFtScore(((Object) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"ft_score\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("et_score".equals(name)) {
                                    if (value instanceof Object) {
                                        setEtScore(((Object) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"et_score\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
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

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("localteam_score".equals(name)) {
            return getLocalteamScore();
        } else {
            if ("visitorteam_score".equals(name)) {
                return getVisitorteamScore();
            } else {
                if ("localteam_pen_score".equals(name)) {
                    return getLocalteamPenScore();
                } else {
                    if ("visitorteam_pen_score".equals(name)) {
                        return getVisitorteamPenScore();
                    } else {
                        if ("ht_score".equals(name)) {
                            return getHtScore();
                        } else {
                            if ("ft_score".equals(name)) {
                                return getFtScore();
                            } else {
                                if ("et_score".equals(name)) {
                                    return getEtScore();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, Scores.NOT_FOUND_VALUE);
        if (Scores.NOT_FOUND_VALUE!= value) {
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
