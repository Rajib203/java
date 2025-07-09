public class present_Tech {
    public static void main(String[] args) {
        String mainstring="University of Technology";
        String subString="Tech";

        int position=mainstring.indexOf(subString);

        if(position!=-1)
        {
            System.out.println("substring present in position " +position);
        }
        else{
            System.out.println("Not present");
        }
    }
}
