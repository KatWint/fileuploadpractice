package com.katwdojo.fileupload;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.katwdojo.fileupload.controllers.FileUploadController;

@SpringBootApplication
@ComponentScan({"com.katwdojo.fileupload","controller"})
public class FileuploadApplication {

	public static void main(String[] args) {
		new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileuploadApplication.class, args);
	}

}
