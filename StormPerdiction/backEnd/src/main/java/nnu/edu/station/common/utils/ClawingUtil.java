//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nnu.edu.station.common.utils;

public class ClawingUtil {
    public ClawingUtil() {
    }

    public static void ClawingCloudData(String python, String clawingCloud, String db, String cloudfile, String webdriver) {
        String command = python + " " + clawingCloud + " " + db + " " + cloudfile + " " + webdriver;
        String taskName = "Cloud Data clawing";
        ProcessUtil.run(command, taskName);
    }

    public static void ClawingRadarData(String python, String clawingRadar, String db, String radarfile, String webdriver) {
        String command = python + " " + clawingRadar + " " + db + " " + radarfile + " " + webdriver;
        String taskName = "Radar Data clawing";
        ProcessUtil.run(command, taskName);
    }

    public static void ClawingRainfallData(String python, String clawingRainfall, String db, String rainfallfile, String webdriver) {
        String command = python + " " + clawingRainfall + " " + db + " " + rainfallfile + " " + webdriver;
        String taskName = "Rainfall Data clawing";
        ProcessUtil.run(command, taskName);
    }

    public static void ClawingRainfallpreData(String python, String clawingRainfallpre, String db, String rainfallprefile, String webdriver) {
        String command = python + " " + clawingRainfallpre + " " + db + " " + rainfallprefile + " " + webdriver;
        String taskName = "Rainfallpre Data clawing";
        ProcessUtil.run(command, taskName);
    }

    public static void DeleteClawingData(String python, String deleteData) {
        String command = python + " " + deleteData;
        String taskName = "Meteorology data delated";
        ProcessUtil.run(command, taskName);
    }
}
