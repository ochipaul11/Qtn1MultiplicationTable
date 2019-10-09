public class MultiplicationTable {

    int multiplicationNumber;
    int rangeFrom ;
    int rangeTo;


    public MultiplicationTable(int multiplicationNumber, int rangeFrom, int rangeTo) {
        this.multiplicationNumber = multiplicationNumber;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public void printTable(){
        int  [] range = new int[rangeTo-rangeFrom];

        for(int i=0;i<range.length;i++){

            range[i] = rangeFrom;

            System.out.print(multiplicationNumber+" * "+rangeFrom +" = " );
            System.out.println(" : " + multiplicationNumber*range[i]);
            rangeFrom++;
        }
        System.out.println();
    }

}
