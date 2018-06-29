

package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Teste2 {
	public static void main (String args[]) {
            Vector v = new Vector(Arrays.asList(args));
            Iterator i2 = v.iterator();
            Enumeration e = v.elements();
            
            ArrayList l = new ArrayList(Arrays.asList(args));
            Iterator i = l.iterator();
            Enumeration e2 = 
                    new IteratorEnumeration(l.iterator());
               
	}
}
