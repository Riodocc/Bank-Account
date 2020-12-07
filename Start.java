import java.lang.*;
import java.util.*;
import java.io.*;
public class Start
{
    public static void main(String args[])
    {
        class FileReadWriteDemo
        {
            private File file;
            private FileWriter writer;
            private FileReader reader;
            private BufferedReader bfr;


            public void writeInFile(String s)
            {

                try
                {
                    file = new File("AccountRecords.txt");
                    file.createNewFile();
                    writer = new FileWriter(file, true);
                    writer.write(s+"\r"+"\n");
                    writer.flush();
                    writer.close();
                }
                catch(IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }

            public void readFromFile()
            {


                try
                {
                    reader = new FileReader(file);
                    bfr = new BufferedReader(reader);
                    String text="", temp;

                    while((temp=bfr.readLine())!=null)
                    {
                        text=text+temp+"\n"+"\r";
                    }

                    System.out.print(text);
                    reader.close();
                }
                catch(IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }

        }
        Account a[] =new Account[Customer.accounts.length];
        Customer c[]=new Customer[Bank.customers.length];
        Employee e[]=new Employee[Bank.employees.length];


        while(true){
            System.out.print("\n1.Customer Management \n2.Employee Management\n3.Account Transactions   \n4.Exit \n");
            System.out.println("Enter a choice: ");
            Scanner input = new Scanner(System.in);
            int f =input.nextInt();

            if(f==1){

                while(true){
                    System.out.print("\n1.Insert Customer \n2.Remove Customer \n3.Show All Customer  \n4. Exit \n");
                    System.out.println("Enter a choice: ");
                    Scanner inputn = new Scanner(System.in);
                    int ft =inputn.nextInt();
                    if(ft==4)
                        break;

                    if(ft==1)

                    {  a[1] = new Account();
                        System.out.println("Enter Account Number: ");
                        Scanner i = new Scanner(System.in);
                        int AcNum=i.nextInt();
                        a[1].setAccountNumber(AcNum);
                        System.out.println("Enter Account Balance: ");
                        Scanner j = new Scanner(System.in);
                        double balance =j.nextDouble();
                        a[1].setBalance(balance);

                        c[0] = new Customer();
                        System.out.println("Enter Customer Name: ");
                        Scanner in = new Scanner(System.in);
                        String name = in.nextLine();
                        c[0].setName(name);
                        System.out.println("Enter Customer ID: ");
                        Scanner it = new Scanner(System.in);
                        int nid =it.nextInt();
                        c[0].setNid(nid);
                        c[0].insertAccount(a[1]);


                        Bank b = new Bank();
                        b.insertCustomer(c[0]);


                    }


                    else if(ft==2){

                        System.out.print("Enter the Customer ID which you want to remove: ");
                        Scanner ind = new Scanner(System.in);
                        int nnid =ind.nextInt();

                        Bank g =new Bank();

                        g.removeCustomer(nnid);
                    }

                    else if(ft==3){
                        Bank d = new Bank();
                        d.showAllCustomers();
                    }

                    else if(ft==4)
                    {break;}

                    else
                        System.out.print("Invalid Option");



                }

            }

            else if(f==2)
            {

                while(true){
                    System.out.print("\n1.Insert Employee \n2.Remove Employee \n3.Show All Employee  \n4. Exit \n");
                    System.out.println("Enter a choice: ");
                    Scanner inputt = new Scanner(System.in);
                    int fg =inputt.nextInt();
                    if(fg==4)
                        break;

                    switch(fg)
                    {
                        case 1:


                            e[0] = new Employee();
                            System.out.println("Enter Employee Name: ");
                            Scanner inb = new Scanner(System.in);
                            String nam = inb.nextLine();
                            e[0].setName(nam);
                            System.out.println("Enter employee ID: ");
                            Scanner itb = new Scanner(System.in);
                            int nit =itb.nextInt();
                            e[0].setEmpId(nit);
                            System.out.println("Enter employee Salary: ");
                            Scanner itbn = new Scanner(System.in);
                            double sala =itbn.nextDouble();
                            e[0].setSalary(sala);



                            Bank b = new Bank();
                            b.insertEmployee(e[0]);


                            break;


                        case 2:

                            System.out.print("Enter the Employee ID which you want to remove: ");
                            Scanner indt = new Scanner(System.in);
                            int nnidt =indt.nextInt();

                            Bank g =new Bank();

                            g.removeEmployee(nnidt);
                            break;

                        case 3:
                            Bank d = new Bank();
                            d.showAllEmployees();
                            break;

                        case 4:
                            break;
                    }

                }

            }
            else if(f==3)
            {
                while(true)
                {
                    FileReadWriteDemo frwd = new FileReadWriteDemo();
                    System.out.print("\n1.Deposit \n2.Withdraw \n3. Exit \n");
                    System.out.println("Enter a choice: ");
                    Scanner inputtt = new Scanner(System.in);
                    int fgn =inputtt.nextInt();
                    if(fgn==1){
                        System.out.println("Enter your Balance: ");
                        String hjy="Enter your Balance: ";
                        Scanner pbn = new Scanner(System.in);
                        double nwt = pbn.nextDouble();
                        String pjn=Double.toString(nwt);


                        System.out.println("Enter Amount you want to deposit: ");
                        String klk="Enter Amount You want to deposit: ";
                        Scanner pb = new Scanner(System.in);
                        double nw = pb.nextDouble();
                        String pjk=Double.toString(nw);
                        frwd.writeInFile(hjy);
                        frwd.writeInFile(pjn);
                        frwd.writeInFile(klk);
                        frwd.writeInFile(pjk);
                        frwd.readFromFile();

                        Account t = new Account();
                        t.deposit( nwt, nw );




                    }
                    else if(fgn==2)
                    {
                        FileReadWriteDemo frw = new FileReadWriteDemo();
                        System.out.println("Enter your Balance: ");
                        String ptpp="Enter your Balance: ";
                        Scanner pbl = new Scanner(System.in);
                        double nwl = pbl.nextDouble();
                        String pj=Double.toString(nwl);

                        System.out.println("Enter Amount you want to withdraw: ");
                        String lnk="Enter Amount you want to withdraw: ";
                        Scanner pdn = new Scanner(System.in);
                        double nwn = pdn.nextDouble();
                        String pr=Double.toString(nwn);
                        frwd.writeInFile(ptpp);
                        frwd.writeInFile(pj);
                        frwd.readFromFile();
                        frwd.writeInFile(lnk);
                        frwd.writeInFile(pr);
                        frwd.readFromFile();
                        Account b =new Account();
                        b.withdraw( nwl , nwn);}

                    else if(fgn==3)
                    {break;}
                    else
                        System.out.print("Invalid Option");

                }
            }

        }
    }

}
