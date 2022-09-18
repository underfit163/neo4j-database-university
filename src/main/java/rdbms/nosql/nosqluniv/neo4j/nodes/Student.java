package rdbms.nosql.nosqluniv.neo4j.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Node("Student")
public class Student {
    @Id
    @GeneratedValue
    private UUID id;
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String phone;

    public Student(String fio, LocalDate birthday, String gender, String phone) {
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }
}
