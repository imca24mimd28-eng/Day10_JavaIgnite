public class BankingSystem {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Account Balance: ");
	            double balance = sc.nextDouble();

	            System.out.print("Enter Withdrawal Amount: ");
	            double withdraw = sc.nextDouble();

	            if (withdraw < 0) {
	                throw new RuntimeException("Invalid Withdrawal Amount");
	            }

	            if (withdraw > balance) {
	                throw new InsufficientBalanceException("Insufficient Balance");
	            }

	            balance = balance - withdraw;

	            System.out.println("Withdrawal Successful");
	            System.out.println("Remaining Balance: " + balance);
	        }

	        catch (InputMismatchException e) {
	            System.out.println("Invalid Input");
	        }

	        catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}

	    
