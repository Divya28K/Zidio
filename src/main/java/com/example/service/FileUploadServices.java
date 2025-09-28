package com.example.service;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


@Service
public class FileUploadServices {

    @Autowired
    private Cloudinary cloudinary; 

    public String uploadFile(MultipartFile file, String folder) throws IOException {
        try {
            @SuppressWarnings("rawtypes")
			Map uploadFile = cloudinary.uploader().upload(
                file.getBytes(),
                ObjectUtils.asMap("folder", folder)
            );
            return (String) uploadFile.get("secure_url");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
