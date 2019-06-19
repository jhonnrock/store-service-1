/**
 * @author: Johnny .
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageFileDto;

import javax.persistence.*;

@Entity
public class ImageFile extends ModelBase<ImageFileDto>
{
    private String File_Image_Name;
    private String Format_Image;
    private String URL_Image;
    @ManyToOne(optional = false)
    private Product product;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}