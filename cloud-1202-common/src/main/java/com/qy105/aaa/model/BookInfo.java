package com.qy105.aaa.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/21
 * @Version     : 1.0
 */
@Data
public class BookInfo implements Serializable {
    private Integer bookId;
    private String bookName;
    private Integer bookStore;
    private double bookPrice;
}
