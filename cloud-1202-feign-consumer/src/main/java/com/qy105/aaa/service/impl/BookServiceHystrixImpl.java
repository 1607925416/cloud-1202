package com.qy105.aaa.service.impl;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/12/3 14:30
 * @Version     : 1.0
 */
@Service
public class BookServiceHystrixImpl implements BookService {

    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("发生熔断了");
        return null;
    }
}
