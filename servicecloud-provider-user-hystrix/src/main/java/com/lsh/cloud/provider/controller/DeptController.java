package com.lsh.cloud.provider.controller;

import com.lsh.cloud.model.Dept;
import com.lsh.cloud.provider.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

//	@Autowired
//	private DiscoveryClient client;


	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	{
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Integer id)
	{
		Dept dept = service.get(id);
		if(null == dept){

			throw new RuntimeException("为空");
		}

		return dept;
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return service.list();
	}


//	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
//	public Object discovery(){
//		List<String> list = client.getServices();
//		System.out.println("**********" + list);
//
//		List<ServiceInstance> srvList = client.getInstances("SERVICECLOUD-DEPT");
//		for (ServiceInstance element : srvList) {
//			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
//					+ element.getUri());
//		}
//		return this.client;
//	}

	public Dept processHystrix_Get(@PathVariable("id") Integer id)
	{
		return new Dept().setId(67).setFullname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setSimplename("no this database in MySQL");
	}


}
