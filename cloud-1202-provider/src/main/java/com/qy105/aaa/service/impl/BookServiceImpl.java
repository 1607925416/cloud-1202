package com.qy105.aaa.service.impl;

import com.qy105.aaa.mapper.BookMapper;
import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   : 
 * @CreateDate  : 2019/12/2 14:39
 * @Version     : 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {
        List<BookInfo> allBook = bookMapper.getAllBook();
        return allBook;
    }
}
