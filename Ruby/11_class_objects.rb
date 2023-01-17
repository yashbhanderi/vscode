class State
    public 

    attr_accessor :name, :code, :rank       # define variables

    def initialize(name, code, rank)        # constructor
        @name = name
        @code = code
        @rank = rank
    end

    def get_details
        puts ("This state is #{name}\nIt's code is #{code}\nIt's rank is #{rank}")
    end
end

obj1 = State.new("Gujarat", "GJ", 1)
obj2 = State.new("Maharashtra", "MH", 2)

puts obj2.get_details


module speak
    def speak(sound)
        puts ("They can speak like #{sound}")
end

class Human
end

class Animal
end

men = Human.new
tiger = Animal.new

# men.speak("Hello")
# tiger.speak("roar")




