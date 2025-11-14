package com.dd.ai_medical_triage.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dd.ai_medical_triage.Entity.Patient;
import com.dd.ai_medical_triage.mapper.PatientMapper;
import com.dd.ai_medical_triage.Service.PatientService;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {
}
