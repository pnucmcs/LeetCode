class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }else{
            int[] result;
            if(digits.length==1 && digits[0] ==9)
                result = new int[digits.length+1];
            else if (digits.length >1 && digits[0] == 9 && digits[1] ==9 && digits[digits.length-1]==9)
                result = new int[digits.length+1];
            else
                result = new int[digits.length];

            result[digits.length-1]=(digits[digits.length-1]+1)%10;
            int rem=(digits[digits.length-1]+1)/10;
            for(int i =digits.length-2; i>=0; i--){
                result[i]=(rem+digits[i])%10;
                rem = (rem+digits[i])/10;
            }if(rem!=0){
                result[0]=rem;
            }
            return result;
        }
    }
}

/*
* public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a 4-digit number: ");
        int num = input.nextInt();
        int y = num;
        int num2 = 0;
        for( int i = 1; i<=4;i++){
            int x = num%10;
            num = num/10;
            num2 = num2*10 + x;
        }
        if(y == num2){
            //print the number is a palindrome.
            System.out.println(y +" is a palindrome");
        }else{
            //print the number is not a palindrome.
            System.out.println(y +" is not a palindrome");
        }
    }*/

/*long sum =0;
        long incr = 1;
        for(int i = digits.length-1; i>=0;i--){
            sum += incr*digits[i];
            incr = incr *10;
        }
        long newdigit = sum +1;
        int length = (int) (Math.log10(newdigit) + 1);
        int[] result = new int[length];
        for(int j = result.length-1; j>=0;j--){
            long k = newdigit%10;
            result[j]=(int)k;
            newdigit=newdigit/10;
        }
        return result;
    }*/