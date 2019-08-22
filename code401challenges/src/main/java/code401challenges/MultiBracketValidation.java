package code401challenges;

import java.util.ArrayList;

public class MultiBracketValidation {

    public static boolean bracketValidation(String stringToValidate){
        int numberOfCharacters = stringToValidate.length();

        ArrayList<String> openingBracketList = new ArrayList<>();
        ArrayList<String> closingBracketList = new ArrayList<>();

        // go through each character in the string
        // first check type of bracket
        // if current type is same as previous type, then append to the temp
        // else transform temp, if needed, add temp to the list and start a new temp

        // if number of items in the lists do not match, RETURN false
        // compare items at the same indexes to each other
            // if they match, keep going
            // else RETURN false
        // if you get to the end RETURN true

        StringBuilder temp;
        temp = new StringBuilder();
        String currentType;
        String previousType = "opening";

        listBuilder:
        for (int i=0; i<=numberOfCharacters; i++){

            // on the last loop add temp, if it exists, to the appropriate list
            if (i == numberOfCharacters){
                if (temp.equals("")){
                    break listBuilder;
                } else if (previousType == "opening"){
                    openingBracketList.add(temp.toString());
                } else if (previousType  == "closing"){
                    closingBracketList.add(temp.toString());
                }
                break listBuilder;
            }

            char currentCharacter = stringToValidate.charAt(i);
            currentType = checkBracketType(currentCharacter);

            // if the the current type of bracket matches the previous type, then add to the temp string
            if (currentType.equals(previousType)){
                //System.out.println("current matches previous");
                if (currentType.equals("opening")){
                    temp.append(transformOpeningBracket(currentCharacter));
                } else {temp.append(currentCharacter);}


            } else { // types of previous and current don't match, then add the temp string to the appropriate arraylist
                if (previousType == "opening"){
                    openingBracketList.add(temp.reverse().toString());
                } else if (previousType  == "closing"){
                    closingBracketList.add(temp.toString());
                }

                previousType = currentType;
                temp = new StringBuilder();
                if (currentType.equals("opening")){
                    temp.append(transformOpeningBracket(currentCharacter));
                } else {temp.append(currentCharacter);}
            }
        }

        System.out.println("opening brackets:");
        for (String bracketGroup:openingBracketList) {
            System.out.println(bracketGroup);
        }

        System.out.println("closing brackets:");
        for (String bracketGroup:closingBracketList) {
            System.out.println(bracketGroup);
        }

        System.out.println(checkArrays(openingBracketList, closingBracketList));
        return checkArrays(openingBracketList, closingBracketList);

    }

    public static boolean checkArrays(ArrayList openingList, ArrayList closingList){
        if (openingList.size() != closingList.size()){
            return false;
        }

        for (int i=0; i<closingList.size(); i++){
            System.out.println(openingList.get(i) + ", " + closingList.get(closingList.size() - i - 1));
            if (!openingList.get(i).equals(closingList.get(closingList.size() - i - 1))){
                return false;
            };
        }
        return true;
    }

    public static String checkBracketType(char character){
        if (character == ('(') || character==('[') || character==('{')){
            return "opening";
        } else if (character==(')') || character==(']') || character==('}')){
            return "closing";
        } else return "other";
    }

    public static char transformOpeningBracket(char openingBracket){
        if (openingBracket == '(') {
            return ')';
        } else if (openingBracket == '[') {
            return ']';
        } else if (openingBracket == '{') {
            return '}';
        }
        return 'X';
    }

}
