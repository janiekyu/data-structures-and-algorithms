package code401challenges.Graph;

public class GetEdge {

    public static String travelPossible (Node[] desiredPath){
        int cost = 0;
        for (int i=0; i<desiredPath.length-1; i++){
            Node current = desiredPath[i];
            Node next = desiredPath[i+1];

            if (current.neighbors.containsKey(next)==false){
                //System.out.println("Itinerary not possible");
                return "False, $0";
            } else{
                cost = cost + (int) current.neighbors.get(next);
                //System.out.println("$"+cost);
                }
        }

        return "True, $" + cost;
    }


}
