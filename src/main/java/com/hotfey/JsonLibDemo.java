package com.hotfey;

import com.hotfey.pojo.Staff;
import net.sf.json.JSONObject;

/**
 * Created by pipe on 2016/11/7.
 */
public class JsonLibDemo {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setAddress("abc_address");
        staff.setcTime("abc_cTime");
        staff.setLgTime("abc_lgTime");
        JSONObject jsonObject = JSONObject.fromObject(staff);

        System.out.println(jsonObject.toString());

        staff = (Staff) JSONObject.toBean(jsonObject, Staff.class);
        System.out.println(staff.toString());
    }
}
