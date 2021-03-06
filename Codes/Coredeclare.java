package datatypes;

import java.util.*;
import services.*;
import exceptionhandle.*;

public class Coredeclare {
    public static Map<String, Integer> inttype_map = new HashMap<String, Integer>();
    public static Map<String, String> stringtype_map = new HashMap<String, String>();
    public static Map<String, Double> doubletype_map = new HashMap<String, Double>();
    Set<Character> deli = new HashSet<Character>();
    public void declare(String dec) {
        
        try{
			FinalException.checkSemicolon(dec);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.exit(0);
		}
        //////////////////////////////////////////////
        
        deli.add(' ');
        deli.add(';');
        deli.add('=');
        Set<String> dt_set = new HashSet<String>(); 
        dt_set.add("ekdoteen"); 
        dt_set.add("lafzonmein");
        dt_set.add("dhaiaksharpremke");  
        Corescope scope=new Corescope();       
        String datatype="";
        String var="";
        String assign;
        int ind;
        int flag=0;
        dec=dec.trim();
        if(dec.contains("=")) {
            flag=1;
        }
        int i=0;
        while(i<dec.length() &&  !deli.contains(dec.charAt(i))){
            datatype+=dec.charAt(i);
            //System.out.println(deli.contains(dec.charAt(i))+"#"+dec.charAt(i));
            i++;
        }
        
        ind=i;
        assign=dec.substring(ind+1);
        assign = assign.trim();
        i++;
        System.out.println(assign);


        //////////////////////////////////////////////////////

        while(i<dec.length() && !deli.contains(dec.charAt(i))){
            var+=dec.charAt(i);
            i++;
        }
        var=var.trim();
        //////////////////////////////////////////////////////////
        try{
            FinalException.checkDeclare(var);
            }
            catch(Exception e){
                System.out.println("-----------------------------7654321987654q23456787654wdwfghjdviu yhdchebdc---------"+e.toString());
                System.exit(0);
                // return;
            }

        if(dt_set.contains(datatype)) {
            if(datatype.charAt(0)=='e') {
              
              
                System.out.println("$$"+var);
                inttype_map.put(var, 0);
                scope.Enterscope(var);
                if(flag==1) {
                    Coreassign.coreassign(assign);
                }
            }
            if(datatype.charAt(0)=='l'){
              
               
                System.out.println("$$"+var);
                stringtype_map.put(var," ");
                scope.Enterscope(var);
                if(flag==1){
                    Coreassign.coreassign(assign);
                }
            }
            if(datatype.charAt(0)=='d'){
               
                System.out.println("$$"+var);
                doubletype_map.put(var,0.00);
                scope.Enterscope(var);
                if(flag==1){
                    Coreassign.coreassign(assign);
                }   
            }
        }
    }
}

