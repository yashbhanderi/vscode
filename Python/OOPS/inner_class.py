class Student:

    def __init__(self, name, rollno, lap_name, lap_cpu, lap_ram):
        self.name = name
        self.rollno = rollno
        self.lap = self.Laptop(lap_name, lap_cpu, lap_ram)

    def show_data(self):
        print(self.name, self.rollno)
        self.lap.show_data()

    class Laptop:

        def __init__(self, lap_name, lap_cpu, lap_ram):
            self.brand = lap_name
            self.cpu = lap_cpu
            self.ram = lap_ram

        def show_data(self):
            print(self.brand, self.cpu, self.ram)


s1 = Student("Yash", 7, "HP", "i7", "16 GB")
s2 = Student("Dhruv", 8, "Lenovo", "i5", "8 GB")

s1_lap = s1.lap
print(s1_lap.brand)
s1.show_data()
s2.show_data()
