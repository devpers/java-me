package com.java.me.designPattern.adapter.impl;

import com.java.me.designPattern.adapter.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("play vlc file.name"+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
