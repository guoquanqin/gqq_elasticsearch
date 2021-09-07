package com.elasticsearch.service;

import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Param
 * @Author 郭权钦
 * @Date 20:49
 */
@Service
public class AsycService {


    public void asyc() {

        try {
            Thread.sleep(3000);
            System.out.println("hello fuck");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
