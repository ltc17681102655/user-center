package user.common.arms;

import com.aikucun.order.common.enums.BaseValue;

/**
 * @Auther: ltc
 * @Date: 2019/7/19 20:27
 * @Description:
 */
public enum ArmsLogPrefixEnum implements BaseValue<String> {
	//    PV("_pv"),
	ERROR("_error"),
	TIME("_time"),
	/**
	 * 应用异常
	 */
	APPLICATION("_error_application"),
	/**
	 * 业务异常
	 */
	BUSINESS("_error_business");

	private String value;

	ArmsLogPrefixEnum(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
