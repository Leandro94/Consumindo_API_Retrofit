
package com.androidsmile.soccerapp.model.fixtures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LocalTeamData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("legacy_id")
    @Expose
    private Integer legacyId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("twitter")
    @Expose
    private Object twitter;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("national_team")
    @Expose
    private Boolean nationalTeam;
    @SerializedName("founded")
    @Expose
    private Integer founded;
    @SerializedName("logo_path")
    @Expose
    private String logoPath;
    @SerializedName("venue_id")
    @Expose
    private Integer venueId;
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
     *     The legacyId
     */
    public Integer getLegacyId() {
        return legacyId;
    }

    /**
     * 
     * @param legacyId
     *     The legacy_id
     */
    public void setLegacyId(Integer legacyId) {
        this.legacyId = legacyId;
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
     *     The twitter
     */
    public Object getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     The twitter
     */
    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    /**
     * 
     * @return
     *     The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId
     *     The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return
     *     The nationalTeam
     */
    public Boolean getNationalTeam() {
        return nationalTeam;
    }

    /**
     * 
     * @param nationalTeam
     *     The national_team
     */
    public void setNationalTeam(Boolean nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    /**
     * 
     * @return
     *     The founded
     */
    public Integer getFounded() {
        return founded;
    }

    /**
     * 
     * @param founded
     *     The founded
     */
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    /**
     * 
     * @return
     *     The logoPath
     */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * 
     * @param logoPath
     *     The logo_path
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
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

    protected boolean declaredProperty(String name, Object value) {
        if ("id".equals(name)) {
            if (value instanceof Integer) {
                setId(((Integer) value));
            } else {
                throw new IllegalArgumentException(("property \"id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
            }
            return true;
        } else {
            if ("legacy_id".equals(name)) {
                if (value instanceof Integer) {
                    setLegacyId(((Integer) value));
                } else {
                    throw new IllegalArgumentException(("property \"legacy_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
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
                    if ("twitter".equals(name)) {
                        if (value instanceof Object) {
                            setTwitter(((Object) value));
                        } else {
                            throw new IllegalArgumentException(("property \"twitter\" is of type \"java.lang.Object\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("country_id".equals(name)) {
                            if (value instanceof Integer) {
                                setCountryId(((Integer) value));
                            } else {
                                throw new IllegalArgumentException(("property \"country_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("national_team".equals(name)) {
                                if (value instanceof Boolean) {
                                    setNationalTeam(((Boolean) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"national_team\" is of type \"java.lang.Boolean\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("founded".equals(name)) {
                                    if (value instanceof Integer) {
                                        setFounded(((Integer) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"founded\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("logo_path".equals(name)) {
                                        if (value instanceof String) {
                                            setLogoPath(((String) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"logo_path\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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
            if ("legacy_id".equals(name)) {
                return getLegacyId();
            } else {
                if ("name".equals(name)) {
                    return getName();
                } else {
                    if ("twitter".equals(name)) {
                        return getTwitter();
                    } else {
                        if ("country_id".equals(name)) {
                            return getCountryId();
                        } else {
                            if ("national_team".equals(name)) {
                                return getNationalTeam();
                            } else {
                                if ("founded".equals(name)) {
                                    return getFounded();
                                } else {
                                    if ("logo_path".equals(name)) {
                                        return getLogoPath();
                                    } else {
                                        if ("venue_id".equals(name)) {
                                            return getVenueId();
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
        Object value = declaredPropertyOrNotFound(name, LocalTeamData.NOT_FOUND_VALUE);
        if (LocalTeamData.NOT_FOUND_VALUE!= value) {
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
