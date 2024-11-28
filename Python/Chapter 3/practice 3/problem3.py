name="This is a test string with double  spaces."

print(name.find("  "))




def detect_double_space(s):
    if "  " in s:
        return True
    return False

# Example usage
input_string = "This is a  test string with  double spaces."
if detect_double_space(input_string):
    print("Double space detected!")
else:
    print("No double spaces found.")
