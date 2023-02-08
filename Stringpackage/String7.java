package Stringpackage;
//K.Srikar
//210303126121
//19 division
public class String7 {
    //EqualsIgnoreCaseExample{

    public static void main(String args[]){
        String s1="srikar";
        String s2="srikar";
        String s3="SRIKAR";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}