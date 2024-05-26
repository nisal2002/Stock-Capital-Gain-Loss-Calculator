import java.util.*;
class Queue {
    QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(double key) { //method to add key to queue
        QNode temp = new QNode((int) key); //create a new LL node
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;

    }

    void dequeue() { //method to remove key from queue
        if (this.front == null) //if queue is empty
            return;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Queue sharesQ = new Queue(); //open queue for store input shares
        Queue unitpriceQ = new Queue(); //open queue for store unit price
        Queue profitLossQ = new Queue(); //open queue for store profit or loss

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("How many times did you buy shares?");
            if(sc.hasNextInt()){
                int countBuy = sc.nextInt();
                if (countBuy>=1){
                    do { //code run until countBuy=0
                        System.out.println("How many shares did you buy at one time?");
                        int x = sc.nextInt();
                        sharesQ.enqueue(x); //insert shares in to queue

                        System.out.println("What is the unit price($) of those " + x + " shares?");
                        double y = sc.nextDouble();
                        unitpriceQ.enqueue(y); //insert unit price in to queue

                        --countBuy;

                    } while (countBuy != 0);

                    while (true){
                        System.out.println("How many shares did you sell?");
                        if(sc.hasNextInt()){
                            int x = sc.nextInt();
                            if(x>0){
                                System.out.println("What is the unit price($) of those " + x + " shares?");
                                double y = sc.nextDouble();

                                double z = y;

                                do {
                                    int sharesQindex = ((sharesQ.front != null) ? (sharesQ.front).key : -1); //get the first index of sharesQ
                                    if (x >= sharesQindex) {
                                        x = x - sharesQindex;
                                        sharesQ.dequeue(); //remove the front of sharesQ

                                        double unitpriceQindex = ((unitpriceQ.front != null) ? (unitpriceQ.front).key : -1); //get the first index of unitpriceQ
                                        y = y - unitpriceQindex;
                                        unitpriceQ.dequeue(); //remove the front of unitpriceQ

                                        double profitLoss = sharesQindex * y; //get the profit or loss by multiplying the first index of sharesQ and buy unit price
                                        profitLossQ.enqueue(profitLoss); //then enqueue above value to profitLossQ

                                        y = z; //convert the x value -> insert x value. without this line, the value of y will decrease due to the loop

                                    } else {
                                        sharesQ.dequeue();
                                        sharesQindex = sharesQindex - x;
                                        sharesQ.enqueue(sharesQindex);

                                        int unitpriceQindex = ((unitpriceQ.front != null) ? (unitpriceQ.front).key : -1);
                                        y = y - unitpriceQindex;

                                        double profitLoss = x * y;
                                        profitLossQ.enqueue(profitLoss);

                                        y = z;

                                        double capitalGain = 0; //in here until profitLossQ become null, get the sum of the whole elements
                                        while (profitLossQ.front != null) {
                                            double profitLossQindex = ((profitLossQ.front != null) ? (profitLossQ.front).key : -1);
                                            capitalGain = capitalGain + profitLossQindex;
                                            profitLossQ.dequeue();

                                        }
                                        System.out.println("The capital gain in this case : $" + capitalGain);
                                        break;
                                    }
                                } while (x != 0);
                                break;
                            }else {
                                System.out.println("Error : Integer must be greater than or equal to 0.");
                            }
                        }else{
                            System.out.println("Error : Input must be an Integer.");
                            sc.next();
                        }
                    }
                    break; //if this line not in this code, it returns to the line : 40 and run again from there
                }else {
                    System.out.println("Error : Integer must be greater than 0.");
                }
            }else{
                System.out.println("Error : Input must be an Integer.");
                sc.next();
            }
        }
    }
}