package com.lambton;




import java.util.*;

public class CollectionFrameworkExample
{

    public static void main(String[] args)
    {
       /* ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
        mStringArrayList.add("A");
        mStringArrayList.add("A");

       // System.out.println(mStringArrayList);
        int i;
        for(i=0;i<=mStringArrayList.size()-1;i++)
        {
            System.out.println(mStringArrayList.get(i));
        }

        Set<String> mySet = new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("USA");
        mySet.add("Canada");

        System.out.println(mySet);
        mySet.add("India");
        System.out.println(mySet);

        Map<String,String> stringMap= new HashMap<>();
        stringMap.put("IND","India");
        stringMap.put("CAD","Canada");
        stringMap.put("USA","United States");
        stringMap.put("PAK","Pakistan");
        System.out.println(stringMap);

        stringMap.put("CAD","New Canada");
        System.out.println(stringMap);*/

        Map<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> myArray= new ArrayList<>();
        myArray.add("abc");
        myArray.add("cab");
        myArray.add("bac");
        myArray.add("cat");
        myArray.add("tac");
        myArray.add("atc");
        myArray.add("mate");
        myArray.add("atem");
        myArray.add("pop");
        myArray.add("pat");
        myArray.add("123");
        myArray.add("231");
        myArray.add("431");

        for(String s: myArray)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            ArrayList<String> arrayList = hm.get(key);
            if(arrayList == null)
            {
                arrayList= new ArrayList<>();
            }
            arrayList.add(s);
            hm.put(key,arrayList);
        }
        System.out.println(hm);





/*

        Map<String, ArrayList<String>> strMap = new HashMap<>();
        ArrayList<String>  mIndArrayList = new ArrayList<>();
        mIndArrayList.add("Himachal");
        mIndArrayList.add("Punjab");
        mIndArrayList.add("Bengal");
        strMap.put("India", mIndArrayList);
        ///-------
        ArrayList<String>  mUSArrayList = new ArrayList<>();
        mUSArrayList.add("New Jersy");
        mUSArrayList.add("Texas");
        mUSArrayList.add("California");
        mUSArrayList.add("Alaska");
        strMap.put("USA", mUSArrayList);
        ///-------
        ArrayList<String>  mCandrrayList = new ArrayList<>();
        mCandrrayList.add("Ontario");
        mCandrrayList.add("British Columbia");
        mCandrrayList.add("Qubec");
        strMap.put("Canada", mCandrrayList);
        System.out.printf(String.valueOf(strMap));
*/














//        String a[]={"abc","cab","cat",""}







    }
}
