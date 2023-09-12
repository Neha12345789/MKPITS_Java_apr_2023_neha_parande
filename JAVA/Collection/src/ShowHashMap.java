//
//import java.util.*;
//import java.util.Map.Entry.*;
//
//public class ShowHashMap {
//    HashMap<Integer, String> hashMap = new HashMap();
//
//    public void SortHashMap() {
//
//
//        hashMap.put(10, "Neha");
//        hashMap.put(40, "Mrunali");
//        hashMap.put(30, "Trupti");
//        hashMap.put(20, "Teju");
//        hashMap.put(60, "Bhagyashri");
//        hashMap.put(45, "Pradhnya");
//        Set set = hashMap.entrySet(); //return the set of object
//        System.out.println(hashMap);
//
//
//        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
//        System.out.println(treeMap);
//
//        Set set1 = treeMap.entrySet();
//        Iterator iterator1 = set1.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
//
//        Iterator iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        List<Map.Entry<Integer, String>> list = new LinkedList<>(hashMap.entrySet());
//        boolean order ;
//        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
//            @Override
//            public int compare(Map.Entry<Integer, String> object1, Map.Entry<Integer, String> object2) {
//                if (!order) {
//                    return object1.getValue().compareTo(object2.getValue());
//
//                } else {
//                    return object1.getValue().compareTo(object1.getValue());
//                }
//            }
//            Map <Integer, String> sortedMap= new LinkedHashMap<Integer,String>();
//
//
//        }
//}
//
//
//
//
//
//
//
//
//
//
