package hello.upload.controller;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import lombok.Data;

@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}
