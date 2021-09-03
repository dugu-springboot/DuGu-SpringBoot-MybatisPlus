package me.xueyao.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Simon.Xue
 * @date 2021-09-04 00:36:29
 **/
@Data
public class Student implements Serializable {
    private String id;
    private String creator;
    private String updater;
    private Date createTm;
    private Date updateTm;
    private String no;
    private String name;
    private Integer age;
    private String className;
    private String schoolName;

}
