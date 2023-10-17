/**
 * Класс для представления устройств
 */
public class Device {
    /** Название устройства вывода */
    private String deviceName;
    /** Средство хранения совместимое с устройством вывода */
    private String interoperableStorage;
    /** Параметрический конструктор */

    public Device(String deviceName, String interoperableStorage) {
        this.deviceName=deviceName;
        this.interoperableStorage =interoperableStorage;
    }
    /** Метод для получение название устройства вывода*/
    public String getDeviceName() {
        return deviceName;
    }
    /** Устанавливает значение названия устройства вывода*/
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    /** Метод для получение название средства хранения совместимого с устройством вывода*/
    public String getInteroperableStorage() {
        return interoperableStorage;
    }
    /** Устанавливает значение названия средства хранения совместимого с устройством вывода*/
    public void setInteroperableStorage(String interoperableStorage) {
        this.interoperableStorage = interoperableStorage;
    }
    /** Возвращает строку с полем deviceName класса Device */
    @Override
    public String toString() {
        return "Название устройства: " + deviceName;
    }
    /** Метод проверки совместимости устройства вывода и средства хранения */
    public boolean interoperable(Storage storage, Device device){
        return this.interoperableStorage.equals(storage.getStorageName());
    }

}
