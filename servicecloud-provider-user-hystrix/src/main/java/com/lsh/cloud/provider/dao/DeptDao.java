package com.lsh.cloud.provider.dao;

import com.lsh.cloud.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Project Name: servicecloud
 * Created by peter on 18/9/15.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Integer id);

    List<Dept> findAll();

}
