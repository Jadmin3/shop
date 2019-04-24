package cn.yq.shop.service;

import cn.yq.shop.pojo.Auctionuser;
import cn.yq.shop.pojo.AuctionuserExample;

import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/19 15:59
 * @Version 1.0
 */
public interface UserService {
    List<Auctionuser> doLogin(String username,String userpassword);

    void registerUser(Auctionuser user);
}
