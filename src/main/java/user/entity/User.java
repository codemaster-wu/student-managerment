package user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;             // 用户编号
    private String name;        //用户姓名
    private String phone;       // 电话号码
    private String password;    // 账户密码
}