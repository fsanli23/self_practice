package practice11_17_20;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class withoutDublicate {
    public static void main(String[] args) {



        String  name="fatih sanli";
        nondublicate(name);
    }












  public static void nondublicate(String word) {
      String temp = "";
      for (int i = 0; i <= word.length() - 1; i++) {
          if (!temp.contains("" + word.charAt(i))) {
              temp += word.charAt(i);
          }


      }
      System.out.println(temp);
  }
}
