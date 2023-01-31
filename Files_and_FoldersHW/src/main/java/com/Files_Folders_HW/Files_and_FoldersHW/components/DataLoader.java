package com.Files_Folders_HW.Files_and_FoldersHW.components;

import com.Files_Folders_HW.Files_and_FoldersHW.models.File;
import com.Files_Folders_HW.Files_and_FoldersHW.models.FileExtension;
import com.Files_Folders_HW.Files_and_FoldersHW.models.Folder;
import com.Files_Folders_HW.Files_and_FoldersHW.models.Person;
import com.Files_Folders_HW.Files_and_FoldersHW.repositories.FileRepository;
import com.Files_Folders_HW.Files_and_FoldersHW.repositories.FolderRepository;
import com.Files_Folders_HW.Files_and_FoldersHW.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person Bobbert = new Person("Bobbert");
        personRepository.save(Bobbert);

        Person Lucille = new Person("Lucille");
        personRepository.save(Lucille);

        Person Yubber = new Person("Yubber");
        personRepository.save(Yubber);

        Folder Blue = new Folder("Blue Folder", Bobbert);
        folderRepository.save(Blue);

        Folder Red = new Folder("Red Folder", Bobbert);
        folderRepository.save(Red);

        Folder White = new Folder("White Folder", Lucille);
        folderRepository.save(White);

        Folder Gold = new Folder("Gold Folder", Lucille);
        folderRepository.save(Gold);

        Folder Black = new Folder("Black Folder", Lucille);
        folderRepository.save(Black);

        Folder Puse = new Folder("Puse Folder", Yubber);
        folderRepository.save(Puse);

        Folder Missing = new Folder("Missing Folder", Yubber);
        folderRepository.save(Missing);

        Folder TopSecret = new Folder("Top Secret", Yubber);
        folderRepository.save(TopSecret);

        File file1 = new File("file1", FileExtension.PPT, 12, Blue);
        fileRepository.save(file1);

        File file2 = new File("file2", FileExtension.PPT, 14, Blue);
        fileRepository.save(file2);

        File file3 = new File("file3", FileExtension.PPT, 9, Blue);
        fileRepository.save(file3);

        File file4 = new File("file4", FileExtension.PPT, 11, Red);
        fileRepository.save(file4);

        File file5 = new File("file5", FileExtension.PDF, 24, White);
        fileRepository.save(file5);

        File file6 = new File("file6", FileExtension.PDF, 120, Gold);
        fileRepository.save(file6);

        File file7 = new File("file7", FileExtension.PPT, 12, Black);
        fileRepository.save(file7);

        File file8 = new File("file8", FileExtension.JS, 113, Puse);
        fileRepository.save(file8);

        File file9 = new File("file9", FileExtension.JAVA, 39, Missing);
        fileRepository.save(file9);

        File file10 = new File("file10", FileExtension.PPT, 12, TopSecret);
        fileRepository.save(file10);

        File file11 = new File("file11", FileExtension.PPT, 14, Puse);
        fileRepository.save(file11);

        File file12 = new File("file12", FileExtension.PPT, 532, Red);
        fileRepository.save(file12);

        File file13 = new File("file13", FileExtension.PPT, 65, Black);
        fileRepository.save(file13);

        File file14 = new File("file14", FileExtension.PPT, 87, TopSecret);
        fileRepository.save(file14);

        File file15 = new File("file15", FileExtension.PPT, 22, Missing);
        fileRepository.save(file15);

        File file16 = new File("file16", FileExtension.PPT, 35, Gold);
        fileRepository.save(file16);

        File file17 = new File("file17", FileExtension.PPT, 634, TopSecret);
        fileRepository.save(file17);

        File file18 = new File("file18", FileExtension.PY, 2212, Missing);
        fileRepository.save(file18);

        File file19 = new File("file19", FileExtension.PPT, 53, Gold);
        fileRepository.save(file19);

        File file20 = new File("file20", FileExtension.PPT, 873, White);
        fileRepository.save(file20);

        Blue.addFile(file1);
        Blue.addFile(file2);
        Blue.addFile(file3);
        folderRepository.save(Blue);

        Red.addFile(file4);
        Red.addFile(file12);
        folderRepository.save(Red);

        White.addFile(file5);
        White.addFile(file20);
        folderRepository.save(White);

        Gold.addFile(file6);
        Gold.addFile(file16);
        Gold.addFile(file19);
        folderRepository.save(Gold);

        Black.addFile(file7);
        Black.addFile(file13);
        folderRepository.save(Black);

        Puse.addFile(file8);
        Puse.addFile(file11);
        folderRepository.save(Puse);

        Missing.addFile(file9);
        Missing.addFile(file15);
        Missing.addFile(file18);
        folderRepository.save(Missing);


        TopSecret.addFile(file10);
        TopSecret.addFile(file14);
        TopSecret.addFile(file17);
        folderRepository.save(TopSecret);

        Bobbert.addFolder(Blue);
        Bobbert.addFolder(Red);
        personRepository.save(Bobbert);

        Lucille.addFolder(White);
        Lucille.addFolder(Gold);
        Lucille.addFolder(Black);
        personRepository.save(Lucille);

        Yubber.addFolder(Puse);
        Yubber.addFolder(Missing);
        Yubber.addFolder(TopSecret);
        personRepository.save(Yubber);

    }

}
