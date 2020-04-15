package com.javbus.data.app.caribbeancom.controller;

import com.javbus.data.common.http.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 8:41
 * @Description:
 */
@Api(value = "/app/caribbean/com", description = "加勒比")
@RestController
@RequestMapping(value = "/caribbean/com")
public class CaribbeancomController {

    @ApiOperation(value = "列表")
    @PostMapping(value = "/list")
    public Response getList(@RequestParam(value = "userId") String userId) {
        return Response.success();
    }
}
