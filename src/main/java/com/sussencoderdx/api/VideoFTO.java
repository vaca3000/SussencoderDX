package com.sussencoderdx.api;

import java.io.File;

public class VideoFTO {
	
	private File video;
	private Long size;
	
	public VideoFTO (File video){
		this.video = video;
		this.setSize(video.length());
	}
	
	public void setVideo(File video){
		this.video = video;
	}

	public File getVideo() {
		return video;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}


	
	

}
