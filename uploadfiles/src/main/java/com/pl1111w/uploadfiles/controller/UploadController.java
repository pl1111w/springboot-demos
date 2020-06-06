package com.pl1111w.uploadfiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {
    private static final String PATHFILE = "E:/ideapath/springboot-demos/uploadfiles/src/main/resources/static/image/";

    @PostMapping(value = "/uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam("head_img") MultipartFile[] file,HttpServletRequest request) {

        //获取用户名
        String userName = request.getParameter("name");

        //获取文件名
        String fileName = file[0].getOriginalFilename();

        //打印文件类型
        System.out.println( file[0].getContentType());

        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));


        for(int i =0;i<file.length;i++){
            //生成唯一文件名
            fileName = UUID.randomUUID() + suffixName;
            File uploadFile = new File(PATHFILE + fileName);
            try {
                file[i].transferTo(uploadFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "success";
    }
}
