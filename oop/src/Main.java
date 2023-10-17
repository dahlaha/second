public class Main {
    public static void main(String[] args) {
        /** Создание песен */
        Song s1=new Song("Sunday","The Cranberries");
        Song s2=new Song("Not your summer","The Academic");
        Song s3=new Song("Cold cold cold","Cage The Elephant");
        /** Создание устройств вывода */
        Device device=new Device("Vinyl player","Record");
        Device device2=new Device("CD-player","CD");
        /** Создание средств хранения */
        Storage storage=new Storage("Record");
        Storage storage2=new Storage("CD");

        /** добавление песни s1 в средство храннения storage */
        storage.addMusic(s1);
        /** воспроизводство песен*/
        storage.play(device,storage);
        storage.play(device2,storage);
        storage.play(device2,storage2);

        /** добавление песни*/
        storage.addMusic(s2);
        /** добавление песни*/
        storage.addMusic(s3);
        /** воспроизводство песен*/
        storage.play(device,storage);

        /** удаление песни*/
        storage.removeMusic(s2);
        /** воспроизводство песен*/
        storage.play(device,storage);
    }
}