public class Song 
{
    private String songName;
    private String artistName;
    private int plays;

    public Song(String name, String artistName, int plays)
    {
        this.songName = name;
        this.artistName = artistName;
        this.plays = plays;
    }
    public void print ()
    {
        System.out.print ("Song:" + this.songName);
        System.out.print ("Artist:" + this.artistName);
        System.out.println("Plays: " + this.plays);
        

        }
    }
    



