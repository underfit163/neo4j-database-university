package rdbms.nosql.nosqluniv.neo4j.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.UUID;

@Data
@Node("Exam")
public class Exam {
    @Id
    @GeneratedValue
    private UUID id;
    private String passtype;
    private Integer totalhours;
    private Integer semester;
    @Relationship(type = "INCLUDES", direction = Relationship.Direction.INCOMING)
    private Subject subject;
    @Relationship(type = "CONDUCT", direction = Relationship.Direction.INCOMING)
    private Teacher teacher;

    public Exam(String passtype, Integer totalhours, int semester, Subject subject, Teacher teacher) {
        this.passtype = passtype;
        this.totalhours = totalhours;
        this.semester = semester;
        this.subject = subject;
        this.teacher = teacher;
    }
}
