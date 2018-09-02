package com.drivingschool.service.impl;

import com.drivingschool.dao.userTypeDAO;
import com.drivingschool.entity.userType;
import com.drivingschool.service.userTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class userTypeServiceImpl implements userTypeService {
    @Autowired
    userTypeDAO usertypedao;

    @Override
    public List<userType> find_userTypeByuserTypeId(Map<String, Object> map) {
        return usertypedao.find_userTypeByuserTypeId(map);
    }
}
