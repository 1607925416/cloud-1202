package com.qy105.aaa.mapper;

import com.qy105.aaa.model.BookInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/12/2 14:40
 * @Version     : 1.0
 */
@Mapper
public interface BookMapper {
    /**
     * 查询所有书籍信息
     * @param
     * @return java.util.List<com.aaa.qy105.model.BookInfo>
     * @Author: cat
     * @Date: 2019/11/21
     */
    @Select("select * from book_info")
    List<BookInfo> getAllBook();
}
