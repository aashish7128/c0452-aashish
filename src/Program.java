import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {
        ArrayList<Song> songlist = new ArrayList<>();

        Song song1 = new Song("One time", "Justin biebier", 287000);
        Song song2 = new Song("Jag Ghoomeya", "Rahat fateh ali khan", 207000);
        Song song3 = new Song("Breathless", "Shankar mahadevan", 186000);
        Song song4 = new Song("kabira", "Arijit singh", 184000);
        Song song5 = new Song("Kesariya", "Arijit singh", 233000);
        Song song6 = new Song("Tere sang yaara", "Atif aslam", 271000);
        Song song7 = new Song("Baby", "Justin biebier", 244000);

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
        //one.print ();
        //one.remove("Watch Me");
        //one.print();
        //one.clear();
        //one.print();

    }
}


