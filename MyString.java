    public class MyString implements CharSequence, Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i  = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
    if (index < 0 || index > data.length)
    throw new
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String toString(){
    String result = "";
    for (int i = 0; i < data.length; i++){
      result += data[i];
    }
    return result;
  }
  public CharSequence subSequence(int start, int end){
    String finals = "";
    for (int i = start; i < end; i++){
      finals += data[i];
    }
    return finals;
  }



public static void main(String[] args){
  MyString str = new MyString("yeet");
  System.out.println(str.charAt(3));//should print "t"
  System.out.println("Should print t");
  System.out.println(str.length());//should print 4
  System.out.println("should print 4");
  System.out.println(str);
  System.out.println("Should print yeet")
  System.out.println(str.subSequence(1,3));
  System.out.println("Should print ee");
}

}
