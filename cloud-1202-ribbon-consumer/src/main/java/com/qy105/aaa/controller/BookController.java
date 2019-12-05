package com.qy105.aaa.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/12/2 14:59
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error",commandProperties =
            {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "15000")})
    @RequestMapping("getAllBook")
    public List<BookInfo> getAllBook(){
        ArrayList forObject = restTemplate.getForObject("http://provider-server/getAllBook", ArrayList.class);
        System.out.println(forObject);
        return forObject;
    }
    public List<BookInfo> error(){
        List<BookInfo> bookInfos = new ArrayList<>();
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("我在人间混日子");
        bookInfo.setBookPrice(1234);
        bookInfo.setBookStore(1234);
        bookInfos.add(bookInfo);
        System.out.println("发生熔断了");
        return bookInfos;
    }
}
