/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    public static int[] roll(int num){
        int[] resultsArr = new int[num];
        for(int i = 0; i<num; i++){
            int val = (int)Math.floor(Math.random() * 7);
            resultsArr[i] = val;
        }
        return resultsArr;
    }

    public static boolean containsDuplicates(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j) {
                    if (arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static double average(int[] arr){
        int total = 0;

        for(int i =0; i<arr.length;i++){
            total += arr[i];
        }

        return (double)total/arr.length;
    }

    public static int[] lowestArrayAverage(int[][] arr){
        int lowestIndex = 0;
        double lowestAverage = Double.POSITIVE_INFINITY;;

        for(int i = 0; i < arr.length; i++){
            if(average(arr[i])<lowestAverage){
                lowestAverage = average(arr[i]);
                lowestIndex = i;
            }
        }
        return arr[lowestIndex];
    }

    public static String minMaxTemp(int[][] weatherArr){
        int minTemp = weatherArr[0][0];
        int maxTemp = weatherArr[0][0];
        String unseenTempsMessage = "";
        String finalOutput = "";
        Set<Integer> uniqueTemps = new HashSet<>();
        Set<Integer> unseenTemps = new HashSet<>();
        for(int[] weeklyTemps : weatherArr) {
            for (int temp : weeklyTemps) {
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                if (temp < minTemp) {
                    minTemp = temp;
                }
                if (!uniqueTemps.contains(temp)) {
                    uniqueTemps.add(temp);
                }
            }
        }
        for(int temp = minTemp+1;temp<maxTemp;temp++){
            if(!uniqueTemps.contains(temp)){
                unseenTemps.add(temp);
            }
        }
        Iterator<Integer> unseenItr = unseenTemps.iterator();
        while(unseenItr.hasNext()){
            unseenTempsMessage += "Never saw temperature: " + (unseenItr.next()) + " ";
        }

        finalOutput += "High: "+maxTemp + " Low: "+minTemp + " " + unseenTempsMessage;

        return finalOutput;
    }
    public static String tally(List<String> arrayList){
        HashMap<String, Integer> votes = new HashMap<>();
        String winner = "";
        int mostVotes = 0;

        for (String str : arrayList) {
            if(!votes.containsKey(str)){
                votes.put(str,1);
            }else{
                votes.put(str,votes.get(str)+1);
            }
            if(votes.get(str)>mostVotes){
                winner = str;
                mostVotes = votes.get(str);
            }
        }
        System.out.println(winner);
        System.out.println(mostVotes);

        return winner + " received the most votes!";
    }


}

































