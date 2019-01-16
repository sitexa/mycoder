package com.sitexa.tools;

import io.jboot.codegen.model.JbootModelGenerator;
import io.jboot.codegen.service.JbootServiceGenerator;

/**
 * @author: xnpeng (xpneng@hotmail.com)
 * @date: 2019/1/16
 * @doc description
 **/
public class JbootCodeGenerator {

    public static void main(String args[]){
        //依赖model的包名
        String modelPackage = "com.weibo.model";
        //生成service 的包名
        String basePackage = "com.weibo.service";

        JbootModelGenerator.run(modelPackage);
        JbootServiceGenerator.run(basePackage, modelPackage);

    }
}
