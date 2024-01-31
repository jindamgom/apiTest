package com.jin.app.moive.dto;


/**
 * {"rnum":"1","rank":"1","rankInten":"0","rankOldAndNew":"OLD","movieCd":"20206946","movieNm":"시민덕희","openDt":"2024-01-24","salesAmt":"632767014","salesShare":"41.8","salesInten":"172533092","salesChange":"37.5","salesAcc":"1953960128","audiCnt":"66912","audiInten":"16705","audiChange":"33.3","audiAcc":"208458","scrnCnt":"1166","showCnt":"4885"}
 */

import lombok.Data;
@Data
public class dailyBoxOfficeList {
    private String audiAcc;
    private String audiChange;
    private String audiCnt;
    private String audiInten;
    private String movieCd;
    private String movieNm;
    private String openDt;
    private String rank;
    private String rankInten;
    private String rankOldAndNew;
    private String rnum;
    private String salesAcc;
    private String salesAmt;
    private String salesChange;
    private String salesInten;
    private String salesShare;
    private String scrnCnt;
    private String showCnt;
}