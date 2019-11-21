package user.common.utils;




import user.common.enums.BaseEnum;

import java.util.Arrays;

/**
 * @Auther: ltc
 * @Date: 2019/6/28 13:48
 * @Description: 枚举工具类
 */
public class EnumUtils {

    private EnumUtils() {
    }

    public static <T extends BaseEnum> String ofKye(Class<T> tClass, Object obj) {
        if (!tClass.isEnum()) {
            return null;
        }

        T t = Arrays.stream(tClass.getEnumConstants())
                .filter(c -> c.value().equals(obj))
                .findFirst()
                .orElse(null);

        if (t == null) {
            return null;
        }
        return t.key();
    }

    public static <T extends BaseEnum> T ofValue(Class<T> tClass, Object obj) {
        if (!tClass.isEnum()) {
            return null;
        }

        return Arrays.stream(tClass.getEnumConstants())
                .filter(c -> c.value().equals(obj))
                .findFirst()
                .orElse(null);
    }


    public static <T> T getValue(BaseEnum<T> baseEnum) {
        return baseEnum == null ? null : baseEnum.value();
    }

    public static <T> T getValue(BaseEnum<T> baseEnum, T defaultValue) {
        return baseEnum == null ? defaultValue : baseEnum.value();
    }
}
