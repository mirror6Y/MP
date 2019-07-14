package com.mybatis.plus.demo.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @auther mirror6
 * @date 2019/7/7 10:28
 */
public class MpGenerator {

    private final static String path = "D://";

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {

        //代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);//数据库类型
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("mirror6");
        dsc.setUrl("jdbc:mysql://localhost:3306/city_graduate?serverTimezone=GMT%2B8&amp&useSSL=false&autoReconnect=true&failOverReadOnly=false");
        mpg.setDataSource(dsc);

        // 数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setTablePrefix("t_");//此处是的表前缀,实体类不会生成
        strategy.setEntityLombokModel(true);//【实体】是否为lombok模型（默认 false）
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com");
        pc.setModuleName("mybatis.plus.demo");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        pc.setService("service");
        pc.setServiceImpl("service/impl");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(path);//生成文件的输出目录
        gc.setAuthor("mirror6");//作者
        gc.setFileOverride(true); //是否覆盖已有文件
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setBaseResultMap(true);// 开启XML BaseResultMap
        gc.setBaseColumnList(true);// 开启XML BaseColumnList
        mpg.setGlobalConfig(gc);

        TemplateConfig tc = new TemplateConfig();
        tc.setController("/templatesMybatis/controller.java.vm");

        // 执行生成
        mpg.execute();
    }

}
