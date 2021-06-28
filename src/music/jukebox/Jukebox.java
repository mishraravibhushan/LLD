package music.jukebox;

import java.util.Set;

import personal.call.center.User;

public class Jukebox {
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private SongSelecttor ts;
	public Jukebox() {
		
	}
	public Song getCurrenttSOng() {
		return new Song();
	}

}
