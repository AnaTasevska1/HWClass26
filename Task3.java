package HWClass26;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

            ArrayList<String> uniqueObj = new ArrayList<>();
            uniqueObj.add("Single");
            uniqueObj.add("Unique");
            uniqueObj.add("Special");
            uniqueObj.add("Object");
            uniqueObj.add("Print");

            String concat = "";

            for (String uni : uniqueObj) {
                concat = concat + uni;
            }
            System.out.println(concat);
        }
    }
/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
