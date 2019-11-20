package user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Data
@TableName("customer_inf")
public class CustomerInfEntity extends Model<CustomerInfEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增ID
     */
    @TableId(value = "customer_inf_id", type = IdType.AUTO)
    private Integer customerInfId;

    /**
     * customer_login表的自增ID
     */
    private Integer customerId;

    /**
     * 用户的真实姓名
     */
    private String customerName;

    /**
     * 证件类型 1身份证，2军官证，3护照
     */
    private Integer identityCardType;

    /**
     * 手机号
     */
    private Integer mobilePhone;

    /**
     * 邮箱
     */
    private String customerEmail;

    /**
     * 性别
     */
    private String gender;

    /**
     * 会员积分
     */
    private Integer userPoint;

    /**
     * 会员生日
     */
    private LocalDateTime birthday;

    /**
     * 会员级别
     */
    private Integer customerLevel;

    /**
     * 用户余额
     */
    private BigDecimal userMoney;

    /**
     * 注册时间
     */
    private LocalDateTime registerTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifiedTime;
}
