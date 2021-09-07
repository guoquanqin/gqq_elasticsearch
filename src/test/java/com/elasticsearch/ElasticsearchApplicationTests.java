package com.elasticsearch;

import com.elasticsearch.bean.Book;
import com.elasticsearch.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

    @Autowired
    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
        //保存一个文档
        Book book=new Book();
        book.setId(1);
        book.setName("郭权钦");
        book.setData("2019-08-16");

        //构建一个索引功能
        Index index = new Index.Builder(book).index("gqq").type("book").build();

        try {
            //执行
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void search(){
        //查询表达式
        String json = "\"query\" : {\n" +
                "        \"match_phrase\" : {\n" +
                "            \"name\" : \"郭权钦\"\n" +
                "        }\n" +
                "    },";
       // 构建搜索功能
        Search search = new Search.Builder(json).addIndex("gqq").addType("book").build();

        //执行
        try {
            SearchResult execute = jestClient.execute(search);
            System.out.println(execute);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test02(){
        //保存一个文档
        Book book=new Book();
        book.setId(1);
        book.setName("郭权钦");
        book.setData("2019-08-16");
        bookRepository.index(book);
    }

}
