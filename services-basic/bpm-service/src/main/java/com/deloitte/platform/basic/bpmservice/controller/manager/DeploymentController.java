package com.deloitte.platform.basic.bpmservice.controller.manager;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.deloitte.platform.basic.bpmservice.controller.manager.model.DeploymentResponse;
import com.deloitte.platform.basic.bpmservice.controller.manager.model.ToWeb;
import com.deloitte.platform.basic.bpmservice.entity.BpmPosition;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author bixie
 *
 */
@RestController
@RequestMapping("deployments")
public class DeploymentController implements RestServiceController<Deployment, String>
{
	@Autowired
	RepositoryService repositoryService;

	@Override
	public Object getOne(@PathVariable("id") String id)
	{
		Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(id).singleResult();
		return ToWeb.buildResult().setObjData(new DeploymentResponse(deployment));
	}

	@GetMapping("/query/list")
	public Object query(@RequestParam(value = "modelName", required = false) String modelName,@RequestParam(value = "rowSize", defaultValue = "1000", required = false) Integer rowSize, @RequestParam(value = "page", defaultValue = "1", required = false) Integer page) {
		String name = modelName;
		if(name == null){
			name = "%%";
		}else{
			name = "%"+modelName+"%";
		}
		List<Deployment> deployments = repositoryService.createDeploymentQuery().deploymentNameLike(name).listPage(rowSize * (page - 1), rowSize);
		long count = repositoryService.createDeploymentQuery().deploymentNameLike(name).count();
		List<DeploymentResponse> list = new ArrayList<>();
		for (Deployment deployment : deployments)
		{
			list.add(new DeploymentResponse(deployment));
		}
		return ToWeb.buildResult().setRows(ToWeb.Rows.buildRows().setCurrent(page).setTotalPages((int) (count / rowSize + 1)).setTotalRows(count).setList(list).setRowSize(rowSize));
	}

	@Override
	public Object getList(@RequestParam(value = "rowSize", defaultValue = "1000", required = false) Integer rowSize, @RequestParam(value = "page", defaultValue = "1", required = false) Integer page)
	{
		List<Deployment> deployments = repositoryService.createDeploymentQuery().listPage(rowSize * (page - 1), rowSize);
		long count = repositoryService.createDeploymentQuery().count();
		List<DeploymentResponse> list = new ArrayList<>();
		for (Deployment deployment : deployments)
		{
			list.add(new DeploymentResponse(deployment));
		}

		return ToWeb.buildResult().setRows(ToWeb.Rows.buildRows().setRowSize(rowSize).setTotalPages((int) (count / rowSize + 1)).setTotalRows(count).setList(list).setCurrent(page));
	}

	@Override
	public Object deleteOne(@PathVariable("id") String id)
	{
		repositoryService.deleteDeployment(id);
		return ToWeb.buildResult().refresh();
	}

	@Override
	public Object postOne(@RequestBody Deployment entity)
	{
		return null;
	}

	@Override
	public Object putOne(@PathVariable("id") String s, @RequestBody Deployment entity)
	{
		return null;
	}

	@Override
	public Object patchOne(@PathVariable("id") String s, @RequestBody Deployment entity)
	{
		return null;
	}
}
