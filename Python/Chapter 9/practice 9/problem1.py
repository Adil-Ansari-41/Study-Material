with open("poem.txt") as f:
    content = f.read()
    if("twinkle" in content):
        print("Twinkle is present in poem")

    else:
        print("The word Twinkle is not present in poem")
