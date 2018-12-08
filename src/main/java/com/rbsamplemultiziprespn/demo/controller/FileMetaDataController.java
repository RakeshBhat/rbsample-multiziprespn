package com.rbsamplemultiziprespn.demo.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.rbsamplemultiziprespn.demo.entity.FileMetaData;

@RestController("/metadata")
public class FileMetaDataController {

	@PostMapping("/save")
	public ResponseEntity<FileMetaData> saveFileMetaData(@RequestBody FileMetaData aFileMetaData, @RequestHeader String user){
		aFileMetaData.setLastUpdateBy(user);
		aFileMetaData.setLastUpdateDate(LocalDateTime.now().toString());
		return new ResponseEntity<FileMetaData>(aFileMetaData, HttpStatus.OK);	
	}
	
	@PostMapping("/delete")
	public ResponseEntity<FileMetaData> deleteFileMetaData(@RequestBody FileMetaData aFileMetaData, @RequestHeader String user){
		aFileMetaData.setLastUpdateBy("");
		aFileMetaData.setLastUpdateDate("");
		return new ResponseEntity<FileMetaData>(aFileMetaData, HttpStatus.OK);	
	}
}
