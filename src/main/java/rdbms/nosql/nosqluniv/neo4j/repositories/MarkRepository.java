package rdbms.nosql.nosqluniv.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import rdbms.nosql.nosqluniv.neo4j.nodes.Mark;

import java.util.List;
import java.util.UUID;

public interface MarkRepository extends Neo4jRepository<Mark, UUID> {
    @Query("MATCH (s:Student {fio: $fio})-[:RECEIVED]->(m:Mark) RETURN m")
    List<Mark> findAllMarkByStudent(@Param("fio") String fio);

    List<Mark> searchMarksByExam_SubjectSubjectname(String sub);
}
