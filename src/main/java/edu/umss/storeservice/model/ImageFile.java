package edu.umss.storeservice.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "IMAGE_FILE", schema = "dbo", catalog = "SYSTEMSALES4")
public class ImageFile {
    private String fileImageName;
    private String formatImage;
    private String urlImage;

    @Basic
    @Column(name = "File_Image_Name")
    public String getFileImageName() {
        return fileImageName;
    }

    public void setFileImageName(String fileImageName) {
        this.fileImageName = fileImageName;
    }

    @Basic
    @Column(name = "Format_Image")
    public String getFormatImage() {
        return formatImage;
    }

    public void setFormatImage(String formatImage) {
        this.formatImage = formatImage;
    }

    @Basic
    @Column(name = "URL_Image")
    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageFile imageFile = (ImageFile) o;
        return Objects.equals(fileImageName, imageFile.fileImageName) &&
                Objects.equals(formatImage, imageFile.formatImage) &&
                Objects.equals(urlImage, imageFile.urlImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileImageName, formatImage, urlImage);
    }
}
