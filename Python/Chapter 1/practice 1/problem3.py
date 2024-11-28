import os

def print_directory_contents(directory):
    try:
        # Get list of files and directories in the specified directory
        contents = os.listdir(directory)
        
        # Print each item in the directory
        for item in contents:
            print(item)
    except FileNotFoundError:
        print(f"Directory '{directory}' not found.")
    except PermissionError:
        print(f"Permission denied to access directory '{directory}'.")

# Example usage:
directory_path = '/'  # Replace with the path of your directory
print(f"Contents of directory '{directory_path}':")
print_directory_contents(directory_path)
