package com.lsh.cloud.service;

import com.lsh.cloud.model.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Project Name: servicecloud
 * Created by peter on 18/9/17.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
//@FeignClient(value = "SERVICECLOUD-DEPT")
@FeignClient(value = "SERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") Integer id);


    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean add(Dept dept);

}
