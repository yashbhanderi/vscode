# practical-1
# FILE="/root/File1"
# if [ -e "$FILE" ]
#     then
#         echo "$FILE file_path exists."
# fi
# if [ -x "$FILE" ]
#     then
#         echo "You have permission to execute $FILE"
#     else
#         echo "You don't have permission to execute $FILE"
# fi

#practical-2

# function file_count()
# {
#     local  NUMBER_OF_FILE=$(ls -l | wc -l)
#     echo "$NUMBER_OF_FILE"
# }
# file_count

#practical-3

# echo "Enter Four Integers : "
# read a b c d
# sum=$(echo "$a + $b + $c + $d" | bc -l)
# average=$(echo "$sum/4" | bc -l)
# product=$(echo "$a * $b * $c * $d" | bc -l)
# echo Sum=$sum
# echo Average=$average
# echo Product=$product

#practical-4

# echo Enter Value of x:
# read x
# echo Enter Value of y:
# read y
# echo Values before swapping:
# echo x=$x
# echo y=$y
# echo Values after swapping:
# x=$(echo "$x + $y" | bc -l)
# y=$(echo "$x - $y" | bc -l)
# x=$(echo "$x - $y" | bc -l)
# echo x=$x
# echo y=$y

# practical-5

# echo Enter a 6 digit number:
# read value
# n=2
# while [ $n -le 6 ]
# do
# a=$(echo "$value" | cut -c $n)
# echo $a
# n=$(echo "$n + 2" | bc -l)
# done

#practical-6

# echo Enter three numbers:
# read a b c;
# if [ $a -gt $b ] && [ $a -gt $c ]
#     then
#     echo $a is max.
# elif [ $b -gt $a ] && [ $b -gt $c ]
#     then
#     echo $b is max.
# else
#     echo $c is max.
# fi

# practical-7

# echo Enter main string:
# read main
# l1=$(echo $main | wc -c)
# l1=$(expr $l1 - 1)
# echo Enter sub string:
# read sub
# l2=$(echo $sub | wc -c)
# l2=$(expr $l2 - 1)
# n=1
# m=1
# pos=0
# while [ $n -le $l1 ]; do
#     a=$(echo $main | cut -c $n)
#     b=$(echo $sub | cut -c $m)
#     if [ $a = $b ]; then
#         n=$(expr $n + 1)
#         m=$(expr $m + 1)
#         pos=$(expr $n - $l2)
#         r=$(expr $m - 1)
#         if [ $r -eq $l2 ]; then
#             break
#         fi
#     else
#         pos=0
#         m=1
#         n=$(expr $n + 1)
#     fi
# done
# echo Position of sub string in main string is $pos

# practical-8

# echo Enter a 7 digit number
# read num
# n=1
# while [ $n -le 7 ]; do
#     a=$(echo $num | cut -c $n)
#     echo $a
#     n=$(expr $n + 2)
# done

# practical-9

# echo Enter a text
# read text
# w=$(echo $text | wc -w)
# w=$(expr $w)
# c=$(echo $text | wc -c)
# c=$(expr $c - 1)
# s=0
# alpha=0
# j=$()
# n=1
# while [ $n -le $c ]; do
#     ch=$(echo $text | cut -c $n)
#     if test $ch = $j; then
#         s=$(expr $s + 1)
#     fi
#     case $ch in
#     a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | t | u | v | w | x | y | z) alpha=$(expr $alpha + 1) ;;
#     esac
#     n=$(expr $n + 1)
# done
# special=$(expr $c - $s - $alpha)
# echo Words=$w
# echo Characters=$c
# echo Spaces=$s
# echo Special symbols=$special

# practical-10

echo "Enter Number "
read num
c=0
x=$num
echo "Enter the digit whose occurance has to be found "
read digit
while [ $num -ne 0 ]; do
    rem=$(expr $num % 10)
    if [ $rem -eq $digit ]; then
        c=$(expr $c + 1)
    fi
    num=$(expr $num / 10)
done
echo "No of  Occurance of "$digit " is "$c"  times"

