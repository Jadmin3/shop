package cn.yq.shop.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Auctionproduct {
    private Integer auctionid;

    private String auctionname;

    private BigDecimal auctionstartprice;

    private BigDecimal auctionupset;

    private Date auctionstarttime;

    private Date auctionendtime;

    private String auctionpic;

    private String auctionpictype;

    private String auctiondesc;

    public List<Auctionrecord> getAuctionRecoreList() {
        return auctionRecoreList;
    }

    public void setAuctionRecoreList(List<Auctionrecord> auctionRecoreList) {
        this.auctionRecoreList = auctionRecoreList;
    }

    //一对多
    private List<Auctionrecord> auctionRecoreList;




    public Integer getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public String getAuctionname() {
        return auctionname;
    }

    public void setAuctionname(String auctionname) {
        this.auctionname = auctionname == null ? null : auctionname.trim();
    }

    public BigDecimal getAuctionstartprice() {
        return auctionstartprice;
    }

    public void setAuctionstartprice(BigDecimal auctionstartprice) {
        this.auctionstartprice = auctionstartprice;
    }

    public BigDecimal getAuctionupset() {
        return auctionupset;
    }

    public void setAuctionupset(BigDecimal auctionupset) {
        this.auctionupset = auctionupset;
    }

    public Date getAuctionstarttime() {
        return auctionstarttime;
    }

    public void setAuctionstarttime(Date auctionstarttime) {
        this.auctionstarttime = auctionstarttime;
    }

    public Date getAuctionendtime() {
        return auctionendtime;
    }

    public void setAuctionendtime(Date auctionendtime) {
        this.auctionendtime = auctionendtime;
    }

    public String getAuctionpic() {
        return auctionpic;
    }

    public void setAuctionpic(String auctionpic) {
        this.auctionpic = auctionpic == null ? null : auctionpic.trim();
    }

    public String getAuctionpictype() {
        return auctionpictype;
    }

    public void setAuctionpictype(String auctionpictype) {
        this.auctionpictype = auctionpictype == null ? null : auctionpictype.trim();
    }

    public String getAuctiondesc() {
        return auctiondesc;
    }

    public void setAuctiondesc(String auctiondesc) {
        this.auctiondesc = auctiondesc == null ? null : auctiondesc.trim();
    }


    @Override
    public String toString() {
        return "Auctionproduct{" +
                "auctionid=" + auctionid +
                ", auctionname='" + auctionname + '\'' +
                ", auctionstartprice=" + auctionstartprice +
                ", auctionupset=" + auctionupset +
                ", auctionstarttime=" + auctionstarttime +
                ", auctionendtime=" + auctionendtime +
                ", auctionpic='" + auctionpic + '\'' +
                ", auctionpictype='" + auctionpictype + '\'' +
                ", auctiondesc='" + auctiondesc + '\'' +
                ", auctionRecoreList=" + auctionRecoreList +
                '}';
    }
}