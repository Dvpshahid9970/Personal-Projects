package Student_Manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("\nWELCOME TO STUDENT MANAGEMENT APP\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c;

		try {

			do {
				System.out.println("Press  1 -> ADD Student  \nPress  2 -> DISPLAY Student  \nPress  3 -> DELETE Student  \nPress  4 -> UPDATE Student  \nPress  5 -> EXIT");
				c = Integer.parseInt(br.readLine());
				if (c == 1) {
					// add

					System.out.println("Enter Student Name");
					String name = br.readLine();
					System.out.println("Enter Student Contact");
					String contact = br.readLine();
					System.out.println("Enter Student City");
					String city = br.readLine();

					StudentDetail st = new StudentDetail(name, contact, city);
					Boolean ans = StudentDao.inseretDB(st);
					if (ans) {
						System.out.println("Successfully Added...\n");
					} else {
						System.out.println("Not Added...\n");
					}
					
				} else if (c == 2) {
					// display
					StudentDao.displayDB();
					
				} else if (c == 3) {
					// delete
					System.out.println("Enter Student Id");
					int userid = Integer.parseInt(br.readLine());
					Boolean ans = StudentDao.deleteDB(userid);
					if (ans) {
						System.out.println("Deleted Successfully...\n");
					} else {
						System.out.println("Not Deleted...\n");
					}
				} else if (c == 4) {
					// update.
					System.out.println("Enter Name for Update");
					String name = br.readLine();
					System.out.println("Enter Student Id");
					int id = Integer.parseInt(br.readLine());
					Boolean ans = StudentDao.UpdateDB(name, id);
					if (ans) {
						System.out.println("Updated Successfully....\n");
					} else {
						System.out.println("Not Updated...\n");
					}
				}
			} while (c < 5);
			System.out.println("Thanks for using APP");
		} catch (IOException e) {
			System.out.println("e.getmessage()");

		}
	}
}
