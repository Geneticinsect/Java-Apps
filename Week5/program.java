package Week5;

import java.util.ArrayList;
import helpers.*;


public class program 
{
    private ArrayList<Song> songs;

    public program() 
    {
        songs = new ArrayList<Song>();
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs() 
    {
        Song song = new Song("Live and Learn", "Jun Senoue", 310749);
        songs.add(song);

        song = new Song("Vandalise", "One Ok Rock", 1298209);
        songs.add(song);

        song = new Song("Uptown Funk", "Mark Ronson Ft Bruno Mars", 473823317);
        songs.add(song);
    
        song = new Song("Thriller", "Micheal Jackson", 859234654);
        songs.add(song);

        song = new Song("His World", "Zebrahead", 3226384);
        songs.add(song);

        song = new Song("Endless possibilities", "Tomoya Ohtani", 11241196);
        songs.add(song);

        song = new Song("Apple bottom jeans", "T-Pain", 34048003);
        songs.add(song);

        song = new Song("Reach for the stars", "Cash Cash ", 3870007);
        songs.add(song);

        song = new Song("Blizzard", "Daichi Miura", 7443467);
        songs.add(song);

        song = new Song("The only thing the fear is you", "Mick Gordan", 6183432);
        songs.add(song);
    }
    public void doMainMenu() 
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs(0);break;
                case 4: aboveSongs();break;
                case 5: wantToQuit = true; break;
            } 
        
        }
    }

    private void displayMenu() 
    {
        System.out.println("\n 1. Add Student");
        System.out.println(" 2. Delete Student");
        System.out.println(" 3. Print All Students");
        System.out.println(" 4. Quit\n");

    }

    /**
     * This method will ask the user for the
     * title of the song, the artist name
     * and how many times it has been streamed
     */
    private void addSong()
    {
        System.out.println(" \nAdding a Song\n");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name  >");
        int count = InputReader.getInt("Please enter the play count > ");

        Song song = new Song(title, name, count);
        songs.add(song);
    }

    private void deleteSong()
    {
        printSongs(0);
        
        Song song = findSong();
        if(song != null){
        songs.remove(song);
       
        }
        else 
        System.out.println("Sorry couldn't find song");
    }

    private Song findSong()
    {
        String foundsong = InputReader.getString("Please enter song >");
        for(Song song : songs) {
            if(song.getsongname().contains(foundsong))
            return song;
        }
        return null;
    }

    private void printSongs(int count) 
    {
        System.out.println("\nPrinting All Songs\n");
        int id = 0; 

        for(Song song : songs)
        {
            id++;
            System.out.print("Song " + id + ": "); 
            if (song.getplayCount()>count)
            song.print();
        }

    }

    private void aboveSongs(){
        
        int aboveSongsrequest = InputReader.getInt("Insert play count >");
        printSongs(aboveSongsrequest);
    }
}