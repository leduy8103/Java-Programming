package com.example.Product.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Product
{
    private int id;
    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;
    @Length(min = 0, max = 200, message = "Tên ảnh không được quá 200 kí tự")
    private String image;
    @NotNull(message = "Giá sản phẩm không được để trống")
    @Min(value = 1, message = "Gía sản phẩm không được nhỏ hơn 1")
    @Max(value = 999999999, message = "Giá sản phẩm không được lớn hơn 999999999")
    private long price;

    public Product() {
    }

    public Product(int id, String name, String image, long price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank(message = "Tên sản phẩm không được để trống") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Tên sản phẩm không được để trống") String name) {
        this.name = name;
    }

    public @Length(min = 0, max = 200, message = "Tên ảnh không được quá 200 kí tự") String getImage() {
        return image;
    }

    public void setImage(@Length(min = 0, max = 200, message = "Tên ảnh không được quá 200 kí tự") String image) {
        this.image = image;
    }

    @NotNull(message = "Giá sản phẩm không được để trống")
    @Min(value = 1, message = "Gía sản phẩm không được nhỏ hơn 1")
    @Max(value = 999999999, message = "Giá sản phẩm không được lớn hơn 999999999")
    public long getPrice() {
        return price;
    }

    public void setPrice(@NotNull(message = "Giá sản phẩm không được để trống") @Min(value = 1, message = "Gía sản phẩm không được nhỏ hơn 1") @Max(value = 999999999, message = "Giá sản phẩm không được lớn hơn 999999999") long price) {
        this.price = price;
    }
}
