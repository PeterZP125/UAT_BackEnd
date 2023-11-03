package com.zp.uat.codeGen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zp.uat.entity.TransformKey;
import com.zp.uat.sys.bean.ResultPage;
import com.zp.uat.vo.TransformKeyQVO;
import com.zp.uat.vo.TransformKeyVO;

/**
 * <p>
 * 转换键 Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2023-11-02
 */
public interface TransformKeyMapper extends BaseMapper<TransformKey> {

    ResultPage<TransformKeyVO> getList(TransformKeyQVO qvo, ResultPage<TransformKeyVO> objectRetPage);
}
