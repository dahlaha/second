import java.util.HashSet;
import java.util.LinkedHashSet;
/**
 * Класс для представления средств хранения
 */
public class Storage{
    /** Название средства хранения  */
    private String storageName;
    /** Список песен в средстве храния  */
    private LinkedHashSet<Song> songs= new LinkedHashSet<>();
    /** Параметрический конструктор */
    public Storage(String storageName) {
        this.storageName=storageName;
        this.songs=new LinkedHashSet<>();
    }
    /** Метод для получение название средства хранения*/
    public String getStorageName() {
        return storageName;
    }
    /** Устанавливает значение названия средства хранения*/
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }
    /** Возвращает строку с полями класса Storage */
    @Override
    public String toString() {
        if(songs.isEmpty()){
            return "Название носителя: " + storageName;
        }
        else{
            return "Название носителя: " + storageName + "\n" + "Песни: " + allSongs(songs);
            }
        }
    /** Метод добавляет в список песен элемент */
    public void addMusic(Song song){
        songs.add(song);
    }
    /** Метод удаляет из списка песен элемент */
    public void removeMusic(Song song){
        songs.remove(song);
    }
    /** Приводит к строке список всех песен */
    public StringBuffer allSongs(LinkedHashSet<Song> songs){
        StringBuffer stringBuffer = new StringBuffer();
        for(Song song:songs){
            stringBuffer.append(song);
        }
        return stringBuffer;
    }
    /** Метод воспроизводства песен, исходя из совместимости средства хранения и устройства вывода выодит соответсвующий результат*/
    public void play(Device device, Storage storage){
        if(device.interoperable(storage, device)){
            System.out.printf("%s\n%s\n",storage, device);
            System.out.println();
        }
        else{
            System.out.println("устройства не совместимы\n");
        }
    }

}
