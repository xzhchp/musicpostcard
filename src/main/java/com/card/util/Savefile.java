package com.card.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;


public class Savefile {
	private String fileSpace;
	private String uploadPathDB;
	private String fileName;
	private MultipartFile file;
	public Savefile(String space,String dbpath,String filename,MultipartFile file){
		this.fileSpace = space;
		this.uploadPathDB = dbpath;
		this.fileName = filename;
		this.file = file;
	}
	
	public boolean savefile()throws Exception{
		FileOutputStream fileOutputStream=null;
	    InputStream inputStream=null;
	    
	    try {
	    	//判断filename是否为空
	    	if(StringUtils.isNotBlank(fileName))
	    	{
		String finalPath=fileSpace+uploadPathDB+"/"+fileName;
		File outFile = new File(finalPath);
		if(outFile.getParentFile()!=null ||!outFile.getParentFile().isDirectory()) {
		//创建父文件夹
		outFile.getParentFile().mkdirs();
	}
		fileOutputStream = new FileOutputStream(outFile);
    	inputStream = file.getInputStream();
    	IOUtils.copy(inputStream, fileOutputStream);
	    	}
	    	else{
	    		return false;
	    	}
	    } catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {

			if(fileOutputStream!=null) {
				fileOutputStream.flush();
				fileOutputStream.close();
			}
		}
	    System.out.println("上传成功");
	    return true;
	}
}
