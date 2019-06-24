package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.ImageFile;

public class ImageFileDto extends DtoBase<ImageFile> {
    private String fileImageName;
    private String formatImage;
    private String urlImage;

    public String getFileImageName() {
        return fileImageName;
    }

    public void setFileImageName(String fileImageName) {
        this.fileImageName = fileImageName;
    }

    public String getFormatImage() {
        return formatImage;
    }

    public void setFormatImage(String formatImage) {
        this.formatImage = formatImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
