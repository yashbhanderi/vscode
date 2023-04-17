#
# var_a = "10"
# var_b = "20"
#
# puts ("value of a + b is " + var_b)
#
# puts "Yash\nBhanderi" # new line escapse char

# [a-z] or _	Local Variable

# @	Instance Variable : their values are local to specific instances of an object.

# @@	Class Variable : It is available across different OBJECTS, Just like static variables

# $	Global Variable : It is available across different CLASSES


class Product

  ### Class Variables
  @@purchased = 0

  # Singleton Method
  class << self
    ["@@purchased"].each do |class_variable|
      define_singleton_method(class_variable.gsub("@","")) do
        eval class_variable
      end
    end
  end

  ### Instance Variables
  attr_accessor :id, :name, :price

  def initialize(_id, _name, _price)
    @id = _id
    @name = _name
    @price = _price
  end

  def get_product_details()
    puts("Id: " + @id.to_s)
    puts("Name: " + @name.to_s)
    puts("Price: " + @price.to_s)
  end
end

p1 = Product.new(101, "P1", 2000)
p2 = Product.new(102, "P2", 4000)

puts("Product 1\n")
puts(p1.id)
puts(p1.name)
puts(p1.price)

puts("\nProduct 2\n")
puts(p2.id)
puts(p2.name)
puts(p2.price)

Product.purchased

