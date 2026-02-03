import java.util.Scanner;



class PriceException extends Exception {
    public PriceException(String msg) {
        super(msg);
    }
}

class QtyException extends Exception {
    public QtyException(String msg) {
        super(msg);
    }
}



class DemoUnCheck {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter no of books:");
            BookDetails[] b =
                    new BookDetails[Integer.parseInt(sc.nextLine())];

            int i = 0;

            while (i < b.length) {
                try {
                    System.out.println("Enter code:");
                    String code = sc.nextLine();

                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter price:");
                    float price = Float.parseFloat(sc.nextLine());

                    if (price < 0) {
                        throw new PriceException("Price can't be negative");
                    }

                    System.out.println("Enter quantity:");
                    int qty = Integer.parseInt(sc.nextLine());

                    if (qty < 0) {
                        throw new QtyException("Quantity can't be negative");
                    }

                    b[i++] = new BookDetails(code, name, price, qty);
                }
                catch (PriceException | QtyException ob) {
                    System.out.println(ob.getMessage());
                }
            }

            System.out.println("\nBook Details:");
            for (BookDetails temp : b) {
                System.out.println(temp);
            }

        }
        catch (Exception ob) {
            System.out.println(ob);
        }
        finally {
           System.out.println("Execution completed.");
        }
    }
}
