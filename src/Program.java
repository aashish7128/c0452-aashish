import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {
        ArrayList<Song> songlist = new ArrayList<>();

        Song song1 = new Song("One time", "Justin biebier", 267000);
        Song song2 = new Song("Jag Ghoomeya", "Rahat fateh ali khan", 207000);
        Song song3 = new Song("Watch Me", "Silento", 185000);
        Song song4 = new Song("kabira", "Arijit singh", 185000);
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", 213000);
        Song song6 = new Song("Tere sang yaara", "Atif aslam", 221000);
        Song song7 = new Song("If You", "Big Bang", 264000);

        songlist.add(song1);
        songlist.add(song2);
        songlist.add(song3);
        songlist.add(song4);
        songlist.add(song5);
        songlist.add(song6);
        songlist.add(song7);

        for(Song obj : songlist)
        {
            obj.print();
        }

        //one.remove("kabira");
        //one.remove("Watch Me");
    }
}
