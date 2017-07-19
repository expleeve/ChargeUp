package com.expleeve.chargeup.model;

public class Type {
    private Integer id;

    private String typeName;

    private String descEng;

    private String descChn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
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