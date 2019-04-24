package cn.yq.shop.pojo;
/**
 * 此类为AuctionProduct的拓展类
 */


/**
 * @Author: Jadmin
 * @Date: 2019/4/24 15:26
 * @Version 1.0
 */
public class AuctionCustomer extends  Auctionproduct{
    private String auctionprice;
    private String username;

    public String getAuctionprice() {
        return auctionprice;
    }

    public void setAuctionprice(String auctionprice) {
        this.auctionprice = auctionprice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
