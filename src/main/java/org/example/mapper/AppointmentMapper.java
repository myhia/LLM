package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Appointment;
@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}
