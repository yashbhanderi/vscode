arr = [1,2,3,4]

begin
    a = 10 / 0
rescue 
    puts "Division by zero error"
end

begin
    a = 10 / 0
rescue => exception 
    puts exception
end

begin
    # puts arr["dog"]  
    a = 10/0
rescue TypeError => exception
    puts exception 
rescue ZeroDivisionError => exception
   puts exception  
end

