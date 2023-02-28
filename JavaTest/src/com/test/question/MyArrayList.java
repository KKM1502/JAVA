package com.test.question;

public class MyArrayList {

   private String[] list; //����
   private int index; //******************** ���ΰ�!!! > ���� �����Ͱ� �� ���ȣ
   
   public MyArrayList() {
      this.index = 0;
   }
   
   public boolean add(String value) {
      
      if (this.index == 0) {
         this.list = new String[4];
      }
      
      doubling();
         
      this.list[this.index] = value;
      this.index++;
      
      return true;
   }
   
   private void doubling() {
      
      //���� ���� ������?
      if (this.index == this.list.length) {
         
         //���� �迭�� 2��
         String[] temp = new String[this.list.length * 2];
         
         //���� ����
         for (int i=0; i<this.list.length; i++) {
            temp[i] = this.list[i]; //1:1
         }
         
         //���� �迭�� ��ü
         list = temp;
         
      }
      
   }

   public int size() {
      
      return this.index;      
   }
   
   public String get(int index) {
      
      if (index < 0 || index >= this.index) {
         throw new IndexOutOfBoundsException();
      }
      
      return this.list[index];                  
   }
   
   public String set(int index, String value) {
      
      if (index < 0 || index >= this.index) {
         throw new IndexOutOfBoundsException();
      }
      
      String old = this.list[index]; //������
      
      this.list[index] = value; //���ο� ������ ��ü > ����
      
      return old;
   }
   
   public String remove(int index) {
      
      if (index < 0 || index >= this.index) {
         throw new IndexOutOfBoundsException();
      }
      
      String old = this.list[index];
      
      for (int i=index; i<this.index; i++) {
         this.list[i] = this.list[i+1];
      }
      
      this.index--;
      
      return old;
   }
   
   public boolean add(int index, String value) {
      
      if (index < 0 || index >= this.index) {
         throw new IndexOutOfBoundsException();
      }
      
      for (int i=this.size()-1; i>=index; i--) {
         this.list[i+1] = this.list[i];
      }
      
      this.list[index] = value;
      
      this.index++;
      
      return true;
   }
   
   public int indexOf(String value) {
      
      for (int i=0; i<this.index; i++) {
         if (this.list[i].equals(value)) {
            return i;
         }
      }
      
      return -1;      
   }
   
   public int indexOf(String value, int fromIndex) {
      
      for (int i=fromIndex; i<this.index; i++) {
         if (this.list[i].equals(value)) {
            return i;
         }
      }
      
      return -1;      
   }
   
   public int lastIndexOf(String value) {
      
      for (int i=this.index-1; i>=0; i--) {
         if (this.list[i].equals(value)) {
            return i;
         }
      }
      
      return -1;
   }
   
   public int lastIndexOf(String value, int fromIndex) {
      
      for (int i=fromIndex; i>=0; i--) {
         if (this.list[i].equals(value)) {
            return i;
         }
      }
      
      return -1;
   }
   
   public boolean contains(String value) {
      
      for (int i=0; i<this.index; i++) {
         if (this.list[i].equals(value)) {
            return true;
         }
      }
      
      return false;      
   }
   
   public void clear() {
      
//      for (int i=0; i<this.index; i++) {
//         this.list[i] = null;
//      }
//      
//      this.index = 0;
      
      
      
      //this.list = new String[4];
      
      //this.index = 0;
      
      
      
      this.index = 0;
      
   }
   
   public void trimToSize() {
      
      String[] temp = new String[this.index];
      
      for (int i=0; i<this.index; i++) {
         temp[i] = this.list[i];
      }
      
      this.list = temp;
      
   }
   
  
   
}
