package js6team3.tbot.entity;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;

/**
 * Сущность: CatPhoto
 *
 * @author Юрий Калынбаев
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cat_photo")
public class CatPhoto {

    /**
     * поле "id" - идентификатор экземпляра класса
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    /**
     * поле "filePath" - название файла
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * поле "fileSize" - размер файла
     */
    @Column(name = "file_size")
    private long fileSize;

    /**
     * поле "MediaType" - тип файла
     */
    @Column(name = "media_type")
    private String MediaType;      // Тип файла

    /**
     * поле "photoCat" - массив для хранения фотографии
     */
    @Lob
    private byte[] photoCat;       // Массив для хранения фотографии

    /**
     * Связь "один к одному"
     */
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.TRUE)
    @OrderBy
    private Cat cat;
}
