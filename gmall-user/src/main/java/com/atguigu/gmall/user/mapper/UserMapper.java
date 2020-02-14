package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Jennyism
 * @date 2020/2/10 0010 23:18
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
