package music.jukebox;

import java.util.Queue;

public class Playlist {
	private Song song;
	private Queue<Song> songs;
	public Playlist(Song song,Queue<Song> songs) {
		this.song = song;
		this.songs = songs;
	}
	public Song getNextSongToPlay() {
		return songs.peek();
	}
	public void queueUpSong(Song s) {
		songs.add(s);
	}

}
