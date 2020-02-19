
package com.androidsmile.soccerapp.model.topscorers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerData {

    @SerializedName("player_id")
    @Expose
    private Integer playerId;
    @SerializedName("team_id")
    @Expose
    private Integer teamId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("position_id")
    @Expose
    private Integer positionId;
    @SerializedName("common_name")
    @Expose
    private String commonName;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("birthdate")
    @Expose
    private String birthdate;
    @SerializedName("birthcountry")
    @Expose
    private String birthcountry;
    @SerializedName("birthplace")
    @Expose
    private String birthplace;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("image_path")
    @Expose
    private String imagePath;
    protected final static Object NOT_FOUND_VALUE = new Object();

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
     *     The positionId
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * 
     * @param positionId
     *     The position_id
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * 
     * @return
     *     The commonName
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * 
     * @param commonName
     *     The common_name
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * 
     * @return
     *     The fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 
     * @param fullname
     *     The fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 
     * @return
     *     The firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @param firstname
     *     The firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return
     *     The lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * @param lastname
     *     The lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return
     *     The nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 
     * @param nationality
     *     The nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 
     * @return
     *     The birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * 
     * @param birthdate
     *     The birthdate
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * 
     * @return
     *     The birthcountry
     */
    public String getBirthcountry() {
        return birthcountry;
    }

    /**
     * 
     * @param birthcountry
     *     The birthcountry
     */
    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    /**
     * 
     * @return
     *     The birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * 
     * @param birthplace
     *     The birthplace
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 
     * @param imagePath
     *     The image_path
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    protected boolean declaredProperty(String name, Object value) {
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
                if ("country_id".equals(name)) {
                    if (value instanceof Integer) {
                        setCountryId(((Integer) value));
                    } else {
                        throw new IllegalArgumentException(("property \"country_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                    }
                    return true;
                } else {
                    if ("position_id".equals(name)) {
                        if (value instanceof Integer) {
                            setPositionId(((Integer) value));
                        } else {
                            throw new IllegalArgumentException(("property \"position_id\" is of type \"java.lang.Integer\", but got "+ value.getClass().toString()));
                        }
                        return true;
                    } else {
                        if ("common_name".equals(name)) {
                            if (value instanceof String) {
                                setCommonName(((String) value));
                            } else {
                                throw new IllegalArgumentException(("property \"common_name\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                            }
                            return true;
                        } else {
                            if ("fullname".equals(name)) {
                                if (value instanceof String) {
                                    setFullname(((String) value));
                                } else {
                                    throw new IllegalArgumentException(("property \"fullname\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                }
                                return true;
                            } else {
                                if ("firstname".equals(name)) {
                                    if (value instanceof String) {
                                        setFirstname(((String) value));
                                    } else {
                                        throw new IllegalArgumentException(("property \"firstname\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                    }
                                    return true;
                                } else {
                                    if ("lastname".equals(name)) {
                                        if (value instanceof String) {
                                            setLastname(((String) value));
                                        } else {
                                            throw new IllegalArgumentException(("property \"lastname\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                        }
                                        return true;
                                    } else {
                                        if ("nationality".equals(name)) {
                                            if (value instanceof String) {
                                                setNationality(((String) value));
                                            } else {
                                                throw new IllegalArgumentException(("property \"nationality\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                            }
                                            return true;
                                        } else {
                                            if ("birthdate".equals(name)) {
                                                if (value instanceof String) {
                                                    setBirthdate(((String) value));
                                                } else {
                                                    throw new IllegalArgumentException(("property \"birthdate\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                }
                                                return true;
                                            } else {
                                                if ("birthcountry".equals(name)) {
                                                    if (value instanceof String) {
                                                        setBirthcountry(((String) value));
                                                    } else {
                                                        throw new IllegalArgumentException(("property \"birthcountry\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                    }
                                                    return true;
                                                } else {
                                                    if ("birthplace".equals(name)) {
                                                        if (value instanceof String) {
                                                            setBirthplace(((String) value));
                                                        } else {
                                                            throw new IllegalArgumentException(("property \"birthplace\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                        }
                                                        return true;
                                                    } else {
                                                        if ("height".equals(name)) {
                                                            if (value instanceof String) {
                                                                setHeight(((String) value));
                                                            } else {
                                                                throw new IllegalArgumentException(("property \"height\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                            }
                                                            return true;
                                                        } else {
                                                            if ("weight".equals(name)) {
                                                                if (value instanceof String) {
                                                                    setWeight(((String) value));
                                                                } else {
                                                                    throw new IllegalArgumentException(("property \"weight\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
                                                                }
                                                                return true;
                                                            } else {
                                                                if ("image_path".equals(name)) {
                                                                    if (value instanceof String) {
                                                                        setImagePath(((String) value));
                                                                    } else {
                                                                        throw new IllegalArgumentException(("property \"image_path\" is of type \"java.lang.String\", but got "+ value.getClass().toString()));
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

    protected Object declaredPropertyOrNotFound(String name, Object notFoundValue) {
        if ("player_id".equals(name)) {
            return getPlayerId();
        } else {
            if ("team_id".equals(name)) {
                return getTeamId();
            } else {
                if ("country_id".equals(name)) {
                    return getCountryId();
                } else {
                    if ("position_id".equals(name)) {
                        return getPositionId();
                    } else {
                        if ("common_name".equals(name)) {
                            return getCommonName();
                        } else {
                            if ("fullname".equals(name)) {
                                return getFullname();
                            } else {
                                if ("firstname".equals(name)) {
                                    return getFirstname();
                                } else {
                                    if ("lastname".equals(name)) {
                                        return getLastname();
                                    } else {
                                        if ("nationality".equals(name)) {
                                            return getNationality();
                                        } else {
                                            if ("birthdate".equals(name)) {
                                                return getBirthdate();
                                            } else {
                                                if ("birthcountry".equals(name)) {
                                                    return getBirthcountry();
                                                } else {
                                                    if ("birthplace".equals(name)) {
                                                        return getBirthplace();
                                                    } else {
                                                        if ("height".equals(name)) {
                                                            return getHeight();
                                                        } else {
                                                            if ("weight".equals(name)) {
                                                                return getWeight();
                                                            } else {
                                                                if ("image_path".equals(name)) {
                                                                    return getImagePath();
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

    @SuppressWarnings({
        "unchecked"
    })
    public<T >T get(String name) {
        Object value = declaredPropertyOrNotFound(name, PlayerData.NOT_FOUND_VALUE);
        if (PlayerData.NOT_FOUND_VALUE!= value) {
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
