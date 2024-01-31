package com.jin.app.moive.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jin.app.moive.dto.BoxOfficeResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

/**
 * 0130
 * 외부 서비스(api)에 데이터 요청
 * api1 = 영화진흥위원회
 * api2 = kmdb
 * 
 * 필요한 것 
 * 1.요청 url 주소
 * 2.발급받은 본인 서비스키
 * 
 * application.yml 참조할 것
 */
@Service
public class MovieService {

    @Value("${public-data.base-url1}")
    String BASE_URL1;

    @Value("${public-data.service-key1}")
    String SERVICE_KEY1;

    /**
     * 요청 url 형식 예시
     * http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml? //주소
     * key=90bc8a33f4d1b7cd06b1fbb20b7edd54 //서비스키
     * &targetDt=20240129 //날짜(금일은 불가 이전날짜들만 가능)
     */
    public ResponseEntity<?> json(String targetDt) {
        ObjectMapper objectMapper = new ObjectMapper();
        try
        {
            String url = BASE_URL1+"?key="+SERVICE_KEY1+"&targetDt="+targetDt;
            System.out.println("url::::"+url);
            return ResponseEntity.ok(new ObjectMapper().readValue(new URL(url), BoxOfficeResult.class));
        }
        catch(IOException e)
        {
            throw  new RuntimeException(e);
        }
    }
}
