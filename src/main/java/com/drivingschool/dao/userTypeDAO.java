package com.drivingschool.dao;

import com.drivingschool.entity.userType;

import java.util.List;
import java.util.Map;

public interface userTypeDAO {
    public List<userType> find_userTypeByuserTypeId(Map<String, Object> map);
}
