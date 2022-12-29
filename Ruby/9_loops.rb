# a = 5

################################################

# WHILE LOOP

# while a<10
#     puts a
#     a += 1
# end

################################################

# FOR LOOP

arr = [1,2,3,4,5]

for e in arr
    print (e.to_s + " ")
end

arr.each do |e|     # e is just a name for traversing elements
    print "#{e**e} "
end 

for e in 0..6       # range [0, 6] Both included
    print "#{e} "
end

6.times do |e|     # start from 0, till 6; means 0,1,2,3,4,5
    print "#{e-1} "
end 

puts 

arr.size.times do |e|
    print (arr[e].to_s + " ")
end
