package com.drivingschool.controller;

import com.drivingschool.entity.userType;
import com.drivingschool.service.userTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/userTypeController")
public class userTypeController {
    @Autowired
    userTypeService userypeservice;

    @ResponseBody
    @RequestMapping("find_userTypeByuserTypeId")
    public List<userType> find_userTypeByuserTypeId(String userTypeId) {
        List<userType> usertypes = new ArrayList<userType>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userTypeId", userTypeId);
        usertypes = userypeservice.find_userTypeByuserTypeId(map);
        return usertypes;
    }
}
