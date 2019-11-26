package user.common.enums;

/**
 * @Auther: ltc
 * @Date: 2019/11/26 15:38
 * @Description:
 */
public enum AopLogTypeEnum implements BaseValue<Integer> {

    FAIL(0),
    SUCCESS(1);

    private Integer value;

    AopLogTypeEnum(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
