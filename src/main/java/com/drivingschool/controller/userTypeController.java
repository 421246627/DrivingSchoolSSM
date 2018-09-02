package com.drivingschool.controller;

import com.drivingschool.entity.userType;
import com.drivingschool.service.userTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping("find_userTypeByuserTypeIdJson")
    public List<userType> find_userTypeByuserTypeIdJson(String userTypeId) {
        List<userType> usertypes = new ArrayList<userType>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userTypeId", userTypeId);
        usertypes = userypeservice.find_userTypeByuserTypeId(map);
        return usertypes;
    }

    @ResponseBody
    @RequestMapping("find_userTypeByuserTypeIdJsp")
    public ModelAndView find_userTypeByuserTypeIdJsp(String userTypeId) {
        List<userType> usertypes = new ArrayList<userType>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userTypeId", userTypeId);
        usertypes = userypeservice.find_userTypeByuserTypeId(map);
        ModelAndView mode = new ModelAndView();
        mode.addObject("userTypes", usertypes);
        mode.setViewName("index");
        return mode;
    }
}
