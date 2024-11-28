# # Dictionary of Hindi words with their English translations
# hindi_to_english = {
#     'नमस्ते': 'Hello',
#     'धन्यवाद': 'Thank you',
#     'कृपया': 'Please',
#     'सुप्रभात': 'Good morning',
#     'शुभ रात्रि': 'Good night',
#     'मुझे माफ करें': 'Sorry',
#     'हाँ': 'Yes',
#     'नहीं': 'No',
#     'आपका नाम क्या है?': 'What is your name?',
#     'मुझे समझ में नहीं आया': 'I don’t understand'
# }

# def lookup_word(word):
#     # Look up the word in the dictionary
#     return hindi_to_english.get(word, 'Translation not found')

# def main():
#     print("Welcome to the Hindi-English Dictionary!")
    
#     while True:
#         print("\nOptions:")
#         print("1. Look up a Hindi word")
#         print("2. Exit")
        
#         choice = input("Enter your choice (1 or 2): ")
        
#         if choice == '1':
#             hindi_word = input("Enter a Hindi word: ")
#             translation = lookup_word(hindi_word)
#             print(f"The English translation is: {translation}")
#         elif choice == '2':
#             print("Exiting the dictionary. Goodbye!")
#             break
#         else:
#             print("Invalid choice. Please enter 1 or 2.")

# if __name__ == "__main__":
#     main()


words = {
    "pani":"Water",
    "kursi":"Chair",
    "garam":"Hot"
}

word = input("Enter the word you want meaning of: ")

print(words[word])
