package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CategoryBrandEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2022-08-20 15:38:05
 */
public interface CategoryBrandService extends IService<CategoryBrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

