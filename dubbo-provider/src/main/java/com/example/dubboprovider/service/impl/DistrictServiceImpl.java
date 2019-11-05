package com.example.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboprovider.mapper.DistrictMapper;
import com.team.dubbo.entity.District;
import com.team.dubbo.entity.DistrictExample;
import com.team.dubbo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Service(interfaceClass = DistrictService.class)
@Component
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> getAll() {
        return districtMapper.selectByExample(new DistrictExample());
    }
}
