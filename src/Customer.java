public class Customer {
    private String size, name;
    private Clothing[] items;
    public static final double tax_rate = 1.2;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int size) {
        switch (size) {

            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("X");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Clothing[] clothingItems) {
        for (Clothing clothingItem : clothingItems) {
            items = clothingItems;
        }
    }

    public Customer(String name, int size) {
        this.name = name;
        setSize(size);
    }

    public Clothing[] getItem() {
        return items;
    }

    public double getTotalClothing() {
        double total = 0.0;
        for (Clothing clothing : getItem()) {
            total += clothing.getPrice();
        }
        total *= tax_rate ;
        return total;
    }

    public void averageItemPrice(){
        int average = 0;
        int count = 0;
        double totalAverage = 0;
        for (Clothing item : getItem()){
            if (item.getSize().equals("L")){
                average += item.getPrice();
                count++;
            }
        }
        try {
            totalAverage = average/count;
            System.out.println(getName()+"'s average item price : R " +totalAverage);
        }catch (ArithmeticException e){
            System.out.println(getName()+" has no clothing items in their size ("+getSize()+")");
        }
    }



}
