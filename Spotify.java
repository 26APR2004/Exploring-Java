
//  java program single Thred to play my song
import java.util.*;
class Mythread extends Thread
{
     public void run()
{
   System.out.println("...…..play IGNITE song...");
}}
public class Spotify
{
  public static void main(String...Dj)
{
   Mythread music1 = new Mythread();
    music1.start();
}}