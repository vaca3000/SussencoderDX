package com.sussencoderdx.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class VideoUploaderController {

	@RequestMapping(value ="/upload", method = RequestMethod.GET)
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadVideo(
			@FormParam("file") InputStream uploadedVideo,
			@FormDataParam("file") FormDataContentDisposition details) {

		String home = System.getProperty("user.home");
		String uploadedFileLocation = home+"/Downloads" + details.getFileName();

		// Salvar 
		
		String output = "Your memory was collected : " + uploadedFileLocation;

		return Response.status(200).entity(output).build();

	}
	
	@RequestMapping(value ="/test", method = RequestMethod.GET)
		public String adress(){
			return "index.html";
		}
	
	
	
}
