import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{
    public static List<Integer> reverseArray(List<Integer> a) 
    {
    // Write your code here
      
    int l=a.size();
    List<Integer> b= new ArrayList<Integer>();
    for(int i=0;i<l;i++)
    {
        b.add(i,a.get(l-1-i));
    }
    return b;
      
    //Code lines 19-15 is the only logic I wrote
    //The other part of code will be provided in hackerrank
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//KEERTHANA
