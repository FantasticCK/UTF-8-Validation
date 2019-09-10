package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public boolean validUtf8(int[] data) {
        int count = 0;
        for(int i=0;i<data.length;i++){
            if(count==0){
                if((data[i]&128)==0) count = 0;
                else if((data[i]&224)==192) count = 1;
                else if((data[i]&240)==224) count = 2;
                else if((data[i]&248)==240) count = 3;
                else return false;
            }
            else{
                if((data[i]&192)==128)
                    count--;
                else return false;
            }
        }
        return count==0;
    }
}