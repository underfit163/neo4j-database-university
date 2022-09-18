package rdbms.nosql.nosqluniv.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import rdbms.nosql.nosqluniv.neo4j.nodes.Exam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ExamRepository extends Neo4jRepository<Exam, UUID> {
    Optional<List<Exam>> searchExamsBySubjectSubjectname(String subject);
    Optional<List<Exam>> searchExamByPasstype(String passtype);
}
