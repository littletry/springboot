package top.huangt.springboot.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Intellij IDEA
 *
 * @author ht
 * Date 2018/8/17
 * Time 10:26
 */
public class User {
    /**
     * 用户唯一标识
     */
    @ApiModelProperty(value = "用户id",hidden = true)
    private String id;
    /**
     * 登录用户名
     */
    @ApiModelProperty(value = "登录用户名")
    private String loginName;
    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户登录密码")
    private String password;
    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    /**
     * 用户性别（男0女1保密2）
     */
    @ApiModelProperty(value = "用户性别")
    private Integer sex;
    /**
     * 用户生日
     */
    @ApiModelProperty(value = "用户生日")
    private String birthday;
    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;
    /**
     * 用户个性描述信息
     */
    @ApiModelProperty(value = "用户个性描述信息")
    private String description;
    /**
     * 用户注册时间
     */
    @ApiModelProperty(value = "用户注册时间",hidden = true)
    private String regTime;
    /**
     * 用户最后一次登录时间
     */
    @ApiModelProperty(value = "用户最后一次登录时间",hidden = true)
    private String lastTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", regTime='" + regTime + '\'' +
                ", lastTime='" + lastTime + '\'' +
                '}';
    }
}
