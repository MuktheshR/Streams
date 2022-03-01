import java.util.*;
import java.util.stream.Collectors;


class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Streamsq1 {
//1. Display the fruit names of low calories fruits,
//i.e. calories < 100 sorted in descending order of calories.
    public static List<Fruit> reverseSort (ArrayList<Fruit> fruits) {
           		fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(p->System.out.println("Caloroies less than 100 "+p));
				return fruits;
    }

//2. Display color wise list of fruit names.
    public static ArrayList<Fruit> sort (ArrayList<Fruit> Fruitscolor) {
           		Fruitscolor.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(p-> System.out.println(p.getColor()+" "+ p.getName()));
                return Fruitscolor;
    }
//3.Display only RED color fruits sorted as per their price in ascending order.
    public static ArrayList<Fruit> filterRedSortPrice (ArrayList<Fruit> redfruits){
            	 redfruits.stream()
                .filter(p->p.getColor().equals("Red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(t-> System.out.println("Red colour only  "+t));
                return redfruits;
    }

    public static void main(String[] args) {
      
        ArrayList<Fruit>fruitsobj = new ArrayList<>();
        fruitsobj.add( new Fruit("mango",70,50,"Yellow"));
        fruitsobj.add(new Fruit("Apple",80,80,"Red"));
        fruitsobj.add(new Fruit("Banana",110,40,"Yellow"));
        fruitsobj.add( new Fruit("Pear",100,30,"Yellow"));
        fruitsobj.add(new Fruit("Grapes",60,50,"Green"));
        reverseSort( fruitsobj);
        sort(fruitsobj);
        filterRedSortPrice(fruitsobj);

    }

}
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//
// class Streams {
//	private String name;
//    private int calories;
//    private int price;
//    private String color;
//    
//	public Streams(String name, int calories, int price, String color) {
//		super();
//		this.name = name;
//		this.calories = calories;
//		this.price = price;
//		this.color = color;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getCalories() {
//		return calories;
//	}
//
//	public void setCalories(int calories) {
//		this.calories = calories;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	@Override
//	public String toString() {
//		return "Streams [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
//	}
// }
//	public  class Assignment5Q1{
//		
//	
//	public static void main(String[] args) {
//		Streams f1 = new Streams("apple",150,35,"Red");
//		Streams f2 = new Streams("orange",40,85,"orange");
//		Streams f3 = new Streams("watermelon",100,50,"GreenRed");
//		Streams f4 = new Streams("Grapes",80,80,"green");
//		Streams f5 = new Streams("custardapple",70,200,"Greenwhite");
//		ArrayList<Streams> Fruits = new ArrayList<Streams>();
//		Fruits.add(f1);
//		Fruits.add(f2);
//		Fruits.add(f3);
//		Fruits.add(f4);
//		Fruits.add(f5);
//		
//		Fruits.stream()
//	    .filter(p -> p.getCalories()<100)
//	    .sorted(Comparator.comparing(Streams::getCalories))
//	    .forEach(p-> System.out.println("Caloroies less than 100 "+p));
//		System.out.println("$$$$$$");
//		Fruits.stream()
//		.forEach(p-> System.out.println(p.getColor()+" "+ p.getName()));
//		System.out.println("$$$$$$");
//		Fruits.stream()
//		.filter(t-> t.getColor().equals("Red"))
//		.sorted(Comparator.comparing(Streams::getColor))
//		.forEach(t-> System.out.println("Red colour only  "+t));
//					}		
//}
