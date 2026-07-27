import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of languages
        
        int n = sc.nextInt();
        ArrayList<String> languages= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            languages.add(sc.next());
        }
        
        Collections.sort(languages);
        
        System.out.println("First Language: "+languages.get(0));
        
        System.out.println("Last Language: "+languages.get(languages.size()-1));
                        
        sc.close();
    }
}

