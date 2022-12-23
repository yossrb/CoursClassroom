package tn.esprit.projetclassroom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projetclassroom.entities.CoursClassroom;

@Repository
public interface CoursClassroomRepos extends JpaRepository<CoursClassroom,Integer> {
}
