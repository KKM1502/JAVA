package com.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;


public class Data {


	public final static String CREDIT = "C:\\class\\code\\java\\TeamProject\\dat\\신용카드\\카드상품.txt";
	public final static String CREDIT_D = "C:\\class\\code\\java\\TeamProject\\dat\\신용카드\\신용카드D\\신용카드";
	public final static String DEBIT ="C:\\class\\code\\java\\TeamProject\\dat\\체크카드\\체크카드데이터.txt";
	public final static String DEBIT_D ="C:\\class\\code\\java\\TeamProject\\dat\\체크카드\\체크카드D\\체크카드";
	public final static String SAVINGS ="C:\\class\\code\\java\\TeamProject\\dat\\적금\\적금상품데이터.txt";
	public final static String LOAN="C:\\class\\code\\java\\TeamProject\\dat\\대출\\대출 데이터.txt";
	public final static String CUSTOMER = ".\\dat\\회원\\회원 정보(더미데이터).txt";
	public final static String MANAGER = ".\\dat\\회원\\관리자정보.TXT";
   
	public static ArrayList<Customer> customerlist;
	public static ArrayList<Manager> managerlist;
	public static ArrayList<Credit> creditlist;
	public static ArrayList<Credit> credit_d;
	public static ArrayList<Debit> debitlist;
	public static ArrayList<Debit> debit_d;

	
	static {
		creditlist = new ArrayList<Credit>();
		credit_d= new ArrayList<Credit>();
		debitlist = new ArrayList<Debit>();
		debit_d = new ArrayList<Debit>();
		customerlist = new ArrayList<Customer>();
	    managerlist = new ArrayList<Manager>();


		}
	
	
	public static int creditLength() {
		int count = 0;
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Data.CREDIT));
			String line =null;
			
			while((line=reader.readLine()) !=null) {
				count++;
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return count;
	}
	public static int debitLength() {
		int count = 0;
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Data.DEBIT));
			String line =null;
			
			while((line=reader.readLine()) !=null) {
				count++;
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return count;
	}
	
	public static void loadCredit() {
		
			try {
				BufferedReader reader = new BufferedReader(new FileReader(Data.CREDIT));

				
				String line =null;
				while((line=reader.readLine()) !=null) {
					String[] temp = line.split(",");
					
					//텍스트 1줄 > Member 객체 1개 
					Credit c = new Credit(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
					creditlist.add(c);
				}
				
				reader.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		
	}
	public static void loadCreditD(String input) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Data.CREDIT_D+input+".txt"));
			String line =null;
			while((line=reader.readLine()) !=null) {
				Credit cd = new Credit(line);
				credit_d.add(cd);
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	public static void loadDebit() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Data.DEBIT));
	
			
			String line =null;
			while((line=reader.readLine()) !=null) {
				String[] temp = line.split(",");
				
				//텍스트 1줄 > Member 객체 1개 
				Debit d = new Debit(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]);
				debitlist.add(d);
			}
		
			reader.close();
		
		} catch (Exception e) {
		e.printStackTrace();
		}
	
		
	}
	
	public static void loadDebitD(String input) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(Data.DEBIT_D+input+".txt"));
			String line =null;
			while((line=reader.readLine()) !=null) {
				Debit dd = new Debit(line);
				debit_d.add(dd);
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

	public static void checkload() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Data.SAVINGS));
			String line = null;
			int count = 0;
			
			while ((line = reader.readLine()) != null) {
				String temp[] = line.split(",");
				count++;
				
			}
			System.out.println(count);
			reader.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
   public static void loadManager () {
	      
	      try {
	      
	         BufferedReader reader = new BufferedReader(new FileReader(Data.MANAGER));
	         
	         String line = null;
	         
	         while ((line = reader.readLine()) != null) {
	            
	            String[] temp = line.split(",");
	            
	            //텍스트 1줄 > Member 객체 1개
	            Manager m = new Manager(temp[0], temp[1], temp[2]);
	            
	            managerlist.add(m);
	         
	      }
	      
	      reader.close();
	      
	      } catch (Exception e) {
	      e.printStackTrace();
	      }
	   }
	   
	   
   public static void loadCustomer() {
   
      try {
      
         BufferedReader reader = new BufferedReader(new FileReader(Data.CUSTOMER));
         
         String line = null;
         
         while ((line = reader.readLine()) != null) {
            
            String[] temp = line.split(",");
            
            //텍스트 1줄 > Member 객체 1개
            Customer m = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9], temp[10], temp[11], temp[12], temp[13], temp[14], temp[15]);
            
            customerlist.add(m);
         
      }
      
      reader.close();
      
      } catch (Exception e) {
    	  e.printStackTrace();
      }
   }
	   
   
		
}
