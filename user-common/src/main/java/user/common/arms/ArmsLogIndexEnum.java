package user.common.arms;

import user.common.enums.BaseEnum;

/**
 * @Auther: ltc
 * @Date: 2019/7/19 19:33
 * @Description:
 */
public enum ArmsLogIndexEnum implements BaseEnum<String> {
    /**
     * ofc相关接口
     */
    OFC_ACTIVITY_LIST("登入", "_login");

    private String key;
    private String value;

    ArmsLogIndexEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    public String value() {
        return value;
    }
}
