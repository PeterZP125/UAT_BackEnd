package com.zp.uat.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

/**
 * @author PeterZP
 * @create 2023-11-02 15:10
 */
public class MybatisPlusCodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql:///elife?serverTimezone=UTC&characterEncoding=utf-8",
                        "root",
                        "admin")
                .globalConfig(builder -> {
                    builder.author("PeterZP") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\apple\\Desktop\\MPGenCode\\UAT"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.zp.uat") // 设置父包名
                            .moduleName("codeGen") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\apple\\Desktop\\MPGenCode\\UAT")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder
                            .addInclude("sys_transform_key") // 设置需要生成的表名
                            .addTablePrefix("sys_") // 设置过滤表前缀
//                            实体配置
                            .entityBuilder()
                            .enableLombok()
                            .idType(IdType.ASSIGN_ID)
                            .enableChainModel()
                            .versionColumnName("revision")
                            .versionPropertyName("revision")
                            .logicDeleteColumnName("deleted")
                            .logicDeletePropertyName("deleted")
                            .enableFileOverride();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
