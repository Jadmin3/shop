package cn.yq.shop.service;

import cn.yq.shop.pojo.AuctionCustomer;
import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.pojo.Auctionrecord;

import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/22 10:41
 * @Version 1.0
 */
public interface AuctionService {
    List<Auctionproduct> selectAllAuctioin(Auctionproduct auction);

    /**
     * 根据id查所有信息
     * @param auctionId
     * @return
     */
    Auctionproduct findAuctionAndRecoredList(Integer auctionId);
    Auctionproduct findAuctionById(Integer auctionid);
    int updateAuction(Auctionproduct auction);

    /**
     * 保存竞拍信息
     * @param record
     */
    void saveAuctionRecord(Auctionrecord record) throws Exception;

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

    /**
     * 插入产品
     * @param auction
     */
    void insertAuction(Auctionproduct auction);

    /**
     * 根据id删除产品记录
     * @param auctionid
     */
    void deleteAuction(Integer auctionid);

}
