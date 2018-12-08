package com.rbsamplemultiziprespn.demo.controller.download;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/download")
public class FileDownloadController {

	@GetMapping("/zip")
	public ResponseEntity<byte[]> getzippedData(){
		
		final String json = "{ \"name\":\"John\", \"age\":30, \"car\":null }";
		final String csv = "name,John,age,30,car,null";
		  HttpHeaders h = new HttpHeaders();
		  h.add("Content-Disposition", "attachment; filename=" + "test.zip");
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try(ZipOutputStream zos = new ZipOutputStream(baos)) {

		  /* File is not on the disk, test.txt indicates
		     only the file name to be put into the zip */
		  ZipEntry entryJson = new ZipEntry("test.json"); 

		  zos.putNextEntry(entryJson);
		  zos.write(json.getBytes());
		  zos.closeEntry();

		  /* use more Entries to add more files
		     and use closeEntry() to close each file entry */
		  
		  ZipEntry entryCsv = new ZipEntry("test.csv"); 

		  zos.putNextEntry(entryCsv);
		  zos.write(csv.getBytes());
		  zos.closeEntry();	  
		  

		  } catch(IOException ioe) {
		    ioe.printStackTrace();
		  }
		
		return new ResponseEntity<>(baos.toByteArray(), h, HttpStatus.OK);
	}
	
	@GetMapping("/json")
	public ResponseEntity<byte[]> getJsonData(){
		final String json = "{ \"name\":\"John\", \"age\":30, \"car\":null }";
		
		  HttpHeaders h = new HttpHeaders();
		  h.add("Content-Disposition", "attachment; filename=" + "testJson.json");

		  return new ResponseEntity<>(json.getBytes(), h, HttpStatus.OK);
	}

	@GetMapping("/csv")
	public ResponseEntity<byte[]> getCsvData(){
		final String csv = "name,John,age,30,car,null";
		
		  HttpHeaders h = new HttpHeaders();
		  h.add("Content-Disposition", "attachment; filename=" + "testCsv.csv");

		  return new ResponseEntity<>(csv.getBytes(), h, HttpStatus.OK);
	}

	
	
}
