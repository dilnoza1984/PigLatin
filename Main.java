class Main {
  public static void main(String[] args) {
    
    System.out.println(pigLatin ("Java is fun"));
     System.out.println(pigLatin ("How many languages do you speak"));
  }

  public static String  pigLatin(String str){
    String[]newStr =str.split(" ");
    for(int i=0; i < newStr.length;i++){
      newStr[i] = newStr[i].substring(1)+newStr[i].charAt(0)+ "ay";
   }
    return String. join(" " ,newStr);
  }
} 