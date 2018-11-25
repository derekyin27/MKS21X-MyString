    public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i  = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
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


}
