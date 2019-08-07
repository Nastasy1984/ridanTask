import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RidanTestTask {
    public static Boolean checkTemplate(String template, String symbols){
        //two simple tests
        if (template.equals(symbols)){
            return true;
        }
        if (template.length() > symbols.length()){
            return false;
        }

        //making string array from template
        String[] templArr = template.split("");

        //making string arrayList from symbols
        ArrayList<String> symbArr = new ArrayList<String>();
        symbArr.addAll(Arrays.asList(symbols.split("")));

        //checking
        Iterator <String> symbIterator;
        boolean flag;

        for (String i: templArr){
            flag = false;
            symbIterator = symbArr.iterator();
            while(symbIterator.hasNext()){
                String tmp = symbIterator.next();
                if (tmp.equals(i)){
                    flag = true;
                    symbIterator.remove();
                    break;
                }
            }
            //if symbol was not founded
            if (false == flag){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //testing
        System.out.println(checkTemplate(",", "зор..//,"));
        System.out.println(checkTemplate(",зi", "зор..ugi,"));
        System.out.println(checkTemplate("арбуз", "зубра"));
        System.out.println(checkTemplate("арбузик", "зубра"));
        System.out.println(checkTemplate("арбузик ", "арбузик "));
        System.out.println(checkTemplate("арбуз ", "арбуз"));
        System.out.println(checkTemplate("", ""));
    }
}
