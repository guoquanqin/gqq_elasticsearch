package com.elasticsearch.repository;

import com.elasticsearch.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Description：
 * @Param
 * @Author 郭权钦
 * @Date 23:27
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    public List<Book> findBookByNameLike(String name);
 }
