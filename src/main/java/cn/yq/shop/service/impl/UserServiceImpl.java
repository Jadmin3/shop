package cn.yq.shop.service.impl;

import cn.yq.shop.mapper.AuctionuserMapper;
import cn.yq.shop.pojo.AuctionproductExample;
import cn.yq.shop.pojo.Auctionuser;
import cn.yq.shop.pojo.AuctionuserExample;
import cn.yq.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/19 17:26
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     *  注入userMapper
     */
    @Autowired
    private AuctionuserMapper auctionuserMapper;

    @Override
    public List<Auctionuser> doLogin(String username, String userpassword) {
        AuctionuserExample example = new AuctionuserExample();
        AuctionuserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andUserpasswordEqualTo(userpassword);
        List<Auctionuser> list = auctionuserMapper.selectByExample(example);
        return list;
    }

    @Override
    public void registerUser(Auctionuser user) {
        auctionuserMapper.insertSelective(user);
    }
}
