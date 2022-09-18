package rdbms.nosql.nosqluniv.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import rdbms.nosql.nosqluniv.neo4j.nodes.Teacher;

import java.util.UUID;

public interface TeacherRepository extends Neo4jRepository<Teacher, UUID> {
}
