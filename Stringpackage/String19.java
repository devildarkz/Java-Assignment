package Stringpackage;
//K.Srikar
//210303126121
//19 division
public class String19 {
    // SplitExample{
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}
