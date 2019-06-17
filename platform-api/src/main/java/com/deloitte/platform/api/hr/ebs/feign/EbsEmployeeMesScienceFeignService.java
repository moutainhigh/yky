package com.deloitte.platform.api.hr.ebs.feign;

import com.deloitte.platform.api.hr.ebs.client.EbsEmployeeMesScienceClient;
import com.deloitte.platform.api.hr.employee_mes.vo.EmployeeMesScienceForm;
import com.deloitte.platform.common.core.entity.vo.Result;
import com.deloitte.platform.common.core.exception.PlatformErrorType;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author woo
 * @Title: EmployeeMesScienceClient
 * @ProjectName platform
 * @Description: TODO
 * @date 14:27  2019/6/4
 */
@FeignClient(name = "hr-service", fallbackFactory = EbsEmployeeMesScienceFeignService.HystrixEmployeeMesScienceFeignService.class,primary = false)
public interface EbsEmployeeMesScienceFeignService extends EbsEmployeeMesScienceClient {

    @Component
    @Slf4j
    class HystrixEmployeeMesScienceFeignService implements FallbackFactory<EbsEmployeeMesScienceFeignService> {

        @Override
        public EbsEmployeeMesScienceFeignService create(Throwable throwable) {
            return new EbsEmployeeMesScienceFeignService() {
                @Override
                public Result saveOrUpdate(@Valid @RequestBody EmployeeMesScienceForm employeeMesScienceForm) {
                    log.error("EmployeeMesScienceFeignService saveOrUpdate服务不可用...");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

            };
        }
    }
}
