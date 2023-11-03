package com.zp.uat.codeGen.controller;

import com.zp.uat.codeGen.service.ITransformKeyService;
import com.zp.uat.sys.bean.Result;
import com.zp.uat.sys.bean.RetPage;
import com.zp.uat.vo.TransformKeyQVO;
import com.zp.uat.vo.TransformKeyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * <p>
 * 转换键 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-11-02
 */
@RestController
@RequestMapping("/codeGen/transformKey")
public class TransformKeyController {

    @Autowired
    private ITransformKeyService transformKeyService;

    @PostMapping
    public Result<String> saveOrUpdate(@RequestBody TransformKeyVO listVO) {
        transformKeyService.saveOrUpdateEntity(listVO);
        return Result.success();
    }

    @GetMapping("list")
    public Result<RetPage<TransformKeyVO>> list(TransformKeyQVO qvo) {
        RetPage<TransformKeyVO> list =  transformKeyService.getList(qvo);
        return Result.success(list);
    }
}
