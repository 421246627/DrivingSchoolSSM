package com.drivingschool.service;

import com.drivingschool.entity.userType;

import java.util.List;
import java.util.Map;

public interface userTypeService {
    public List<userType> find_userTypeByuserTypeId(Map<String, Object> map);
}
