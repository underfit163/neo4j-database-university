package rdbms.nosql.nosqluniv.neo4j.nodes;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;



import java.util.UUID;

@Data
@Node("Subject")
public class Subject {
    @Id
    @GeneratedValue
    private UUID id;
    private String subjectname;

    public Subject(String subjectname) {
        this.subjectname = subjectname;
    }

}
