package nnu.edu.station.common.result;

import java.io.IOException;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class ProcessCmdOutput {
    int statusCode; // 0-错误 1-成果
    String outputString;
    String errorMessage;

    public static ProcessCmdOutput ok(String outputString) {
        return ProcessCmdOutput.builder().statusCode(1).outputString(outputString).build();
    }

    public static ProcessCmdOutput error(IOException e) {
        String exceptionInfo = e.getMessage() + e;
        log.info(exceptionInfo);
        return ProcessCmdOutput.builder().statusCode(0).errorMessage(exceptionInfo).build();
    }
}

