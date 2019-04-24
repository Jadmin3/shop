package cn.yq.shop.controller;

import cn.yq.shop.pojo.AuctionCustomer;
import cn.yq.shop.pojo.Auctionproduct;
import cn.yq.shop.pojo.Auctionrecord;
import cn.yq.shop.pojo.Auctionuser;
import cn.yq.shop.service.AuctionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @Author: Jadmin
 * @Date: 2019/4/22 10:40
 * @Version 1.0
 */
@Controller
public class AuctionController {
    private static final int PAGE_SIZE = 5;
    @Autowired
    private AuctionService auctionService;

    @RequestMapping("/selectAllAuction")
    public ModelAndView selectAllAuction(@ModelAttribute("condition") Auctionproduct auction,
                                         @RequestParam(value = "pageNum",required = false,defaultValue = "1")
                                                 Integer pageNum) {
        ModelAndView mv = new ModelAndView();
        PageHelper.startPage(pageNum,PAGE_SIZE);
        List<Auctionproduct> auctionproducts = auctionService.selectAllAuctioin(auction);
        PageInfo page = new PageInfo(auctionproducts);
        //上一页
        page.getPrePage();
        //下一页
        page.getNextPage();
        //总记录
        page.getTotal();
        //总页数
        page.getPages();
        mv.addObject("page",page);
        mv.addObject("auctionproducts",auctionproducts);
        mv.setViewName("index");
        return mv;
    }

    /**
     * 根据id查询商品
     * @param auctionid
     * @return
     */
    @RequestMapping("/toAuctionDetial/{auctionid}")
    public ModelAndView toAuctionDetial(@PathVariable Integer auctionid){
        ModelAndView mv = new ModelAndView();
        Auctionproduct auctionDetail  = auctionService.findAuctionAndRecoredList(auctionid);
        mv.addObject("auctionDetail",auctionDetail);
        mv.setViewName("auctionDetail");
        return mv;
    }

    @RequestMapping(value = "/updateAuction/{auctionid}")
    public ModelAndView updateAuction(@PathVariable Integer auctionid){
        Auctionproduct auction = auctionService.findAuctionById(auctionid);
        ModelAndView mv = new ModelAndView();
        mv.addObject("auction",auction);
        mv.setViewName("update");
        return mv;
    }
    @RequestMapping("/doupdate")
    public String doupdate(Auctionproduct auctioin){
        auctionService.updateAuction(auctioin);

        return "redirect:/selectAllAuction";

    }

    /**
     * 删除
     * @param auctionid
     * @return
     */
    @RequestMapping("/deleteAuction/{auctionid}")
    public String deleteAuction(@PathVariable Integer auctionid){

        return "";
    }

    /**
     * 竞拍
     * @param record
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/saveAuctionRecord")
    public String saveAuctionRecord(Auctionrecord record, HttpSession session) throws Exception {

        Auctionuser user = (Auctionuser) session.getAttribute("user");
        record.setUserid(user.getUserid());
        record.setAuctiontime(new Date());
        this.auctionService.saveAuctionRecord(record);

        return "redirect:/toAuctionDetial/"+record.getAuctionid();
    }

    @RequestMapping(value = "/toAuctionResult")
    public ModelAndView toAuctionResult(){
        ModelAndView mv = new ModelAndView();
        List<AuctionCustomer> endtimeList  = auctionService.selectAuctionEndTime();
        List<Auctionproduct> noendTimeList  = auctionService.selectAuctionNoEndTime();

        mv.addObject("endtimeList",endtimeList);
        mv.addObject("noendtimeList",noendTimeList);
        mv.setViewName("auctionResult");
        return mv;
    }


}
