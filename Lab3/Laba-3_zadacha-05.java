public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Enter the number of rows: ");
        int numRows = scan.nextInt();
 
        String[] arrayOfRows = new String[numRows];
 
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.next();
            arrayOfRows[i] = row;
        }
 
        String[] latWords = new String[numRows];
        for (int i = 0; i < numRows; i++){
            if (arrayOfRows[i].matches("[a-z]")){
                latWords[i] = arrayOfRows[i];
            }
        }
    }
}