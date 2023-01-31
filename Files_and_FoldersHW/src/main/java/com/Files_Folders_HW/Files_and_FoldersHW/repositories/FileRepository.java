package com.Files_Folders_HW.Files_and_FoldersHW.repositories;

import com.Files_Folders_HW.Files_and_FoldersHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long>{

}
