package cn.codingstar.chero.common.bean;

/**
 * 极验验证返回客户端的结果对象
 */
public class GeeTestData {
    /**
     * 验证状态
     */
    private String status;

    /**
     * 极验版本号
     */
    private String version;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
