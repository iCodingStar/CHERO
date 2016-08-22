package cn.codingstar.chero.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author shixing
 * @date 2016/8/8
 * @what Modification History:
 * <p>
 * Date               Author      Version     Description
 * ------------------------------------------------------------------
 * 2016/8/8           shixing      1.0
 */
@Component("mail")
public class Mail implements Serializable {

    /**
     * 默认编码
     */
    public static final String ENCODING = "utf-8";

    /**
     * 服务器地址
     */
    @Value("${mail.host}")
    private String host;

    /**
     * 发件人邮箱
     */
    @Value("${mail.sender}")
    private String sender;

    /**
     * 收件人邮箱
     */
    @Value("${mail.receiver}")
    private String receiver;

    /**
     * 发件人昵称
     */
    @Value("${mail.username}")
    private String username;

    /**
     * 密码
     */
    @Value("${mail.password}")
    private String password;

    /**
     * 主题
     */
    private String subject;

    /**
     * 信息：支持HTML
     */
    private String message;

    public static String getENCODING() {
        return ENCODING;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
