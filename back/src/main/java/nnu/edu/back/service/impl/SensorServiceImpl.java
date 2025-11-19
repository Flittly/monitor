package nnu.edu.back.service.impl;

import nnu.edu.back.dao.sensor.*;
import nnu.edu.back.pojo.SensorAdcp;
import nnu.edu.back.pojo.SensorChaoweiyi;
import nnu.edu.back.pojo.SensorLuojing;
import nnu.edu.back.pojo.SensorZhuoduyi;
import nnu.edu.back.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorDataService{
    @Autowired
    private AdcpDataMapper adcpDataMapper;

    @Autowired
    private ChaoweiyiDataMapper chaoweiyiDataMapper;

    @Autowired
    private LuojingDataMapper luojingDataMapper;

    @Autowired
    private ZhuoduyiDataMapper zhuoduyiDataMapper;

    @Override
    public List<SensorAdcp> getAdcpDataByTimeRange(Date startTime, Date endTime) {
        return adcpDataMapper.getAdcpDataByTimeRange(startTime, endTime);
    }

    @Override
    public List<SensorAdcp> getAllAdcpData() {
        return adcpDataMapper.getAllAdcpData();
    }
    
    @Override
    public List<SensorChaoweiyi> getChaoweiyiDataByStationAndTime(String station, Date startTime, Date endTime) {
        return chaoweiyiDataMapper.getChaoweiyiDataByStationAndTime(station, startTime, endTime);
    }

    @Override
    public List<SensorChaoweiyi> getAllChaoweiyiData() {
        return chaoweiyiDataMapper.getAllChaoweiyiData();
    }
    
    @Override
    public List<SensorLuojing> getLuojingDataByTimeRange(Date startTime, Date endTime) {
        return luojingDataMapper.getLuojingDataByTimeRange(startTime, endTime);
    }

    @Override
    public List<SensorLuojing> getAllLuojingData() {
        return luojingDataMapper.getAllLuojingData();
    }
    
    @Override
    public List<SensorZhuoduyi> getZhuoduyiDataByTimeRange(Date startTime, Date endTime) {
        return zhuoduyiDataMapper.getZhuoduyiDataByTimeRange(startTime, endTime);
    }

    @Override
    public List<SensorZhuoduyi> getAllZhuoduyiData() {
        return zhuoduyiDataMapper.getAllZhuoduyiData();
    }
}