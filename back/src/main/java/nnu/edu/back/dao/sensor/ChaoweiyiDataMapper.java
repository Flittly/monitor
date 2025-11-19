package nnu.edu.back.dao.sensor;

import nnu.edu.back.pojo.SensorChaoweiyi;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ChaoweiyiDataMapper {
    List<SensorChaoweiyi> getChaoweiyiDataByStationAndTime(@Param("station") String station, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    List<SensorChaoweiyi> getAllChaoweiyiData();
}