package rdbms.nosql.nosqluniv.neo4j.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Node("Mark")
public class Mark {
    @Id
    @GeneratedValue
    private UUID id;
    private String evaluation;
    private LocalDate passdate;
    @Relationship(type = "RECEIVED", direction = Relationship.Direction.INCOMING)
    private Student student;
    @Relationship(type = "PUT", direction = Relationship.Direction.INCOMING)
    private Exam exam;

    public Mark(String evaluation, LocalDate passdate, Student student, Exam exam) {
        this.evaluation = evaluation;
        this.passdate = passdate;
        this.student = student;
        this.exam = exam;
    }
}
