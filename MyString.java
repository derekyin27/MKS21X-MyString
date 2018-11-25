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
    throw new IndexOutOfBoundsException();
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
    if (start < 0 || end < 0 || end > this.length())
    throw new IndexOutOfBoundsException();
    String finals = "";
    for (int i = start; i < end; i++){
      finals += data[i];
    }
    return finals;
  }

public int compareTo(CharSequence chrs){
  int min = 0;// seeing which CharSequence has the least amount of chars
  if (chrs.length() == this.length())
  min = chrs.length();
  if (chrs.length() < this.length())
  min = chrs.length();
  if (chrs.length() > this.length())
  min = this.length();
  for (int i = 0; i < min; i++){
    if (this.charAt(i) != chrs.charAt(i))
    return this.charAt(i) - chrs.charAt(i);// if the chars at the position of i are not equal, return the difference
  }
return 0;
}


public static void main(String[] args){
  MyString str = new MyString("yeet");//testing constructor
  System.out.println(str.charAt(3));//should print "t"
  System.out.println("Should print t");
  System.out.println(str.length());//should print 4
  System.out.println("should print 4");
  System.out.println(str);// testing toString
  System.out.println("Should print yeet");
  System.out.println(str.subSequence(1,3));//testing CharSequence
  System.out.println("Should print ee");
  MyString str2 = new MyString("hello world");
  System.out.println(str.compareTo(str2));//testing compareTo
  System.out.println("yeet".compareTo("hello world"));//this should print the same thing as the other compareTo

}

}
