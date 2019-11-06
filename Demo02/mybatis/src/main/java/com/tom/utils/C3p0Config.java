package com.tom.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * ClassName: C3p0Config
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/27 17:02
 */
public class C3p0Config extends UnpooledDataSourceFactory {
    public C3p0Config(){
        this.dataSource = new ComboPooledDataSource();
    }
}
