package com.java.me.designPattern.adapter.impl;

import com.java.me.designPattern.adapter.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("play mp4 file.name"+fileName);
	}

}
