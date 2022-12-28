# Prcatical 4-1
# echo Enter First Number
# read num1
# echo Enter Second Number
# read num2
# echo Addition = `expr $num1 + $num2`
# echo Substraction = `expr $num1 - $num2`
# echo Multiplication = `expr $num1 \* $num2`
# echo Divison = `expr $num1 / $num2`

# Prcatical 4-2
# echo Enter Number = 
# read num1 
# if [ $(( $num1 % 2 )) == 0 ]
# then echo This Number is Even
# else echo This Number is Odd
# fi

# Prcatical 4-3
# echo How many Prime Numbers Do you want to Print = 
# read num 
# echo First $num prime Numbers are :-
# i=2 
# count=1
# while [ $count -le $num ] 
#     do 
#         j=2 flag=0 
#         while [ $j -lt $i ] 
#             do  
#                 if [ $(($i % $j)) -eq 0 ] 
#                     then flag=1 
#                     break 
#                 fi 
#                 j=$(($j + 1)) 
#             done 
#         if [ $flag = 0 ] 
#             then echo $i 
#             count=$(($count + 1)) 
#         fi 
#         i=$(($i + 1)) 
#     done 

# Prcatical 4-4
# n=0 
# while [[ $n -ne 5 ]] 
#     do 
#         echo Menu:-
#         echo "1. Display Calender." 
#         echo "2. Display Date & Time." 
#         echo "3. Display Your Name." 
#         echo "4. Display Your Terminal Number." 
#         echo "5. Exit" 
#         read n 
#             case $n in 
#                     1)cal;; 
#                     2)date;; 
#                     3)echo Enter X Position : -
#                         read x 
#                         x=$(($x+3)) 
#                         echo Enter Y Position: -
#                         read y 
#                         clear 
#                         printf "%s%${x}s\n" "*" "yash" 
#                         for((i=1;i<y;i++)) 
#                             do 
#                                 printf "%s\n" " " | tr " " "*" 
#                             done 
#                         temp=$( tput cols ) 
#                         printf "${temp}s" " " | tr " " "*" 
#                         x=$(( $x-3 )) 
#                         echo hear X=$x : Y=$y;; 
#                     4)echo Your Terminal Number is $$;; 
#                     5)exit;; 
#                     )echo Incorrect Choice;; 
# esac
# done

# Prcatical 4-5
# echo "(Three Subject Marks Out of 100)" 
# echo "Enter Marks Here: -" 
# read m1 
# read m2 
# read m3
# sum1=`expr $m1 + $m2 + $m3` 
# per=`expr $sum1 / 3` 
# echo "Your Marks Total is: " $sum1 
# echo "Percentage is:"$per 
# if [ $per -ge 60 ];     then echo Congratulations! You have passed with Distinction... 
# elif [ $per -ge 50 ];   then echo You got First class. 
# elif [ $per -ge  40 ];  then echo You got Second class. 
# else echo You have failed. 
# fi

# Practical-6
# echo "a. All executable files. "
# find -executable
# echo
# echo
# echo "b. All directories."
# ls -d /
# echo 
# echo 
# echo "c. All zero size files."
# find -type f -size 0 

# Practical-7
# echo Enter Date String :-
# read str 
# date -d "$str" +"%d-%b-%Y" 

# Practical-8
# echo "Enter a String:"
# read str
# echo
# len=`echo $str | wc -c`
# len=`expr $len - 1`
# i=1
# j=`expr $len / 2`
#     while test $i -le $j
#         do
#             k=`echo $str | cut -c $i`
#             l=`echo $str | cut -c $len`
#         if test $k != $l
#             then
#                 echo "String is not palindrome"
#                 exit
#         fi
# i=`expr $i + 1`
# len=`expr $len - 1`
# done
# echo "String is palindrome"

# Practical 9
echo -n "Enter a number: "
read number
factorial=1
for(( i=1; i<=number; i++ ))
do
  factorial=$[ $factorial * $i ]
done
echo "The factorial of $number is $factorial"

