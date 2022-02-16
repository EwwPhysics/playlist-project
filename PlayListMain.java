package PlaylistProject;

import java.util.Scanner;

public class PlayListMain {

	public static void main(String[] args) {
		PlayList p = new PlayList("; ~ ;");
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		
		boolean c = true;
		while (c) {
			System.out.println("Your playlist: " + p);
			System.out.println("What do you want to do?\n"
					+ "1. Swap two songs\n"
					+ "2. Rename the playlist\n"
					+ "3. Clear the playlist\n"
					+ "4. Add a song to the playlist \n"
					+ "5. Remove a song from the playlist \n"
					+ "6. Remove all songs by a certain artist\n"
					+ "7. Get the name of the playlist\n"
					+ "8. Get every song in the playlist by a certain artist\n"
					+ "9. Find the average rating of songs in the playlist\n"
					+ "10. Find how many songs in the playlist were written by a certain artist\n"
					+ "11. Exit");
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the index of the first song");
					int s1 = s.nextInt();
					System.out.println("Enter the index of the second song");
					int s2 = s.nextInt();
					p.swap(s1, s2);
					break;
				case 2:
					System.out.println("Enter the new name for the playlist");
					String title = s.next();
					p.renameList(title);
					break;
				case 3:
					p.clearList();
					break;
				case 4:
					System.out.println("What is the name of the new song?");
					title = s.next();
					System.out.println("What is the artist of the song?");
					String artist = s.next();
					System.out.println("How many stars does the song have?");
					int stars = s.nextInt();
					p.add(new Song(title, artist, stars));
					break;
				case 5:
					System.out.println("What is the title of the song you want to remove?");
					String songName = s.next();
					p.removeSong(songName);
					break;
				case 6:
					System.out.println("What artist do you want to remove?");
					artist = s.next();
					p.removeArtist(artist);
					break;
				case 7:
					System.out.println("The playlist name is: " + p.getName());
					break;
				case 8:
					System.out.println("Which artist?");
					artist = s.next();
					System.out.println(p.getSongs(artist));
					break;
				case 9:
					System.out.println("The average rating is: " + p.averageRating());
					break;
				case 10:
					System.out.println("Which artist?");
					artist = s.next();
					System.out.println(p.numSongsByArtist(artist) + " songs were written by " + artist);
					break;
				default:
					c = false;
					break;
			}
			System.out.println("\n");
		}
	}

}
