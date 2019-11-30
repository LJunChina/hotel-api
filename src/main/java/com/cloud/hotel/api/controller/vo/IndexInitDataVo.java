/**
  * Copyright 2019 bejson.com 
  */
package com.cloud.hotel.api.controller.vo;
import java.util.List;

/**
 * Auto-generated: 2019-11-30 16:3:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class IndexInitDataVo {

    private List<EvalList> evalList;
    private String lineTime;
    private String address;
    private List<String> imgUrls;
    private boolean indicatorDots;
    private boolean autoplay;
    private int interval;
    private int duration;
    private List<HouseList> houseList;
    private List<SingleHouse> singleHouse;
    public void setEvalList(List<EvalList> evalList) {
         this.evalList = evalList;
     }
     public List<EvalList> getEvalList() {
         return evalList;
     }

    public void setLineTime(String lineTime) {
         this.lineTime = lineTime;
     }
     public String getLineTime() {
         return lineTime;
     }

    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setImgUrls(List<String> imgUrls) {
         this.imgUrls = imgUrls;
     }
     public List<String> getImgUrls() {
         return imgUrls;
     }

    public void setIndicatorDots(boolean indicatorDots) {
         this.indicatorDots = indicatorDots;
     }
     public boolean getIndicatorDots() {
         return indicatorDots;
     }

    public void setAutoplay(boolean autoplay) {
         this.autoplay = autoplay;
     }
     public boolean getAutoplay() {
         return autoplay;
     }

    public void setInterval(int interval) {
         this.interval = interval;
     }
     public int getInterval() {
         return interval;
     }

    public void setDuration(int duration) {
         this.duration = duration;
     }
     public int getDuration() {
         return duration;
     }

    public void setHouseList(List<HouseList> houseList) {
         this.houseList = houseList;
     }
     public List<HouseList> getHouseList() {
         return houseList;
     }

    public void setSingleHouse(List<SingleHouse> singleHouse) {
         this.singleHouse = singleHouse;
     }
     public List<SingleHouse> getSingleHouse() {
         return singleHouse;
     }

}