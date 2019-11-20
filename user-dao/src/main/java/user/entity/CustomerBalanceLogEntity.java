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
 * 用户余额变动表
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Data
@TableName("customer_balance_log")
public class CustomerBalanceLogEntity extends Model<CustomerBalanceLogEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 余额日志ID
     */
    @TableId(value = "balance_id", type = IdType.AUTO)
    private Integer balanceId;

    /**
     * 用户ID
     */
    private Integer customerId;

    /**
     * 记录来源
     */
    private Integer source;

    /**
     * 相关单据ID
     */
    private Integer sourceSn;

    /**
     * 变动金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifiedTime;
}
