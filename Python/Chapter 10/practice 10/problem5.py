from random import randint

class Train:
      def __init__(self, trainNo):
            self.trainNo= trainNo

      def book(self, fro ,to):
            print(f"Ticket is booked in train No : {self.trainNo} from {fro} to {to}")

      def getStatus(self):
            print(f"Train No: {self.trainNo} is running on time")

      def getFare(self, fro , to):
            print(f"Ticket Fare in train No : {self.trainNo} from {fro} to {to} is {randint(2222, 5555)}")
                             


t = Train(74776)
t.book("Mumbai", "Delhi")
t.getStatus()
t.getFare("Mumbai", "Delhi")
