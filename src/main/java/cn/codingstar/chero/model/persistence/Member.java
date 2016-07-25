package cn.codingstar.chero.model.persistence;

import cn.codingstar.chero.common.authorization.AuthorizationHelper;
import lombok.Data;

import java.util.Date;

@Data
public class Member extends BaseModel {

    protected String memberId;

    protected String memberNickname;

    protected String memberName;

    protected String password;

    protected String passwordSalt;

    protected Boolean enable;

    protected String memberImage;

    protected String memberSex;

    protected Date memberBirthday;

    protected String memberHobby;

    protected String memberTelephone;

    protected String memberHomePhone;

    protected String memberQq;

    protected String memberWeixin;

    protected String memberAddress;

    protected String memberNote;

    protected String token;

    /***
     * 密码加密
     */
    public void encodePassword() {
        this.password = AuthorizationHelper.encodePassword(this.password, this.passwordSalt);
    }

    /***
     * 密码验证
     *
     * @param password
     * @return
     */
    public boolean checkPassword(String password) {
        return this.password.equals(AuthorizationHelper.encodePassword(password, this.passwordSalt));
    }

    /***
     * 生成token
     */
    public void generateToken() {
        this.token = AuthorizationHelper.generateToken(this.memberName, this.password);
    }

}