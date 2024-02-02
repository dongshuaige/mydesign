package org.itstack.factorymethod.design;

/**
 * 发奖响应对象
 */
public class AwardRes {
    /**
     * 编码
     */
    private String code;

    /**
     * 信息
     */
    private String info;

    public AwardRes() {
    }

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
