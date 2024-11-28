import speech_recognition as sr
import webbrowser
import pyttsx3 
import videoLibrary
import requests
from openai import OpenAI
from config import api_key, news_api

recognizer = sr.Recognizer()
engine = pyttsx3.init()
news_api = news_api


def speak(text):
    engine.say(text)
    engine.runAndWait()

def aiProcess(command):
    client = OpenAI(
         api_key=api_key,
    )

    completion = client.chat.completions.create(
        model="gpt-4o-mini",
        messages=[
            {"role": "system", "content": "You are a virtual assistant named jarvis skilled in general task like Alex and Google Cloud"},
            {
                "role": "user",
                "content": command
            }
            ]
            )
    return completion.choices[0].message.content

def processCommand(c):
    if "open google" in c.lower():
        webbrowser.open("https://google.com")

    elif "open facebook" in c.lower():
        webbrowser.open("https://facebook.com")
    
    elif "open youtube" in c.lower():
        webbrowser.open("https://youtube.com")

    elif "open linkedin" in c.lower():
        webbrowser.open("https://linkedin.com")    

    elif c.lower().startswith("play"):
        video = c.lower().split(" ")[1]
        link = videoLibrary.vid[video]
        webbrowser.open(link)

    elif "news" in c.lower(): 
        r = requests.get(f"https://newsapi.org/v2/top-headlines?country=uin&apiKey={news_api}")  
        if r.status_code == 200:
         # Parse the JSON Response
         data = r.json()
    
         # Extract headlines
         headlines = [article['title'] for article in data['articles']]
    
         # Print the headlines
         for idx, headline in enumerate(headlines):
            speak(f"{idx + 1}. {headline}")
        else:
            speak(f"Failed to retrieve news: {r.status_code}")

    else :
        # let openAI handle the request
        output = aiProcess(c)
        speak(output)





if __name__ == "__main__":
    speak("Intializing Jarvis...")
    while True:                
        # Listen for the wait word "Jarvis"

        # obtain audio from the microphone
        r = sr.Recognizer()

        print("recognizing...")
        # recognize speech using google
        try:
            with sr.Microphone() as source:
                print("Listening...")
                audio = r.listen(source, timeout=2, phrase_time_limit=1)
            word = r.recognize_google(audio)
            if(word.lower() == "jarvis"):
                speak("Ya")
                #Listen for commmand
                with sr.Microphone() as source:
                    print("Jarvis Active...")
                    audio = r.listen(source, timeout=2, phrase_time_limit=1)
                    command = r.recognize_google(audio)

                    processCommand(command)
        except Exception as e:
            print("Error; {0}".format(e))                                      