package Week5;

public class Song {

    private String title;

    private String artist;

    private int playCount;

    public Song(String title, String name, int count) 
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
    }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }
    public String getsongname() {
    return title;
    }
     public int getplayCount() {
    return playCount;
    }    
}
