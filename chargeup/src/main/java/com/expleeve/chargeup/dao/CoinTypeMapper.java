package com.expleeve.chargeup.dao;

import com.expleeve.chargeup.model.CoinType;
import com.expleeve.chargeup.model.CoinTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinTypeMapper {
    int countByExample(CoinTypeExample example);

    int deleteByExample(CoinTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinType record);

    int insertSelective(CoinType record);

    List<CoinType> selectByExample(CoinTypeExample example);

    CoinType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinType record, @Param("example") CoinTypeExample example);

    int updateByExample(@Param("record") CoinType record, @Param("example") CoinTypeExample example);

    int updateByPrimaryKeySelective(CoinType record);

    int updateByPrimaryKey(CoinType record);
}