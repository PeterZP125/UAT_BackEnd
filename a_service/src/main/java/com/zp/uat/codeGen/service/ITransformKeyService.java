package com.zp.uat.codeGen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp.uat.entity.TransformKey;
import com.zp.uat.sys.bean.ResultPage;
import com.zp.uat.vo.TransformKeyQVO;
import com.zp.uat.vo.TransformKeyVO;

/**
 * <p>
 * 转换键 服务类
 * </p>
 *
 * @author baomidou
 * @since 2023-11-02
 */
public interface ITransformKeyService extends IService<TransformKey> {

    boolean saveOrUpdateEntity(TransformKeyVO listVO);

    ResultPage<TransformKeyVO> getList(TransformKeyQVO qvo);

    TransformKeyVO detailEntity(String id);
}
