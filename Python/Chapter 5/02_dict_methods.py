marks = {
    "Zaid":89,
    "umar":49,
    "faiz":75,
    1:"ali"
}

print(marks.items())
print(marks.keys())
print(marks.values())
marks.update({"Zaid":88})
marks.update({"Rehan":67})
print(marks)
print(marks.get("umar"))


print(marks.get("umar2"))  #prints None
# print(marks["umar2"])     #Return an error

l = len(marks)
print(l)