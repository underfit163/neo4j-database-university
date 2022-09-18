package rdbms.nosql.nosqluniv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rdbms.nosql.nosqluniv.neo4j.nodes.*;
import rdbms.nosql.nosqluniv.neo4j.repositories.*;

import java.time.LocalDate;

@SpringBootApplication
public class NoSqlUnivApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoSqlUnivApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ExamRepository examRepository,
                                        MarkRepository markRepository,
                                        StudentRepository studentRepository,
                                        SubjectRepository subjectRepository,
                                        TeacherRepository teacherRepository) {
        return args -> {
            examRepository.deleteAll();
            markRepository.deleteAll();
            studentRepository.deleteAll();
            subjectRepository.deleteAll();
            teacherRepository.deleteAll();
            Student student1 = new Student(
                    "Андрей", LocalDate.of(1999, 3, 20), "ж", "4354543");
            Student student2 = new Student(
                    "Алексей", LocalDate.of(1998, 12, 31), "м", "784654");
            studentRepository.save(student1);
            studentRepository.save(student2);

            Subject subject1 = new Subject("noSql");
            Subject subject2 = new Subject("Java");
            subjectRepository.save(subject1);
            subjectRepository.save(subject2);

            Teacher teacher1 = new Teacher(
                    "Анфиса", LocalDate.of(1989, 3, 20), "м", "доцент",
                    "кандидат наук", "4354543");
            Teacher teacher2 = new Teacher(
                    "Алексей", LocalDate.of(1978, 3, 20), "м", "доцент",
                    "кандидат наук", "111111");
            teacherRepository.save(teacher1);
            teacherRepository.save(teacher2);

            Exam exam1 = new Exam("экзамен", 54, 1, subject1, teacher1);
            Exam exam2 = new Exam("экзамен", 54, 2, subject2, teacher2);
            examRepository.save(exam1);
            examRepository.save(exam2);

            Mark mark1 = new Mark("5", LocalDate.of(2019, 1, 14), student1, exam1);
            Mark mark2 = new Mark("4", LocalDate.of(2019, 1, 14), student1, exam2);
            Mark mark3 = new Mark("3", LocalDate.of(2019, 1, 14), student2, exam1);
            Mark mark4 = new Mark("3", LocalDate.of(2019, 1, 14), student2, exam2);

            markRepository.save(mark1);
            markRepository.save(mark2);
            markRepository.save(mark3);
            markRepository.save(mark4);

            //System.out.println(studentRepository.findAll());
            //System.out.println(studentRepository.findAll().size());

            //examRepository.searchExamByPasstype("экзамен").ifPresent(System.out::println);
            //examRepository.searchExamsBySubjectSubjectname(subject2.getSubjectname()).ifPresent(System.out::println);
            //markRepository.searchMarksByExam_SubjectSubjectname(subject1.getSubjectname()).forEach(System.out::println);
            //markRepository.findAllMarkByStudent("Алексей").forEach(x-> System.out.println("Оценка: " + x.getEvaluation()));
        };
    }
}
