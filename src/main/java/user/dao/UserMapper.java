package user.dao;

import user.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /**
     * 添加User
     *
     * @param user 用户实体类
     * @return 添加结果(0 : 失败, 1 : 成功)
     */
    int insertUser(User user);

    /**
     * 查询User
     *
     * @param phone    手机号
     * @param password 密码
     * @return 查找结果(null : 失败, User : 成功)
     */
    User selectUser(@Param("phone") String phone, @Param("password") String password);
}