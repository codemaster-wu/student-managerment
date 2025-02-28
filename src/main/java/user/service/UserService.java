package user.service;

import user.entity.User;

public interface UserService {

    /**
     * 用户注册
     *
     * @param user 用户
     * @return 注册结果：0-失败，1-成功
     */
    int userRegister(User user);

    /**
     * 用户登录
     *
     * @param phone    电话号
     * @param password 密码
     * @return 登录结果：null-失败，User-成功
     */
    User userLogin(String phone, String password);

}