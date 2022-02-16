public class Song {
	private String title;
	private String artist;
	private int stars;
	
	// constructors
	public Song(){
		this(" ", " ", 0);
	}
	
	public Song(String t, String a, int s){
		title = t;
		artist = a;
		stars = s;
	}
	
	// accessors
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getStars() {
	    return stars;
	}
	
	//modifiers
	public void setTitle(String t) {
		title = t;
	}
	public void setArtist(String a) {
		artist = a;
	}
	public void setStars(int s) {
		stars = s;
	}
	
	// equals method returns true if the two objects' instance variables have the same values,
	// otherwise returns false.
	public boolean equals(Object o) {
	    Song s = (Song) o;
	    if(this.getTitle().equals(s.getTitle()) && this.getArtist().equals(s.getArtist()) && this.getStars() == s.getStars())
	    	return true;
	    else
	    	return false;
	}
	
	public String toString(){
		return "Song[Title = " + title + ", Artist = " + artist + ", Stars = " + stars + "]";
	}
}
