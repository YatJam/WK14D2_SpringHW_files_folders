package com.Files_Folders_HW.Files_and_FoldersHW.repositories;

import com.Files_Folders_HW.Files_and_FoldersHW.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
