package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.ImageFile;

public class ImageFileDto extends DtoBase<ImageFile> {

    private Long Product_Id;
    private String File_Image_Name;
    private String Format_Image;
    private String URL_Image;

    public Long getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(Long product_Id) {
        Product_Id = product_Id;
    }

    public String getFile_Image_Name() {
        return File_Image_Name;
    }

    public void setFile_Image_Name(String file_Image_Name) {
        File_Image_Name = file_Image_Name;
    }

    public String getFormat_Image() {
        return Format_Image;
    }

    public void setFormat_Image(String format_Image) {
        Format_Image = format_Image;
    }

    public String getURL_Image() {
        return URL_Image;
    }

    public void setURL_Image(String URL_Image) {
        this.URL_Image = URL_Image;
    }
}
