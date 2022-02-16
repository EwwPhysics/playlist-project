/*
	Class: PlayList.java
	Written by: Sasha Murray
	Date: Jan 19, 2022
	Description: A playlist class
*/

import java.util.*;

public class PlayList {
	
	private String title;
	private int maxNumberSongs;
	private ArrayList<Song> songList;
	
	public PlayList() {
		this.title = "PlayList 1";
		this.maxNumberSongs = 20;
		this.songList = new ArrayList<Song>();
	}
	
	public PlayList(String title) {
		this.title = title;
		this.maxNumberSongs = 20;
		this.songList = new ArrayList<Song>();
		songList.add(new Song("Be Honest", "LOONA", 5));
		songList.add(new Song("Curiosity", "LOONA", 5));
		songList.add(new Song("You Belong With Me", "Taylor Swift", 5));
		songList.add(new Song("LILAC", "IU", 5));
		songList.add(new Song("Rebirth", "Red Velvet", 5));
	}
	
	public PlayList(String title, int m) {
		this.title = title;
		this.maxNumberSongs = m;
		this.songList = new ArrayList<Song>();
		songList.add(new Song("Be Honest", "LOONA", 5));
		songList.add(new Song("Curiosity", "LOONA", 5));
		songList.add(new Song("You Belong With Me", "Taylor Swift", 5));
		songList.add(new Song("LILAC", "IU", 5));
		songList.add(new Song("Rebirth", "Red Velvet", 5));
	}
	
	// Method name: swap
	// Parameters: int s1, int s2
	// Return type: void
	// Description: swaps two songs in the playlist by index
	public void swap(int s1, int s2) {
		if (s1 < 0 || s2 < 0 || s1 > songList.size() ||s2 > songList.size()) {
			System.out.println("Your indices were not valid, try again.");
			return;
		}
		Song song1 = songList.get(s1);
		Song song2 = songList.get(s2);
		songList.set(s1, song2);
		songList.set(s2, song1);
	}
	
	// Method name: renameList
	// Parameters: String title
	// Return type: void
	// Description: renames the playlist
	public void renameList(String title) {
		this.title = title;
	}
	
	// Method name: clearList
	// Parameters: none
	// Return type: void
	// Description: removes all songs from the playlist
	public void clearList() {
		this.songList.clear();
	}
	
	// Method name: add
	// Parameters: Song s
	// Return type: boolean
	// Description: adds a song to the playlist and returns true, 
	//				unless you have reached the max size in which case it returns false
	public boolean add(Song s) {
		if (songList.size() < maxNumberSongs) {
			songList.add(s);
			return true;
		}
		return false;
	}
	
	// Method name: removeSong
	// Parameters: String t
	// Return type: void
	// Description: removes songs from the playlist with a given title
	public void removeSong(String t) {
		for (int i = songList.size() - 1; i >= 0; i--) {
			if (songList.get(i).getTitle().equals(t)) {
				songList.remove(i);
			}
		}
	}
	
	// Method name: removeArtist
	// Parameters: String artist
	// Return type: void
	// Description: removes all songs from a playlist by a given artist
	public void removeArtist(String artist) {
		for (int i = songList.size() - 1; i >= 0; i--) {
			if (songList.get(i).getArtist().equals(artist)) {
				songList.remove(i);
			}
		}
	}
	
	public String getName() {
		return this.title;
	}
	
	// Method name: getSongs
	// Parameters: String artist
	// Return type: ArrayList<Song>
	// Description: returns a list of all songs in the playlist which are by a given artist
	public ArrayList<Song> getSongs(String artist) {
		ArrayList<Song> res = new ArrayList<>();
		for (Song s: songList) {
			if (s.getArtist().equals(artist)) {
				res.add(s);
			}
		}
		return res;
	}
	
	// Method name: averageRating
	// Parameters: none
	// Return type: double
	// Description: returns the average stars of all the songs in the playlist
	public double averageRating() {
		if (songList.size() == 0) {
			return 0;
		}
		double sum = 0.0;
		for (Song s: songList) {
			sum += s.getStars();
		}
		return sum / songList.size();
	}
	
	// Method name: numSongsByArtist
	// Parameters: String artist
	// Return type: int
	// Description: returns the number of songs in the playlist which were written by a given artist
	public int numSongsByArtist(String artist) {
		int n = 0;
		for (Song s: songList) {
			if (s.getArtist().equals(artist)) {
				n++;
			}
		}
		return n;
	}
	
	public String toString() {
		return String.format("PlayList[Title=%s, Max Size=%s, Songs=%s]", title, maxNumberSongs, songList);
	}
}
