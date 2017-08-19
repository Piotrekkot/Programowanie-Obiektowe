package zad1;

import java.util.ArrayList;

public class Letters extends Thread {
    ArrayList<Thread> threads = new ArrayList<Thread>();
 
    public Letters(){
    	
    }
    public Letters(String s){
        for(int i = 0; i < s.length(); i++){
            String letter = s.substring(i, i+1);
            Runnable myThread= () -> {
                while(true){
                    try{
                        System.out.print(letter);
                        Thread.sleep(1000);
                    } catch (InterruptedException ie){
                        break;
                    }
                }
            };
            threads.add(new Thread(myThread, "Thread " + letter));
        }
    }
    public ArrayList<Thread> getThreads(){
        return threads;
    }
 
}
