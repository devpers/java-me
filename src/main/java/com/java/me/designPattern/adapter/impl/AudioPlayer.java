package com.java.me.designPattern.adapter.impl;

import com.java.me.designPattern.adapter.MediaAdapter;
import com.java.me.designPattern.adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter = null;
	
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("play mp3 file.name"+fileName);
		}else if(audioType.equalsIgnoreCase("mp4")
				||audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Invalid media. "+
		            audioType + " format not supported");
		}
	}

}
