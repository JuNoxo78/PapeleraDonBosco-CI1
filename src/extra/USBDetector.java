package extra;

import com.fazecast.jSerialComm.SerialPort;

public class USBDetector {
    public static String detectUSB() {
        SerialPort[] ports = SerialPort.getCommPorts();
        for (SerialPort port : ports) {
            if (port.getDescriptivePortName().contains("USB")) {
                return port.getSystemPortName(); // O algún identificador único
            }
        }
        return null;
    }
}