package com.wyf.blog.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @program: Blog
 * @author: fei
 * @description:
 * @create: 2019-08-23 21:10
 */

@Data
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String gender;

    private String realName;

    private String birthday;

    private String email;

    private String personalBrief;

    private String avatarImgUrl;

    private String recentlyLanded;
}
