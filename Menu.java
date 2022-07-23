
package Com;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Naviank
 */
public class Menu {
    
    public int int_getChoice(ArrayList options) {
        int n = options.size();
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "-" + options.get(i));
        } 
        System.out.print("Please choose an option from 1 to " + n + ": ");
        int response = MyLibs.inputInt();
        return response;
    }
    
        public Brand ref_getChoice(ArrayList options) {
            int response, n = options.size();
            do {
                response = int_getChoice(options);
            }
            while (response < 0 || response > n);
            return (Brand) options.get(response - 1);
        }
}
