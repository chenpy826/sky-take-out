package com.sky.service;

import com.sky.dto.SetmealDTO;
import org.springframework.stereotype.Service;

@Service
public interface SetmealService {


    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDTO setmealDto);
}
