package nnu.edu.back.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SensorChaoweiyi {
    private Long id;
    private String deviceId;
    private Integer typeId;
    private Double liquidLevel;
    private Double temperature;
    private Date deviceTimestamp;
    private Date createdAt;
}