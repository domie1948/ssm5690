package com.project.demo.controller;

import com.project.demo.entity.JourneyReport;
import com.project.demo.service.JourneyReportService;
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
 * 行程报备：(JourneyReport)表控制层
 *
 */
@RestController
@RequestMapping("/journey_report")
public class JourneyReportController extends BaseController<JourneyReport, JourneyReportService> {

    /**
     * 行程报备对象
     */
    @Autowired
    public JourneyReportController(JourneyReportService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
