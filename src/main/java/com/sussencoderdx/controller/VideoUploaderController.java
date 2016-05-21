package com.sussencoderdx.controller;

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

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("sussencoderdx")
@Path("/videouploader")
public class VideoUploaderController {

	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadVideo(
		@FormParam("file") InputStream uploadedVideo,
		@FormDataParam("file") FormDataContentDisposition details) {

		String home = System.getProperty("user.home");
		String uploadedFileLocation = home+"/Downloads" + details.getFileName();

		// Salvar e converter


		String output = "Your memory is was collected : " + uploadedFileLocation;

		return Response.status(200).entity(output).build();

	}
	
}
