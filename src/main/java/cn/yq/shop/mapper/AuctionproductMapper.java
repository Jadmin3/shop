package cn.yq.shop.mapper;


import java.util.List;

import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.pojo.AuctionproductExample;
import org.apache.ibatis.annotations.Param;

public interface AuctionproductMapper {
    int countByExample(AuctionproductExample example);

    int deleteByExample(AuctionproductExample example);

    int deleteByPrimaryKey(Integer auctionid);

    int insert(Auctionproduct record);

    int insertSelective(Auctionproduct record);

    List<Auctionproduct> selectByExample(AuctionproductExample example);

    Auctionproduct selectByPrimaryKey(Integer auctionid);

    int updateByExampleSelective(@Param("record") Auctionproduct record, @Param("example") AuctionproductExample example);

    int updateByExample(@Param("record") Auctionproduct record, @Param("example") AuctionproductExample example);

    int updateByPrimaryKeySelective(Auctionproduct record);

    int updateByPrimaryKey(Auctionproduct record);
}