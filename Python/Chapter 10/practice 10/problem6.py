from random import randint

class Train:
      def __init__(slf, trainNo):
            slf.trainNo= trainNo

      def book(slf, fro ,to):
            print(f"Ticket is booked in train No : {slf.trainNo} from {fro} to {to}")

      def getStatus(slf):
            print(f"Train No: {slf.trainNo} is running on time")

      def getFare(slf, fro , to):
            print(f"Ticket Fare in train No : {slf.trainNo} from {fro} to {to} is {randint(2222, 5555)}")
                             


t = Train(74776)
t.book("Mumbai", "Delhi")
t.getStatus()
t.getFare("Mumbai", "Delhi")