package com.itheima.code.build;

import freemarker.template.Template;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/****
 * @Author:www.itheima.com
 * @Description:ServiceImpl构建
 * @Date www.itheima.com
 *****/
public class ServiceImplBuilder {

    /***
     * ServiceImpl构建
     * @param modelMap
     */
    public static void builder(Map<String,Object> modelMap){
        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/service/impl",
                "ServiceImpl.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE_IMPL,
                "ServiceImpl.java");
    }

}
