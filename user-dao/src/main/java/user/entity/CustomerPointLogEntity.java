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
 * 用户积分日志表
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Data
@TableName("customer_point_log")
public class CustomerPointLogEntity extends Model<CustomerPointLogEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 积分日志ID
     */
    @TableId(value = "point_id", type = IdType.AUTO)
    private Integer pointId;

    /**
     * 用户ID
     */
    private Integer customerId;

    /**
     * 积分来源
     */
    private Integer source;

    /**
     * 积分来源相关编号
     */
    private Integer referNumber;

    /**
     * 变更积分数
     */
    private Integer changePoint;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifiedTime;
}
