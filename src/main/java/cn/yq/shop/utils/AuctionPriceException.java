package cn.yq.shop.utils;

/**
 * @Author: Jadmin
 * @Date: 2019/4/24 11:18
 * @Version 1.0
 */
public class AuctionPriceException extends Exception {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuctionPriceException(String message) {
        this.message = message;
    }
}
