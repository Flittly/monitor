package nnu.edu.back.dao.sensor;

import nnu.edu.back.pojo.SensorLuojing;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LuojingDataMapper {
    List<SensorLuojing> getLuojingDataByTimeRange(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    List<SensorLuojing> getAllLuojingData();
}