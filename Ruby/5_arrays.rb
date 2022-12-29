# In Ruby, numbers, strings, etc all are primitive types but arrays are of objects type 
# i.e arrays are the collection of ordered, integer-indexed objects which can be store number, integer, string, hash, symbol, objects or even any other array.

##############################################################################

# Creation of an array

arr = Array.new()
 
# size of array
arr2 = Array.new(7)
 
# size of array & element of array
arr3 = Array.new(4, "GFG")   # all initialize with GFG

# Using Literal Constructor []

arr4 = Array[1,9,'A',"Yash"]

# displaying the size of arrays
puts arr.size
puts arr2.length
puts arr3.size
puts arr4.size


# displaying array elements
puts "#{arr3}"
puts "#{arr4}"


# Accesing the array elements

puts arr4[3]

puts arr4[-1]   # 0,1,2,3
# -4, -3, -2, -1    Negative index means start from back

print arr4[0, 3]    # starts from 0 till 2; 3 not included

arr4.size.times do |e|
    print (arr[e].to_s + " ")
end

# Different methods

puts arr4.include? "Yash"
print arr4.reverse

arr4[2] = 0
arr4[3] = 8

print arr4.sort

