package com.zp.uat.codeGen.service.impl;

import com.zp.uat.codeGen.mapper.TransformKeyMapper;
import com.zp.uat.codeGen.service.ITransformKeyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zp.uat.entity.TransformKey;
import com.zp.uat.sys.bean.RetPage;
import com.zp.uat.vo.TransformKeyQVO;
import com.zp.uat.vo.TransformKeyVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 转换键 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-11-02
 */
@Service("transformKeyService")
public class TransformKeyServiceImpl extends ServiceImpl<TransformKeyMapper, TransformKey> implements ITransformKeyService {

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, timeout = 10000)
    @Override
    public boolean saveOrUpdateEntity(TransformKeyVO listVO) {
        TransformKey entity = new TransformKey();
        BeanUtils.copyProperties(listVO, entity);
        saveOrUpdate(entity);
        return true;
    }

    @Override
    public RetPage<TransformKeyVO> getList(TransformKeyQVO qvo) {
        return baseMapper.getList(qvo, new RetPage<TransformKeyVO>(qvo.getCurrent(), qvo.getSize()));
    }
}
