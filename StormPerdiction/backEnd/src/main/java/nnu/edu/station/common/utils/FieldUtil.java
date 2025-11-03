//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package nnu.edu.station.common.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FieldUtil {
    private static final Logger log = LoggerFactory.getLogger(FieldUtil.class);

    public FieldUtil() {
    }

    public static void executePythonFieldGenerating(String python, String FieldGenerating, String ncfilepath, String fieldpath) {
        String command = python + " " + FieldGenerating + " " + ncfilepath + " " + fieldpath;
        String taskName = "Field generating";
        ProcessUtil.run(command, taskName);
    }

    public static void executePythonTxtBuilder4add(String python, String addFieldGenerating, String ncfilepath_fort, String ncfilepath2_acdirc, String addField, String addFieldMask) {
        String command = python + " " + addFieldGenerating + " " + ncfilepath2_acdirc + " " + ncfilepath_fort + " " + addField + " " + addFieldMask;
        String taskName = "TxtBuilder4zeta execution";
        ProcessUtil.run(command, taskName);
    }

    public static void executePythonCalculateWaterLevel(String python, String waterLevelCalculating, String ncFilePath, String folderPath, String pointJsonPath) {
        String command = python + " " + waterLevelCalculating + " " + ncFilePath + " " + folderPath + " " + pointJsonPath;
        String taskName = "WaterLevel calculating";
        ProcessUtil.run(command, taskName);
    }

    public static void executePythonDeleteFieldData(String python, String logPath, String DeleteFileData) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        try {
            Process process = Runtime.getRuntime().exec(python + " " + DeleteFileData);
            System.out.println("File data deleted scheduled at " + LocalDateTime.now());
            writer.println("Log message: File data deleted scheduled at " + LocalDateTime.now());
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("File data deleted executed successfully!");
                writer.println("Log message: file data deleted executed successfully!");
            } else {
                System.out.println("File data deleted execution failed!");
                writer.println("Log message: File data deleted execution failed!");
            }
        } catch (Exception var9) {
            System.out.println("Error executing file data deleted" + var9.getMessage());
            writer.println("Log message: Error executing file data deleted" + var9.getMessage());
        } finally {
            writer.close();
        }

    }

    public static Integer executePythonTxtBuilder4flow(String python, String logPath, String txtBuilder4flow, String ncfilepath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        Integer var7;
        try {
            Process process = Runtime.getRuntime().exec(python + " " + txtBuilder4flow + " " + ncfilepath);
            System.out.println("TxtBuilder4flow scheduled at " + LocalDateTime.now());
            writer.println("Log message: TxtBuilder4flow scheduled at " + LocalDateTime.now());
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("TxtBuilder4flow executed successfully!");
                writer.println("Log message: TxtBuilder4flow executed successfully!");
                var7 = 0;
                return var7;
            }

            System.out.println("TxtBuilder4flow execution failed!");
            writer.println("Log message: TxtBuilder4flow execution failed!");
            var7 = exitCode;
        } catch (Exception var11) {
            System.out.println("Error executing TxtBuilder4flow" + var11.getMessage());
            writer.println("Log message: Error executing TxtBuilder4flow" + var11.getMessage());
            Integer var6 = -1;
            return var6;
        } finally {
            writer.close();
        }

        return var7;
    }

    public static Integer executePythonTxtBuilder4wind(String python, String logPath, String txtBuilder4wind, String ncfilepath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        Integer var6;
        try {
            Process process = Runtime.getRuntime().exec(python + " " + txtBuilder4wind + " " + ncfilepath);
            writer.println("TxtBuilder4wind execution scheduled at: {}" + LocalDateTime.now());
            System.out.println("Log message: TxtBuilder4wind execution scheduled at: {}" + LocalDateTime.now());
            int exitCode = process.waitFor();
            Integer var7;
            if (exitCode == 0) {
                System.out.println("TxtBuilder4wind executed successfully!");
                writer.println("Log message: TxtBuilder4wind executed successfully!");
                var7 = 0;
                return var7;
            }

            System.out.println("TxtBuilder4wind execution failed!");
            writer.println("Log message: TxtBuilder4wind execution failed!");
            var7 = exitCode;
            return var7;
        } catch (Exception var11) {
            System.out.println("Error executing TxtBuilder4wind" + var11.getMessage());
            writer.println("Log message: Error executing TxtBuilder4wind" + var11.getMessage());
            var6 = -1;
        } finally {
            writer.close();
        }

        return var6;
    }

    public static void executePythonTriangle(String python, String logPath, String triangle, String outputPath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        try {
            Process process = Runtime.getRuntime().exec(python + " " + triangle + " " + outputPath);
            writer.println("Triangle execution scheduled at: {}" + LocalDateTime.now());
            System.out.println("Log message: Triangle execution scheduled at: {}" + LocalDateTime.now());
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Triangle executed successfully!");
                writer.println("Log message: Triangle executed successfully!");
            } else {
                System.out.println("Triangle execution failed!");
                writer.println("Log message: Triangle execution failed!");
            }
        } catch (Exception var10) {
            System.out.println("Error executing Triangle" + var10.getMessage());
            writer.println("Log message: Error executing Triangle" + var10.getMessage());
        } finally {
            writer.close();
        }

    }

    public static void executeCppFlowField(String exe, String inputJsonPath, String inputPath, String outputPath, String logPath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        try {
            Process process = Runtime.getRuntime().exec(exe + " " + inputJsonPath + " " + inputPath + " " + outputPath);
            writer.println("Flow field data generation execution scheduled at: {}" + LocalDateTime.now());
            System.out.println("Log message: Flow field data generation execution scheduled at: {}" + LocalDateTime.now());
            int exitCode = process.waitFor();
            System.out.println("Flow field data generation executed successfully!");
            writer.println("Log message: Flow field data generation executed successfully!");
        } catch (Exception var11) {
            System.out.println("Error executing flow field data generation" + var11.getMessage());
            writer.println("Log message: Error executing flow field data generation" + var11.getMessage());
        } finally {
            writer.close();
        }

    }

    public static void executeCppWindField(String exe, String inputJsonPath, String inputPath, String outputPath, String logPath) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(logPath, true));

        try {
            Process process = Runtime.getRuntime().exec(exe + " " + inputJsonPath + " " + inputPath + " " + outputPath);
            writer.println("Wind field data generation execution scheduled at: {}" + LocalDateTime.now());
            System.out.println("Log message: Wind field data generation execution scheduled at: {}" + LocalDateTime.now());
            int exitCode = process.waitFor();
            System.out.println("Wind field data generation executed successfully!");
            writer.println("Log message: Wind field data generation executed successfully!");
        } catch (Exception var11) {
            System.out.println("Error executing wind field data generation" + var11.getMessage());
            writer.println("Log message: Error executing wind field data generation" + var11.getMessage());
        } finally {
            writer.close();
        }

    }
}
