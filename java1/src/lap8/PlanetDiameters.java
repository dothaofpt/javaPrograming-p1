package java1.src.lap8;
import java.util.*;
public class PlanetDiameters {
    //mảng chứa tên hành tinh trong Hệ mặt trời
    private static final String[] names= {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
    //đường kính của các hành tinh
    private static final float[] diameters={4800f,12103.6f,12756.3f,6794f,142984f,120536f,51118f,49532f,2274f};
    public static void main(String[] args) {
        //Use Map to store planets’ names and their corresponding
        //diameters.
        //tạo 1 object từ HashMap() để lưu trữ thông tin về tên+đk của các hành tinh
        Map planets = new HashMap();

        // Add items (key , value) to the map: thêm cặp với key-tên,value-đk
        for (int i = 0; i < names.length; i++)
            planets.put(names[i], diameters[i]);

        // Traverse the map
        Iterator it = planets.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println("--------------------");

        // Find a planet by name basing on key
        while (true) {
            System.out.print("Find planet (ENTER to quit): ");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) break;

            if (!planets.containsKey(name))
                System.out.println("Planet " + name + " not found!");
            else
                System.out.println("The diameter of " + name +
                        " is " + planets.get(name));
        }
    }

    }
