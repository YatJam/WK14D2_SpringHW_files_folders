package com.Files_Folders_HW.Files_and_FoldersHW.repositories;

import com.Files_Folders_HW.Files_and_FoldersHW.models.File;
import com.Files_Folders_HW.Files_and_FoldersHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
