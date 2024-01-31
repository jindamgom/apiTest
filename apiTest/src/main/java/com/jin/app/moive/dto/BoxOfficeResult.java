package com.jin.app.moive.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
/*
* custom class에 특정 필드가 빠질 경우 발생하는 오류 : UnrecognizedPropertyException
* 즉, json key로 존재하는 필드값이 dto에 존재하지 않는 경우..
*
*
*
*
* */

@Data
public class BoxOfficeResult {
    private String boxofficeType;
    private String showRange;
    List<dailyBoxOfficeList> dailyBoxOfficeList;
}
