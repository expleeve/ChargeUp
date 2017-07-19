package com.expleeve.chargeup.model;

public class CoinType {
    private Integer id;

    private String coinName;

    private String descEng;

    private String descChn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName == null ? null : coinName.trim();
    }

    public String getDescEng() {
        return descEng;
    }

    public void setDescEng(String descEng) {
        this.descEng = descEng == null ? null : descEng.trim();
    }

    public String getDescChn() {
        return descChn;
    }

    public void setDescChn(String descChn) {
        this.descChn = descChn == null ? null : descChn.trim();
    }
}