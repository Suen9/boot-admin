package com.sun.admin.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员实例对象
 * @author Sun
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_admin")
public class Admin {
    @TableId("admin_id")
    private Integer adminId;
    private String adminName;
    private String adminPwd;

}
