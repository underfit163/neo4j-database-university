package rdbms.nosql.nosqluniv.neo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import rdbms.nosql.nosqluniv.neo4j.nodes.Subject;

import java.util.UUID;

public interface SubjectRepository extends Neo4jRepository<Subject, UUID> {
}
