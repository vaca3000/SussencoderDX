package com.sussencoderdx.service;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.brightcove.zencoder.client.ZencoderClient;
import com.brightcove.zencoder.client.ZencoderClientException;
import com.brightcove.zencoder.client.model.*;
import com.brightcove.zencoder.client.request.*;
import com.brightcove.zencoder.client.response.*;

public class EncoderService {

	
	public List<ZencoderOutput> findCompatibleOutputs(InputStream video){
		
		List<ZencoderOutput> compatibleOutputs = new ArrayList<ZencoderOutput>();

		ZencoderOutput mp4 = new ZencoderOutput();
		mp4.setFormat(ContainerFormat.MP4);
		compatibleOutputs.add(mp4);

		ZencoderOutput webm = new ZencoderOutput();
		webm.setFormat(ContainerFormat.WEBM);
		compatibleOutputs.add(webm);
		
		return compatibleOutputs;
	}
	
	
	
}