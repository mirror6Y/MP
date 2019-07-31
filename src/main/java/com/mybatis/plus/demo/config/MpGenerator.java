package com.mybatis.plus.demo.config;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @author mirror6
 * @date 2019/7/7 10:28
 */
public class MpGenerator {

    private final static String PATH = "D://";

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
        //数据库类型
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("mirror6");
        dsc.setUrl("jdbc:mysql://localhost:3306/city_topic?serverTimezone=GMT%2B8&amp&useSSL=false&autoReconnect=true&failOverReadOnly=false");
        mpg.setDataSource(dsc);

        // 数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //此处是的表前缀,实体类不会生成
        strategy.setTablePrefix("t_");
        //【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
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
        //生成文件的输出目录
        gc.setOutputDir(PATH);
        gc.setAuthor("mirror6");
        //是否覆盖已有文件
        gc.setFileOverride(true);
        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(true);
        // 开启XML BaseResultMap
        gc.setBaseResultMap(true);
        // 开启XML BaseColumnList
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        TemplateConfig tc = new TemplateConfig();
        tc.setController("/templatesMybatis/controller.java.vm");

        // 执行生成
        mpg.execute();
    }

}
