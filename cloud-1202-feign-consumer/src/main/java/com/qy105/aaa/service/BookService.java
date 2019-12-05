package com.qy105.aaa.service;

import com.qy105.aaa.model.BookInfo;
import com.qy105.aaa.service.impl.BookServiceHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description :  
 * @Author      : cat
 * @exception   : 
 * @CreateDate  : 2019/12/2 15:40
 * @Version     : 1.0
 */
@FeignClient(value = "provider-server",fallback = BookServiceHystrixImpl.class)
public interface BookService {
   /** 
   * 获取所有书籍  
   * @param 
   * @return java.util.List<com.qy105.aaa.model.BookInfo> 
   * @Author: cat
   * @Date: 2019/12/5 
   */
    @RequestMapping(value = "/getAllBook")
    List<BookInfo> getAllBook();
}
