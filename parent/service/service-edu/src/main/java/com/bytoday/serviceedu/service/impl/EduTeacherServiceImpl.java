package com.bytoday.serviceedu.service.impl;

import com.bytoday.serviceedu.entity.EduTeacher;
import com.bytoday.serviceedu.mapper.EduTeacherMapper;
import com.bytoday.serviceedu.service.EduTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bytoday
 * @since 2020-07-10
 */
@Service
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherMapper, EduTeacher> implements EduTeacherService {
/*    @Autowired
    private EduTeacherMapper eduTeacherMapper;

    public void select(){
        eduTeacherMapper.selectPage();
    }*/

}
