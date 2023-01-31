package com.Files_Folders_HW.Files_and_FoldersHW.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "files")
public class File {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "extension")
        private FileExtension fileExtension;

        @Column(name = "size")
        private double size;

        @ManyToOne
        @JoinColumn(name = "folder_id", nullable = true)
        @JsonIgnoreProperties({"files"})
        private Folder folder;

        public File(String name, FileExtension fileExtension, double size, Folder folder) {
                this.name = name;
                this.fileExtension = fileExtension;
                this.size = size;
                this.folder = folder;
        }

        public File() {

        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getFileExtension() {
                return this.fileExtension.getType();
        }

        public void setFileExtension(FileExtension fileExtension) {
                this.fileExtension = fileExtension;
        }

        public double getSize() {
                return this.size;
        }

        public void setSize(double size) {
                this.size = size;
        }

        public Folder getFolder() {
                return this.folder;
        }

        public void setFolder(Folder folder) {
                this.folder = folder;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }
}
