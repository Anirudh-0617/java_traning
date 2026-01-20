interface Icomparable{
    int compare(int a, int b);
}
class Greater implements Icomparable{
    public int compare(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
class Smaller implements Icomparable{
    public int compare(int a , int b){
        if(a<b)
            return a;
        else
            return b;
    }
}
class Main{
    public static void main(String[] args){
        System.out.println(new Greater().compare(56,45));
        System.out.println(new Smaller().compare(47,52));
    }
}
