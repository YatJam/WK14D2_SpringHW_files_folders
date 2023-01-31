package com.Files_Folders_HW.Files_and_FoldersHW.models;

public enum FileExtension {
    TXT("txt"),
    PPT("ppt"),
    JAVA("java"),
    PY("py"),
    JS("js"),
    PDF("pdf");

    private final String type;

    FileExtension(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
