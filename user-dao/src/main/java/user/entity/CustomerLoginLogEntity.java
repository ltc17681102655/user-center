package user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户登录日志表
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Data
@TableName("customer_login_log")
public class CustomerLoginLogEntity extends Model<CustomerLoginLogEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 登录日志ID
     */
    @TableId(value = "login_id", type = IdType.AUTO)
    private Integer loginId;

    /**
     * 登录用户ID
     */
    private Integer customerId;

    /**
     * 登录ID
     */
    private Integer loginIp;

    /**
     * 登录结果 0未成功，1成功
     */
    private Integer loginType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifiedTime;
}
