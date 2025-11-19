package nnu.edu.back.service;

import nnu.edu.back.pojo.SensorAdcp;
import nnu.edu.back.pojo.SensorChaoweiyi;
import nnu.edu.back.pojo.SensorLuojing;
import nnu.edu.back.pojo.SensorZhuoduyi;

import java.util.Date;
import java.util.List;

public interface SensorDataService {
    List<SensorAdcp> getAdcpDataByTimeRange(Date startTime, Date endTime);

    List<SensorAdcp> getAllAdcpData();
    
    List<SensorChaoweiyi> getChaoweiyiDataByStationAndTime(String station, Date startTime, Date endTime);

    List<SensorChaoweiyi> getAllChaoweiyiData();
    
    List<SensorLuojing> getLuojingDataByTimeRange(Date startTime, Date endTime);

    List<SensorLuojing> getAllLuojingData();
    
    List<SensorZhuoduyi> getZhuoduyiDataByTimeRange(Date startTime, Date endTime);

    List<SensorZhuoduyi> getAllZhuoduyiData();
}