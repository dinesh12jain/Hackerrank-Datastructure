package DataStructure;

class Arraypractice {
    public static void main (String[] args){
       /* int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 3;
        arr[2]=87;
        for(int i=0; i<=arr.length;i++){
        System.out.println(arr[i]);*/
       String anything = "my name is dinesh jain, i am a student! o my god.";
       String delimeters = "[, .!]";
       int[] limit = {0,-1};
       for(int lim:limit){
           System.out.print("this is for:"+lim);
           String[] tokens = anything.split(delimeters, lim);
           for(String token:tokens){
               System.out.print(token);
           }
       }
   
}
}