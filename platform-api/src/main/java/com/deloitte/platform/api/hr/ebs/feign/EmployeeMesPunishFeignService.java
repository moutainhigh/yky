package com.deloitte.platform.api.hr.ebs.feign;


import com.deloitte.platform.api.hr.ebs.client.EmployeeMesPunishClient;
import com.deloitte.platform.api.hr.ebs.param.EmployeeMesPunishQueryForm;
import com.deloitte.platform.api.hr.ebs.vo.EmployeeMesPunishForm;
import com.deloitte.platform.common.core.entity.vo.Result;
import com.deloitte.platform.common.core.exception.PlatformErrorType;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @Author : LJH
 * @Date : Create in 2019-06-04
 * @Description :   EmployeeMesPunish feign客户端
 * @Modified :
 */
@FeignClient(name = "employeeMesPunish-service", fallbackFactory = EmployeeMesPunishFeignService.HystrixEmployeeMesPunishService.class,primary = false)
public interface EmployeeMesPunishFeignService extends EmployeeMesPunishClient {

    @Component
    @Slf4j
    class HystrixEmployeeMesPunishService implements FallbackFactory<EmployeeMesPunishFeignService> {

        @Override
        public EmployeeMesPunishFeignService create(Throwable throwable) {
            return new EmployeeMesPunishFeignService() {
                @Override
                public Result add(@Valid @RequestBody EmployeeMesPunishForm employeeMesPunishForm) {
                    log.error("EmployeeMesPunishService add服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result delete(@PathVariable long id) {
                    log.error("EmployeeMesPunishService delete服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result update(@PathVariable long id, @Valid @RequestBody EmployeeMesPunishForm employeeMesPunishForm) {
                    log.error("EmployeeMesPunishService update服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result get(@PathVariable long id) {
                    log.error("EmployeeMesPunishService get服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result list(@Valid @RequestBody EmployeeMesPunishQueryForm employeeMesPunishQueryForm) {
                    log.error("EmployeeMesPunishService list服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result search(@Valid @RequestBody EmployeeMesPunishQueryForm employeeMesPunishQueryForm) {
                    log.error("EmployeeMesPunishService search服务不可用......");
                    throwable.printStackTrace();
                    return Result.fail(PlatformErrorType.GATEWAY_SERVICE_UNABLE,throwable.getMessage());
                }

                @Override
                public Result saveOrUpdate(EmployeeMesPunishForm employeeMesPunishForm) {
                    return null;
                }

                @Override
                public Result publishToEbs(EmployeeMesPunishForm employeeMesPunishForm) {
                    return null;
                }
            };
        }
    }
}