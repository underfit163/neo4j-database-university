package rdbms.nosql.nosqluniv.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import rdbms.nosql.nosqluniv.neo4j.nodes.Student;

import java.util.UUID;

public interface StudentRepository extends Neo4jRepository<Student, UUID> {
}
