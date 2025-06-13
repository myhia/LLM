package org.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.entity.Appointment;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
