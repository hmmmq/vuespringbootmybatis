package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author lintianqi
 * @since 2024-09-07
 */
@Getter
@Setter
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "commentId", type = IdType.AUTO)
    private Integer commentId;

    private String name;

    private String sex;

    private Integer age;

    private String contact;

    private String job;

    private String comment;
}
