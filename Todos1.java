
    // Adding an item trong ArrayList java
    //Có thể biết kích thươcs của 1 mảng nhờ method TenMang.size();
    // lấy ra chỉ mục của ArrayList bằng tenMang.get(chỉ mục);
    import java.util.ArrayList;

    class ToDos1 {
        
      public static void main(String[] args) {
        
        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Water plants";
        // Add more to-dos here:
        String toDo2="Buon";
        String toDo3="vui";
        // Add to-dos to toDoList
        
        toDoList.add(toDo1);
            toDoList.add(toDo2);
        toDoList.add(toDo3);
    
        System.out.println(toDoList);
          
        
      }
      
    }
