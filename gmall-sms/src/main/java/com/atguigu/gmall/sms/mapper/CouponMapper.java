package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2022-08-24 19:16:23
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
