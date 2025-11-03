//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nnu.edu.station.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateUtil {
    private static final Logger log = LoggerFactory.getLogger(UpdateUtil.class);

    public UpdateUtil() {
    }

    public static void DataUpdating(String python, String updateData, String dataprocessPath) {
        String command = python + " " + updateData + " " + dataprocessPath;
        String taskName = "Data updating";
        ProcessUtil.run(command, taskName);
    }

    public static void ManuelDataUpdating(String python, String manuelUpdateData, String dataprocessPath) {
        String command = python + " " + manuelUpdateData + " " + dataprocessPath;
        String taskName = "Manuel data updating";
        ProcessUtil.run(command, taskName);
    }
}
