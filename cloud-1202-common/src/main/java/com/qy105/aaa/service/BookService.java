package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/21 15:42
 * @Version     : 1.0
 */
public interface BookService {
    /**
     * 查询所有书籍信息
     * @param
     * @return java.util.List<com.aaa.qy105.model.BookInfo>
     * @Author: cat
     * @Date: 2019/11/21
     */
    List<BookInfo> getAllBook();

}
