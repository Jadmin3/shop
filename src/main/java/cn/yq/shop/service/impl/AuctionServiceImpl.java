package cn.yq.shop.service.impl;

import cn.yq.shop.mapper.AuctionCustomerMapper;
import cn.yq.shop.mapper.AuctionproductMapper;
import cn.yq.shop.mapper.AuctionrecordMapper;
import cn.yq.shop.pojo.AuctionCustomer;
import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.pojo.AuctionproductExample;
import cn.yq.shop.pojo.Auctionrecord;
import cn.yq.shop.service.AuctionService;
import cn.yq.shop.utils.AuctionPriceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/22 10:43
 * @Version 1.0
 */
@Service
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    private AuctionproductMapper auctionproductMapper;
    @Autowired
    private AuctionCustomerMapper auctionCustomerMapper;
    @Autowired
    private AuctionrecordMapper auctionrecordMapper;

    @Override
    public List<Auctionproduct> selectAllAuctioin(Auctionproduct auction) {


        AuctionproductExample example = new AuctionproductExample();
        AuctionproductExample.Criteria criteria = example.createCriteria();
        //判断部位空才进来
        if (auction != null) {
            //判断商品名称不为空
            if (auction.getAuctionname() != null && !"".equals(auction.getAuctionname())) {
                criteria.andAuctionnameLike("%" + auction.getAuctionname() + "%");
            }
            if (auction.getAuctiondesc() != null && !"".equals(auction.getAuctiondesc())) {
                criteria.andAuctiondescLike("%" + auction.getAuctiondesc() + "%");
            }
            if (auction.getAuctionstarttime() != null && !"".equals(auction.getAuctionstarttime())) {
                criteria.andAuctionstarttimeGreaterThan(auction.getAuctionstarttime());
            }
            // 小于结束时间
            if (auction.getAuctionendtime() != null) {
                criteria.andAuctionendtimeLessThan(auction.getAuctionendtime());
            }

            // 起拍价
            if (auction.getAuctionstartprice() != null) {
                criteria.andAuctionstartpriceGreaterThan(auction.getAuctionstartprice());
            }
            example.setOrderByClause("auctionstarttime desc");

        }

        List<Auctionproduct> list = this.auctionproductMapper.selectByExample(example);

        return list;
    }

    @Override
    public Auctionproduct findAuctionAndRecoredList(Integer auctionId) {
        return auctionCustomerMapper.findAuctionAndRecoredList(auctionId);
    }

    @Override
    public Auctionproduct findAuctionById(Integer auctionid) {
        return auctionproductMapper.selectByPrimaryKey(auctionid);
    }

    @Override
    public int updateAuction(Auctionproduct auction) {
        return auctionproductMapper.updateByPrimaryKeySelective(auction);
    }

    @Override
    public void saveAuctionRecord(Auctionrecord record) throws Exception{
        //通过id取出所有信息
        Auctionproduct auction = auctionCustomerMapper.findAuctionAndRecoredList(record.getAuctionid());
        //判断时间
        if (auction.getAuctionendtime().after(new Date())==false){
            throw new AuctionPriceException("拍卖时间已结束！");
        }
        //是否有竞价记录
        if (auction.getAuctionRecoreList().size()>0){
            Auctionrecord maxRecord = auction.getAuctionRecoreList().get(0);
            if(record.getAuctionprice().compareTo(maxRecord.getAuctionprice())<1){
                throw new AuctionPriceException("价格必须高于所有竞价的最高价!!");
            }
        }else{
            if (record.getAuctionprice().compareTo(auction.getAuctionstartprice())<1){
                throw new AuctionPriceException("价格必须高于起拍价!");
            }
        }

        this.auctionrecordMapper.insert(record);

    }

    /**
     * 查询所有拍卖结束的商品
     *
     * @return 返回AuctionProduct的集合
     */
    @Override
    public List<AuctionCustomer> selectAuctionEndTime() {

        return auctionCustomerMapper.selectAuctionEndTime();
    }

    /**
     * 查询所有正在拍卖的商品
     *
     * @return 返回AuctionProduct的集合
     */
    @Override
    public List<Auctionproduct> selectAuctionNoEndTime() {
        return auctionCustomerMapper.selectAuctionNoEndTime();
    }


}
