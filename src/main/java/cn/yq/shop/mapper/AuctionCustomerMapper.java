package cn.yq.shop.mapper;

import cn.yq.shop.pojo.AuctionCustomer;
import cn.yq.shop.pojo.Auctionproduct;

import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/23 11:01
 * @Version 1.0
 */
public interface AuctionCustomerMapper {
    /**
     *  根据id查信息
     * @param auctionId
     * @return 返回整个auctionproduct对象的所有信息
     */
    Auctionproduct findAuctionAndRecoredList(Integer auctionId);

    /**
     * 查询所有拍卖结束的商品
     * @return 返回AuctionProduct的集合
     */
    List<AuctionCustomer> selectAuctionEndTime();

    /**
     * 查询所有正在拍卖的商品
     * @return 返回AuctionProduct的集合
     */
    List<Auctionproduct> selectAuctionNoEndTime();

}
