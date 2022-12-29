# a = 10

# if a>5
#     puts "Greater than 5"
# end

# if a>10
#     puts "Greater than 5"
# else 
#     puts "Less than 10"
# end

# a = 2

# if a<3
#     puts "Greater than 3"
# elsif a<5
#     puts "Greater than 5"
# elsif a<7
#     puts "Greater than 7"
# else
#     puts "Greater than 10"
# end

    

# a = (10=="ten") ? "true" : "false"

# puts a 

#############################

# switch case

day_name = nil

def get_day(day)
    case day
    when "sun"
        day_name = "Sunday"
    when "mon"
        day_name = "Monday"
    when "tue"
        day_name = "Tuesday"
    when "wed"
        day_name = "Wednesday"
    when "thu"
        day_name = "Thursday"
    when "fri"
        day_name = "Friday"
    when "sat"
        day_name = "Saturday"
    else 
        day_name = "Enter valid data"
end

return day_name
end

puts get_day("sat")
puts get_day("dog")
