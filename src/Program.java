import java.util.ArrayList;

import helpers.InputReader;

public class Program {
    public static void main(String[] args)
    {
        System.out.println("Welcome to MusiK");
        System.out.println("There are 12 songs added in the app, currently.");
        ArrayList<Song> songlist = new ArrayList<>();

        Song song1 = new Song(" One time ", " Justin biebier ", 287000);
        Song song2 = new Song(" Jag Ghoomeya ", " Rahat fateh ali khan ", 207000);
        Song song3 = new Song(" Breathless ", " Shankar mahadevan ", 186000);
        Song song4 = new Song(" kabira ", " Arijit singh ", 184000);
        Song song5 = new Song(" Kesariya ", " Arijit singh ", 233000);
        Song song6 = new Song(" Tere sang yaara ", " Atif aslam ", 271000);
        Song song7 = new Song(" Baby ", " Justin biebier ", 244000);
        Song song8 = new Song(" Love me thoda aur ", " Arijit singh ", 1100000);
        Song song9 = new Song(" jogi ", " arko ", 8799900);
        Song song10 = new Song(" bulleya ", " Papon ", 2435456);
        Song song11 = new Song(" tere bagair ", " Pawandeep rajan ", 2990000);
        Song song12 = new Song(" pyaar tera ", " Sonu nigam ", 2423000);

        songlist.add(song1);
        songlist.add(song2);
        songlist.add(song3);
        songlist.add(song4);
        songlist.add(song5);
        songlist.add(song6);
        songlist.add(song7);
        songlist.add(song8);
        songlist.add(song9);
        songlist.add(song10);
        songlist.add(song11);
        songlist.add(song12);

     songlist.remove(song7);
     System.out.println("song removed successfully");
     System.out.println("List of songs after removing");

     for(Song song:songlist)
     {song.print();}
     
     {int Plays;
        Plays = InputReader.getint();
        System.out.println("Enter plays");
        For (Song song:songlist)
     {
        if (Plays < get.Plays())
        {
            song.print();
        }
     }
     

          

    }
}


