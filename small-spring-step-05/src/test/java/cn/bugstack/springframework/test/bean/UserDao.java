package cn.bugstack.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/06/11:03
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小付哥");
        hashMap.put("10002", "嘻嘻哈哈");
        hashMap.put("10003", "asdfas");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
