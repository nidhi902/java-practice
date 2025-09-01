public class String_builder {
    public static void main(String[] args) {
        //string builder is an class
        //declaration of sb
        StringBuilder sb=new StringBuilder("niya");
        System.out.println(sb);

        //char at fun
        // for(int i=0;i<=sb.length(); i++){
        //     System.out.println(sb.charAt(i));

        // }

        //set char at in index means updation

       sb.setCharAt(0,'p');
       System.out.println("after updation "+ sb);

       //insert function
       sb.insert(3,'s');
       System.out.println(sb);

       //delete function
       sb.delete(2, 3); //include 2 ind but not 3 ind
       System.out.println(sb);

       //append meand end me add kr dena
       sb.append('h');
       System.out.println(sb);
    }
}
