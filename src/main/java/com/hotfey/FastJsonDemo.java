package com.hotfey;

import com.alibaba.fastjson.JSONObject;
import com.hotfey.pojo.Staff;

/**
 * Created by pipe on 2016/11/7.
 */
public class FastJsonDemo {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setAddress("abc_address");
        staff.setcTime("abc_cTime");
        staff.setLgTime("abc_lgTime");

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(staff);
        System.out.println(jsonObject.toString());

        staff = JSONObject.parseObject(jsonObject.toString(), Staff.class);
        System.out.println(staff.toString());
    }
}
