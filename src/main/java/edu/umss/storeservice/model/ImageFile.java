package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageFileDto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "IMAGE_FILE")

@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "ListImageFile",
                procedureName = "ListImageFile",
                resultClasses = ImageFile.class
        ),
        @NamedStoredProcedureQuery(
                name = "DeleteImageFileById",
                procedureName = "DeleteImageFileById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "result", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "GetImageFileById",
                procedureName = "GetImageFileById",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Long.class)
                },
                resultClasses = ImageFile.class
        ),
        @NamedStoredProcedureQuery(
                name="SaveImageFIle",
                procedureName = "AddImageFIle",
                parameters = {
                        @StoredProcedureParameter(name="id",mode = ParameterMode.IN,type=Long.class),
                        @StoredProcedureParameter(name="fileImageName",mode=ParameterMode.IN,type=String.class),
                        @StoredProcedureParameter(name="formatImage",mode =ParameterMode.IN,type=String.class),
                        @StoredProcedureParameter(name="urlImage",mode=ParameterMode.IN,type=String.class)
                }
        )
})



public class ImageFile  extends ModelBase<ImageFileDto>{
    private String fileImageName;
    private String formatImage;
    private String urlImage;
    @ManyToOne(optional = false)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

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
