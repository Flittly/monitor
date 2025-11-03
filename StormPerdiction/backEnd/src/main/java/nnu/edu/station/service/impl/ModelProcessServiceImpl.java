package nnu.edu.station.service.impl;

import nnu.edu.station.common.utils.TaskManager;
import nnu.edu.station.service.ModelProcessService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chry
 * @Date: 2024/4/20 15:56
 * @Description:
 */

@Service
public class ModelProcessServiceImpl implements ModelProcessService {

    @Value("${DirectoryPath}")
    String directoryPath;

    @Value("${ScriptName}")
    String scriptName;

    @Value("${ForecastDataPath}")
    String forecastDataPath;

    @Value("${python}")
    String python;

    @Value("${ManuelUpdating}")
    String manuelUpdating;

    @Value("${dataprocess}")
    String dataprocess;

    @Value("${DataProcessLog}")
    String logPath;

    TaskManager taskManager = new TaskManager();

    @Override
    public String runOnce() throws IOException, InterruptedException {
        return taskManager.runOnce(logPath, directoryPath, scriptName, python, manuelUpdating, dataprocess, forecastDataPath);
    }

    @Override
    public String runOnceCondition() {
        return taskManager.runOnceCondition();
    }
}
