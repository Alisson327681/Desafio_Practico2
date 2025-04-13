package sv.edu.udb.repository.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(nullable = false)
    private String tittle;

    @Column(nullable = false)
    private LocalDate postDate;

    public void setTitle(@NotBlank String title) {
    }


    public String getTitle() {
        return null;
    }
}
