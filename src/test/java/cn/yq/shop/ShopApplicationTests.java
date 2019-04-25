package cn.yq.shop;

import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.service.AuctionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopApplicationTests {

    @Autowired
    private AuctionService auctionService;
    @Test
    public void contextLoads() {
        auctionService.deleteAuction(25);
    }

}
