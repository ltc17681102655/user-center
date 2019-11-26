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
 * aop调用日志表
 * </p>
 *
 * @author ltc
 * @since 2019-11-26
 */
@Data
@TableName("aop_log")
public class AopLogEntity extends Model<AopLogEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 来源
     */
    private String source;

    /**
     * url
     */
    private String url;

    /**
     * ip
     */
    private String ip;

    /**
     * request
     */
    private String request;

    /**
     * response
     */
    private String response;

    /**
     * 是否成功 0:失败 1:成功
     */
    private Integer isSuccess;

    /**
     * 响应时长
     */
    private Integer time;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime modifiedTime;
}
