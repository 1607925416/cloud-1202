package com.qy105.aaa.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/12/2 15:43
 * @Version     : 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @HystrixCommand
    @RequestMapping("/getAllBook")
    public List<BookInfo> getAllBook(){
        List<BookInfo> allBook = bookService.getAllBook();
        return allBook;
    }
}
