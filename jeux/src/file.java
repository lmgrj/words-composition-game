

import java.io.*;

public class file
        {


public static void main ( String [] args ) {
    String fileName = "C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\niveau1";
  String mots[]=new String[38];

      mots=lirefile(fileName);
    for (int i=0;i<38;i++)
      System.out.println(" *********"+mots[i]);

    lirefile(fileName);

   
}
   public static String[] lirefile(String filName) {
       FileInputStream fis;
       BufferedReader br = null;
       String line="";
       String temp[]=new String[38];
       int i=0;
      try {
           fis = new FileInputStream(filName);
           InputStreamReader isr = new InputStreamReader(fis);
           br = new BufferedReader(isr);

           while ((line = br.readLine()) != null){
               System.out.println(line);
                temp[i]=line;
                i++;
           }
           
       } catch (IOException e) {
          System.out.println("Impossible d'ouvrir le fichier " + filName+ ".");
      }
       finally {
          try {
               if (br != null)
                  br.close();
          } catch (IOException e) {
              e.printStackTrace();
         }
    }
  return temp;
   }
            static int nbrphraseFichier(String nomFichier)  {
                String mot;
                int i=0;
                try {


                    BufferedReader entree = new BufferedReader(new FileReader(nomFichier));
                    do {
                        mot = entree.readLine();
                        i++;
                    } while (mot != null);
                }catch (IOException e) {
                    System.out.println("   "+i);
                }
                return i-1;
            }

        }
