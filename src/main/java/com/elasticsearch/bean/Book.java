package com.elasticsearch.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Description：
 * @Param
 * @Author 郭权钦
 * @Date 22:55
 */
@Document(indexName = "gqq")   //注册索引
public class Book {

    private Integer id;
    private String name;
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


