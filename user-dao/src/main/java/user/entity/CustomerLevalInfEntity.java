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
 * 用户级别信息表
 * </p>
 *
 * @author ltc
 * @since 2019-11-20
 */
@Data
@TableName("customer_leval_inf")
public class CustomerLevalInfEntity extends Model<CustomerLevalInfEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 会员级别ID
     */
    @TableId(value = "customer_level", type = IdType.AUTO)
    private Integer customerLevel;

    /**
     * 会员级别名称
     */
    private String levelName;

    /**
     * 该级别最低分值
     */
    private Integer minPoint;

    /**
     * 该级别最高分值
     */
    private Integer maxPoint;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后的修改时间
     */
    private LocalDateTime modifiedTime;
}
