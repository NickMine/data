package com.javbus.data.app.caribbeancom;

import com.javbus.data.base.movie.MovieComponent;
import com.javbus.data.base.movie.MovieService;
import com.javbus.data.base.movie.domain.MovieDto;
import com.javbus.data.common.http.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 8:41
 * @Description:
 */
@Api(value = "/app/caribbean/com", description = "加勒比")
@RestController
@RequestMapping(value = "/caribbean/com")
public class CaribbeancomController {

    @Autowired
    private MovieComponent movieComponent;

    @Autowired
    private MovieService movieService;

    @ApiOperation(value = "列表")
    @PostMapping(value = "/list")
    public Response getList(@RequestParam(value = "userId") String userId) {
        return Response.success();
    }

    @ApiOperation(value = "列表")
    @GetMapping(value = "/old/list")
    public Response getOldList(
            @RequestParam(required = false,defaultValue = "1") long page,
            @RequestParam(required = false,defaultValue = "20")long size
    ) {
        return Response.success(movieService.oldPage(page, size));
    }


    @ApiOperation(value = "test")
    @PostMapping(value = "/test")
    public Response test(@RequestParam(value = "userId") String userId) {
        return Response.success(movieComponent.test());
    }

    @ApiOperation(value = "add")
    @PostMapping(value = "/add")
    public Response add(@RequestBody MovieDto dto) {
        return Response.success(movieComponent.add(dto));
    }
}
