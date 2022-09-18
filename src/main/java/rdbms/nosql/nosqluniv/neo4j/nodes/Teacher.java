package rdbms.nosql.nosqluniv.neo4j.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Node("Teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private UUID id;
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String title;
    private String teacherdegree;
    private String phone;
    @Relationship(type = "GIVE")
    private List<Mark> marks;

    public Teacher(String fio, LocalDate birthday, String gender, String title, String teacherdegree, String phone) {
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.title = title;
        this.teacherdegree = teacherdegree;
        this.phone = phone;
    }
}
