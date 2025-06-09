package com.project.demo.controller;

import com.project.demo.entity.CommunityWorkers;
import com.project.demo.service.CommunityWorkersService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 社区工作人员：(CommunityWorkers)表控制层
 *
 */
@RestController
@RequestMapping("/community_workers")
public class CommunityWorkersController extends BaseController<CommunityWorkers, CommunityWorkersService> {

    /**
     * 社区工作人员对象
     */
    @Autowired
    public CommunityWorkersController(CommunityWorkersService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapjob_no = new HashMap<>();
        mapjob_no.put("job_no",String.valueOf(paramMap.get("job_no")));
        List listjob_no = service.selectBaseList(service.select(mapjob_no, new HashMap<>()));
        if (listjob_no.size()>0){
            return error(30000, "字段工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}
