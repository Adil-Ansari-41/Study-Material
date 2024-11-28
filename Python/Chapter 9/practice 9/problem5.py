words = ["donkey", "extraordinary", "buried", "penchant", "donk", "legend"]

with open("04_file.txt", "r") as f:
    content = f.read()
    content = content.lower()

    for word in words:
        new_content = content.replace(word, "#" *len(word))

with open("04_file.txt", "w") as f:
    f.write(new_content)