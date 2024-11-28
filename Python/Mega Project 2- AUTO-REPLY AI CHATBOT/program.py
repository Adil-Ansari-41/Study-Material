import pyautogui
import pyperclip
import time

# Ensure pyautogui failsafe is enabled
pyautogui.FAILSAFE = True

# Function to copy selected text to a variable
def copy_selected_text():
    # Click at the specified coordinates
    pyautogui.click(x=1245, y=1045)

    # Pause briefly to ensure the click is registered
    time.sleep(0.5)

    # Move to the starting point of the drag
    pyautogui.moveTo(x=665, y=163)

    # Hold down the mouse button to start the drag
    pyautogui.mouseDown()

    # Drag to the end point
    pyautogui.moveTo(x=670, y=932, duration=1)

    # Release the mouse button to finish the drag
    pyautogui.mouseUp()

    # Copy the selected text (Ctrl+C)
    pyautogui.hotkey('ctrl', 'c')
    pyautogui.click(x=670, y=932)

    # Pause briefly to ensure the clipboard operation is complete
    time.sleep(0.5)

    # Get the text from the clipboard
    text = pyperclip.paste()

    return text

# Call the function and store the copied text in a variable
copied_text = copy_selected_text()
print(copied_text)
