package com.java.me.designPattern.adapter;

import org.apache.commons.lang3.StringUtils;

import com.java.me.designPattern.adapter.impl.Mp4Player;
import com.java.me.designPattern.adapter.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advancePlayer = null;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(StringUtils.isNoneBlank(audioType)) {
			
			if(audioType.equalsIgnoreCase("vlc"))
				advancePlayer.playVlc(fileName);
			
			if(audioType.equalsIgnoreCase("mp4"))
				advancePlayer.playMp4(fileName);
		}
	}
	
	public MediaAdapter(String audioType) {
		if(StringUtils.isNoneBlank(audioType)) {
			
			if(audioType.equalsIgnoreCase("vlc"))
				advancePlayer = new VlcPlayer();
			
			if(audioType.equalsIgnoreCase("mp4"))
				advancePlayer = new Mp4Player();
		}
	}

	
}
