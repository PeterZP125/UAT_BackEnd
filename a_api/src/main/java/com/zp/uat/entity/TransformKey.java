package com.zp.uat.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 转换键
 * </p>
 *
 * @author PeterZP
 * @since 2023-11-02
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_transform_key")
public class TransformKey implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 名称（英文）
     */
    private String nameEn;

    /**
     * 简介
     */
    private String brief;

    /**
     * 是否删除（0-否 1-是）
     */
    @TableLogic
    private Integer deleted;

    /**
     * 租户号
     */
    private String tenantId;

    /**
     * 乐观锁
     */
    @Version
    private Integer revision;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
