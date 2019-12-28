package ru.systemoteh.students.domain;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name", length = 250, nullable = false)
    private String firstName;
    @Column(name = "middle_name", length = 250)
    private String middleName;
    @Column(name = "last_name", length = 250, nullable = false)
    private String lastName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    @Column(name = "email", length = 250)
    private String email;

    public String getBirthDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy");
        return format.format(birthDate);
    }
}
