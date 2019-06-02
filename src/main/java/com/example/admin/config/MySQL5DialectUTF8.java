package com.example.admin.config;
import org.hibernate.dialect.MySQL5Dialect;

/**
 * 因为hibernate自动创建的表，不是utf-8的，
 * 采用如下方式，让他创建的表是utf-8的
 * @author Gao
 */
public class MySQL5DialectUTF8 extends MySQL5Dialect{
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
