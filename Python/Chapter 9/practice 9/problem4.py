with open("04_file.txt", "r") as f:
    content = f.read()
    content = content.lower()
    word = "donkey"
    new_content = content.replace(word, "######")

with open("04_file.txt", "w") as f:
    f.write(new_content)