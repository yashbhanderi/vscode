#? Total 6 data types:
#* Numbers
#* Boolean
#* Strings
#* Arrays
#* Hashes
#* Symbols


#? Numbers

# According to their size, there are two types of integers, 
# one is Bignum and second is Fixnum

# distance = 0.1
# time = 9.87 / 3600
# speed = distance/time

# puts ("speed of light is  #{speed} kmph ") = 36.474164133738604 <---- 14 digits precision

# a = 2**3    # power of a number

# a = 20.49

# puts a.abs()
# puts a.floor()
# puts a.ceil()
# puts a.round()

# puts Math.sqrt(36)

#? Type Conversion

# puts 10/7   # if both integer => integer
# puts 10/7.0     # if any one is bigger => Result is bigger data type i.e. float here




#####################################################

#? Boolean : true, false

# if true
#     puts "It's true"
# else 
#     puts "It's false"
# end

# if nil or false <--- nil == NULL
#     puts "It's true"
# else 
#     puts "It's false"
# end


#####################################################

#? strings

# str = "Stranger Things"
 
# puts str
# puts str.upcase()
# puts "yash".upcase()
# puts str.downcase()
# puts str.length()
# puts str.include? ""  # check if this part is in the sting..empty = true

# # one type of array..access char with [index]
# puts str[0]
# puts str[0,3]  # index [0,1,2] Not 3

# puts str.index("S")  # Return index of first find


# str = "    Starnger  Things   "
# puts str.strip()  # Remove blank spaces from front and back

# White Spaces

# def a(u)
#   return 1
# end
#
# a = 4
# b = 2
#
# puts(a / b)       # Works as a/b
# puts(a b)         # Works as a(b) <-- Function calling


################# Program BLOCK ########################

# SECOND 2)
# puts("this is main program body")

# LAST 3)
# END {
#   puts("This is END block")
# }

# FIRST 1)
#
# BEGIN {
#   puts("This is beginning block")
# }




