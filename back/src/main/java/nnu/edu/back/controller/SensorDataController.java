package nnu.edu.back.controller;

import nnu.edu.back.common.result.JsonResult;
import nnu.edu.back.common.result.ResultUtils;
import nnu.edu.back.pojo.SensorAdcp;
import nnu.edu.back.pojo.SensorChaoweiyi;
import nnu.edu.back.pojo.SensorLuojing;
import nnu.edu.back.pojo.SensorZhuoduyi;
import nnu.edu.back.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sensorData")
public class SensorDataController {
    @Autowired
    SensorDataService sensorDataService;
    
    @RequestMapping(value = "/adcp", method = RequestMethod.GET)
    public JsonResult getAdcpData(
            @RequestParam String startTime,
            @RequestParam String endTime) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        return ResultUtils.success(sensorDataService.getAdcpDataByTimeRange(start, end));
    }

    @RequestMapping(value = "/adcp/all", method = RequestMethod.GET)
    public JsonResult getAllAdcpData() {
        return ResultUtils.success(sensorDataService.getAllAdcpData());
    }
    
    @RequestMapping(value = "/chaoweiyi", method = RequestMethod.GET)
    public JsonResult getChaoweiyiData(
            @RequestParam String station,
            @RequestParam String startTime,
            @RequestParam String endTime) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        return ResultUtils.success(sensorDataService.getChaoweiyiDataByStationAndTime(station, start, end));
    }

    @RequestMapping(value = "/chaoweiyi/all", method = RequestMethod.GET)
    public JsonResult getAllChaoweiyiData() {
        return ResultUtils.success(sensorDataService.getAllChaoweiyiData());
    }
    
    @RequestMapping(value = "/luojing", method = RequestMethod.GET)
    public JsonResult getLuojingData(
            @RequestParam String startTime,
            @RequestParam String endTime) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        return ResultUtils.success(sensorDataService.getLuojingDataByTimeRange(start, end));
    }

    @RequestMapping(value = "/luojing/all", method = RequestMethod.GET)
    public JsonResult getAllLuojingData(){
        return ResultUtils.success(sensorDataService.getAllLuojingData());
    }
    
    @RequestMapping(value = "/zhuoduyi", method = RequestMethod.GET)
    public JsonResult getZhuoduyiData(
            @RequestParam String startTime,
            @RequestParam String endTime) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse(startTime);
        Date end = sdf.parse(endTime);
        return ResultUtils.success(sensorDataService.getZhuoduyiDataByTimeRange(start, end));
    }

    @RequestMapping(value = "/zhuoduyi/all", method = RequestMethod.GET)
    public JsonResult getAllZhuoduyiData(){
        return ResultUtils.success(sensorDataService.getAllZhuoduyiData());
    }
}