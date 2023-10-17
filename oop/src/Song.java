import java.util.Objects;
/**
 * Класс для представления песен
 */
public class Song {
    /** Название песни  */
    private String name;
    /** Имя группы/музыканта  */
    private String musician;
    /** Параметрический конструктор */
    public Song(String name, String musician){
        this.name=name;
        this.musician=musician;
    }
    /** Метод для получение названия песни*/
    public String getName() {
        return name;
    }
    /** Метод для получение имени группы/музыканта */
    public String getMusician() {
        return musician;
    }
    /** Устанавливает значение названия песни */
    public void setName(String name) {
        this.name = name;
    }
    /** Устанавливает значение имени группы/музыканта */
    public void setMusician(String musician) {
        this.musician = musician;
    }

    @Override
    public String toString() {
        return name  + " - " + musician+"; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(musician, song.musician);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, musician);
    }
}
