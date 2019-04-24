package cn.yq.shop.service.impl;

import cn.yq.shop.mapper.AuctionproductMapper;
import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.pojo.AuctionproductExample;
import cn.yq.shop.service.ProdectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/19 15:53
 * @Version 1.0
 */
@Service
public class ProdectServiceImp implements ProdectService {
    @Autowired
    private AuctionproductMapper auctionproductMapper;


    @Override
    public int countByExample(AuctionproductExample example) {
        return auctionproductMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuctionproductExample example) {
        return auctionproductMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer auctionid) {
        return auctionproductMapper.deleteByPrimaryKey(auctionid);
    }

    @Override
    public int insert(Auctionproduct record) {
        return auctionproductMapper.insert(record);
    }

    @Override
    public int insertSelective(Auctionproduct record) {
        return auctionproductMapper.insertSelective(record);
    }

    @Override
    public List<Auctionproduct> selectByExample(AuctionproductExample example) {
        return auctionproductMapper.selectByExample(example);
    }

    @Override
    public Auctionproduct selectByPrimaryKey(Integer auctionid) {
        return auctionproductMapper.selectByPrimaryKey(auctionid);
    }

    @Override
    public int updateByExampleSelective(Auctionproduct record, AuctionproductExample example) {
        return auctionproductMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Auctionproduct record, AuctionproductExample example) {
        return auctionproductMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Auctionproduct record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Auctionproduct record) {
        return updateByPrimaryKeySelective(record);
    }
}
